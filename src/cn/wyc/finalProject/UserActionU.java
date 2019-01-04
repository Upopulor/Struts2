package cn.wyc.finalProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.util.TokenHelper;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

public class UserActionU extends ActionSupport implements ModelDriven<User> {
	private IUserService service = new UserServiceImpl();
	private User user = new User();
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	//多条件查询
	private String isUpload;
	public String sayfindUserByCondition() {
		//特殊的条件是isUpload，他有三种情况，1请选择-忽略此情况 2有简历-只查询有简历的 3无简历-查询无简历的
		users = service.findByCondition(user.getUserName(), user.getSex(), user.getEducation(), isUpload);
		return SUCCESS;
	}
	//编辑用户
	public String sayedit() {
		//1判断用户是否重新选择了文件
		if(upload == null) {
			//就用原来的
			User duser = service.findUserById(user.getUserID());
			//由于没有选择文件，user模型的filename和path属性是null,需要用查出来的用户里的值替换
			user.setFilename(duser.getFilename());
			user.setPath(duser.getPath());
			int res1 = service.modifyUser(user);
			if(res1 > 0) {
				return SUCCESS;
			}
		}else {
			//用户重新选择了
			//1文件保存的路径
			String realPath = ServletActionContext.getServletContext().getRealPath("/files");
			String dir = generateChildPath(realPath);
			//2 生成带有随机性的文件名
			String fileName = TokenHelper.generateGUID()+"_"+uploadFileName;//HHDJH234234_fileName没有横岗，不会像uuid一样，在JavaScript中，字符串相减成NAN
			//3 把user中缺少的部分填进去
			user.setPath(dir);
			user.setFilename(fileName);//保存的文件名必须是带有GUID的文件名，下载的时候要用
			service.saveUser(user);
			//4 上传文件操作
			upload.renameTo(new File(realPath+File.separator+dir,fileName));
			//5 保存用户
			int res = service.modifyUser(user);
			if(res>0) {
				return SUCCESS;
			}
		}
		return null;
	}
	//显示编辑页面
	public String sayeditUI() {
		//user对象赋值
		user = service.findUserById(user.getUserID());
		//把user对象压入栈顶.这里如果压入，就会写入下面的一个user，不是栈顶那一个 数据会读不出来
		ValueStack vs = ActionContext.getContext().getValueStack();
		vs.push(user);
		return SUCCESS;
	}
	//删除用户
	public String saydelete() {
		int res = service.removeUser(user.getUserID());
		if(res>0) {
			return SUCCESS;
		}
		return null;
	}
	//文件下载
	private InputStream input;
	private String oldFileName;//原始文件名
	public String saydownload() throws Exception {
		//1获取用户信息
		User dbuser = service.findUserById(user.getUserID());
		//2文件存放地址
		String realPath = ServletActionContext.getServletContext().getRealPath("/files");
		//给原始文件名赋值
		oldFileName = dbuser.getFilename().substring(dbuser.getFilename().indexOf("_")+1);
		//3给一个字节输入流赋值
		input = new FileInputStream(realPath+File.separator+dbuser.getPath()+File.separator+dbuser.getFilename());
		//4返回成功
		//5交给stream结果视图
		return SUCCESS;
	}
	//查看用户详细信息
	public String sayfindById() {
		//user对象赋值
		user = service.findUserById(user.getUserID());
		//把user对象压入栈顶.这里如果压入，就会写入下面的一个user，不是栈顶那一个 数据会读不出来
		ValueStack vs = ActionContext.getContext().getValueStack();
		vs.push(user);
		return SUCCESS;
	}
	//查询所有用户
	private List<User> users;
	public String sayfindAll() {
		users = service.findAllUser();
		return SUCCESS;
	}
	//用户添加
	//保存文件的file
	private File upload;
	private String uploadFileName;
	public String sayadd() {
		//1文件保存的路径
		String realPath = ServletActionContext.getServletContext().getRealPath("/files");
		String dir = generateChildPath(realPath);
		//2 生成带有随机性的文件名
		String fileName = TokenHelper.generateGUID()+"_"+uploadFileName;//HHDJH234234_fileName没有横岗，不会像uuid一样，在JavaScript中，字符串相减成NAN
		//3 把user中缺少的部分填进去
		user.setPath(dir);
		user.setFilename(fileName);//保存的文件名必须是带有GUID的文件名，下载的时候要用
		service.saveUser(user);
		//4 上传文件操作
		upload.renameTo(new File(realPath+File.separator+dir,fileName));
		//5 保存用户
		int res = service.saveUser(user);
		if(res>0) {
			return SUCCESS;
		}
		return null;
	}
	//生成文件夹目录后缀名
	private String generateChildPath(String filePath) {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String dir = format.format(date);
		File file = new File(filePath,dir);
		if(!file.exists()) {
			file.mkdirs();
		}
		return dir;
	}
	//用户登录
	public String saylogin() {
		User dbUser = service.login(user.getLogonName(), user.getLogonPwd());
		if(dbUser == null) {
			addActionError("用户名或密码错误");
			return "input";
		}
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.setAttribute("user", dbUser);
		return SUCCESS;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public File getUpload() {
		return upload;
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public InputStream getInput() {
		return input;
	}
	public void setInput(InputStream input) {
		this.input = input;
	}
	public String getOldFileName() {
		return oldFileName;
	}
	public void setOldFileName(String oldFileName) {
		this.oldFileName = oldFileName;
	}
	public String getIsUpload() {
		return isUpload;
	}
	public void setIsUpload(String isUpload) {
		this.isUpload = isUpload;
	}
	
}

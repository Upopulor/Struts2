package cn.wyc.strutsRegist;

import org.apache.commons.lang3.StringUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class register1 extends ActionSupport implements ModelDriven<User>{
	//定义一个用户的数据模型，使用模型驱动，必须自己实例化
	private User user = new User();
	private IUserService us = new UserServiceImpl();
	@Override
	public User getModel() {
		return user;
	}
	/**
	 * 在Struts2的框架中也提供了一个MAp<表单的字段名，错误提示>
	 *  编程式验证
	 * 	1动作类必须继承ActionSupport
	 * 	2重新validate方法
	 * 
	 * validate方法会在动作方法执行之前进行验证
	 *  当重写了validate方法，它会对动作类中的所用动作方法进行验证。
	 *  解决验证所有动作方法的问题：
	 * 	第一种方式：
	 * 		使用@SkipValidation的注解
	 *       第二种方式：
	 *  	定义验证方法的名称：validate+动作名称  动作名称的首字符还要大写
	 * @return
	 */
//	public void validateRegister(){
//		if(StringUtils.isEmpty(user.getUsername())){
//			//存入错误信息，直接调用父类的addFieldError方法，存入错误信息。第一个参数是表单name属性的值。第二个参数是错误提示
//			addFieldError("username", "请输入用户名");
//		}
//	}
//	public void validate() {
//		if(StringUtils.isEmpty(user.getUsername())) {
//			//存入错误信息,直接调用父类的addFieldError存入错误信息，第一个参数是表单name属性值，第二个错误提示
//			addFieldError("username", "请输入用户名");
//		}
//	}
	public String sayRegister1() {
		//根据用户名获取数据库用户，判断对象是否存在
		User dbUser = us.findUserByName(user.getUsername());
		if(dbUser!=null) {
			return "exists";
		}
		int res = us.register(user);
		if(res > 0) {
			return SUCCESS;
		}
		return null;	
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}

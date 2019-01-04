package cn.wyc.upload;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 文件下载
 * @author xd
 */
public class download extends ActionSupport {
	private String filename;
	//在给inputStream指定名字时不能使用in
	private InputStream abc;
	public String sayDownload() throws FileNotFoundException {
		//1找到文件地址
		String realPath = ServletActionContext.getServletContext().getRealPath("/WEB-INF/files/5.jpg");
		//2把文件读到一个inputStream中
		abc = new FileInputStream(realPath);
		filename = "照片.pic";
		//3返回一个成功
		return SUCCESS;
		//4由一个叫stream的结果类型吧剩下的事情做完
	}
	public InputStream getAbc() {
		return abc;
	}
	public void setAbc(InputStream abc) {
		this.abc = abc;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
}

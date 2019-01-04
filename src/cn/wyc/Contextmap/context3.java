package cn.wyc.Contextmap;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
/**
 * struts2对EL表达式的改变
 * @author xd
 *
 */
public class context3 extends ActionSupport {
	private String name = "动作类中的name";
	public String execute() {
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("name", "请求域中的name");//这是在大map中一个key为小map中的值
		return SUCCESS;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

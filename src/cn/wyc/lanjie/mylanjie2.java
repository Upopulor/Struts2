package cn.wyc.lanjie;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class mylanjie2 extends ActionSupport{
	//用户登录的方法
	public String login() {
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.setAttribute("user", "suc");
		return SUCCESS;
	}
	//无论是显示主页还是显示另一个页面都执行此方法，都返回成功
	public String execute() {
		System.out.println("mylanjie2的动作方法执行了 ");
		return SUCCESS;
	}
}

package cn.wyc.finalProject;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
/**
 * 检查登录的拦截器
 * @author xd
 *
 */
public class checkloginInterceptor extends MethodFilterInterceptor{

	@Override
	protected String doIntercept(ActionInvocation arg0) throws Exception {
		//1获取session
		HttpSession session = ServletActionContext.getRequest().getSession();
		//2在session中获取user对象
		User user = (User) session.getAttribute("user");
		//3.没有 前往登录页面
		if(user == null){
			return "login";
		}
		//4.有 放行
		return arg0.invoke();
		
	}

}

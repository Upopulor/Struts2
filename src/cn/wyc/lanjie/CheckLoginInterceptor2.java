package cn.wyc.lanjie;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
/**
 * 检查登录的拦截器2版
 * @author xd
 *
 */
public class CheckLoginInterceptor2 extends MethodFilterInterceptor{

	@Override
	public String doIntercept(ActionInvocation arg0) throws Exception {
		//1 获取httpsession对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		//2 获取session中的登录标记
		Object obj = session.getAttribute("user");
		//3 判读是否有登录标记
		if(obj == null) { //用户没有登录
			return "input";
		}
		//登录了 放行
		String invoke = arg0.invoke();
		return invoke;
	}

}

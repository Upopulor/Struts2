package cn.wyc.Contextmap;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 利用actioncontext存数据
 * @author xd
 *
 */
public class context1 extends ActionSupport {
	public String execute() {
		//1得到actionContext对象
		ActionContext ct = ActionContext.getContext();//从当前线程的局部变量中获取引用
		//2王contextmap中存入数据
		ct.put("contextMap", "hello1"); //把数据直接存到大map
		//往session中存数据
		//1 获取key值为session的map
		Map<String,Object> sessionAttribute = ct.getSession();//得到key值为session的小map
		sessionAttribute.put("sessionMap", "hellosessionmap");
		//2直接使用原始的httpSession对象
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.setAttribute("sessionMap1", "hellosessionmap1");
		
		//往ServletContext域中存数据
		//1获取key值为application的map
		Map<String, Object> app = ct.getApplication();
		app.put("applicationMap", "hello application");
		//2直接获取原始的ServletContext对象
		ServletContext appl = ServletActionContext.getServletContext();
		appl.setAttribute("applicationMap1", "hello application1");
		
		return SUCCESS;
	}
}

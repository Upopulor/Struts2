package cn.wyc.lanjie;

import java.lang.reflect.InvocationHandler;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
/**
 * 自定义拦截器
 * 	1 创建一个普通类继承AbstractInterceptor，实现抽象方法
 *  2 在Struts中配置
 *  	1声明拦截器
 *  	2使用自定义拦截器
 * @author xd
 *
 */
public class MyLanjieInterceptor2 extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("Mylanjie器2拦截了-执行动作方法之前");
		//放行：如果有下一个拦截器，就前往，如没有，就到达动作方法
		String invoke = invocation.invoke();
		System.out.println("Mylanjie器2拦截了-执行动作方法之后");
		return invoke;
	}

}

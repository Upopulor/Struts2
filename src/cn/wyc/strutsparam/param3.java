package cn.wyc.strutsparam;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
/**
 * 动态参数封装3 模型驱动
 * 实现模型驱动的步骤
 * 		1实现一个ModelDrivern的接口
 * 	    2实现接口中的方法getModel()
 *      3在使用时，必须要自己实例化模型对象
 * 是由一个ModeDrivern的拦截器为我们做的，实际开发使用的
 * @author xd
 *
 */
public class param3 extends ActionSupport implements ModelDriven<User>{
	//定义数据模型对象
	private User user = new User();
	public String sayParam2() {
		System.out.println(user.getUserName()+"-->"+user.getAge());
		return null;
	}
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}

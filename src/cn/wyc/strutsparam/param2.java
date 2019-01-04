package cn.wyc.strutsparam;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 动态参数封装2 分开写
 * @author xd
 *
 */
public class param2 extends ActionSupport{
	//定义数据模型对象
	private User user;
	public String sayParam2() {
		System.out.println(user.getUserName()+"-->"+user.getAge());
		return null;
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}

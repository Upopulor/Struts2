package cn.wyc.strutsparam;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 动态参数封装1
 * @author xd
 *
 */
public class param1 extends ActionSupport{
	private String userName;
	private int age;
	public String sayparam() {
		System.out.println(userName+"->"+age);
		return null;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

package cn.wyc.lanjie;

import com.opensymphony.xwork2.ActionSupport;

public class mylanjie extends ActionSupport{
	public String saylanjie() {
		System.out.println("mylanjie的动作方法执行了 ");
		return SUCCESS;
	}
}

package cn.wyc.i18n;

import com.opensymphony.xwork2.ActionSupport;

public class I18nAction extends ActionSupport {
	public String execute() {
		String text = getText("key");
		System.out.println(text);
		return SUCCESS;
	}
}

package cn.wyc.Contextmap;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
/**
 * s:checkboxList标签的使用
 * @author xd
 */
public class context6 extends ActionSupport {
	//初始化表单用的爱好列表
	private String[] hobbyArr = new String[]{"skt","IG","kt"};
	//用户提交表单的数据封装在此属性中
	private String hobby;
	public String save() {
		System.out.println(hobby);
		return null;
	}

	public String[] getHobbyArr() {
		return hobbyArr;
	}

	public void setHobbyArr(String[] hobbyArr) {
		this.hobbyArr = hobbyArr;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
}

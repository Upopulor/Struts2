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
 * 利用ValueStack存数据
 * @author xd
 *
 */
public class context2 extends ActionSupport {
	private String name = "卡兹克";
	public String execute() {
		/*//获取ValueStack的引用
		//1
		HttpServletRequest request = ServletActionContext.getRequest();
		ValueStack vs1 = (ValueStack) request.getAttribute("struts.valueStack");
		System.out.println(vs1.hashCode());
		//2先获取ActionContext对象-取出requestmap
		ActionContext ct = ActionContext.getContext();
		Map<String,Object> requestAttribute = (Map<String, Object>) ct.get("request");
		ValueStack vs2 = (ValueStack) requestAttribute.get("struts.valueStack");
		System.out.println(vs2.hashCode());
		//3
		ValueStack vs3 = ct.getValueStack();
		System.out.println(vs3.hashCode());*/
		
		//栈的操作
		ActionContext ct = ActionContext.getContext();
		ValueStack vs4 = ct.getValueStack();
		//压栈操作
		vs4.push(new Student("阿斯顿",12));
		vs4.push(new Student("崔斯特",14));
		/**
		 * setValue(String expr,Object value)
		 * String expr 一个OGNL表达式
		 * OBJECT value 我们要操作的数据
		 * 把数据存到哪里取决于expr是否使用#，如是存到ContextMap，否存到ValueStack
		 */
		vs4.setValue("#name", "大嘴");//把数据放到Contextmap中，key是name,value是大嘴
		vs4.setValue("name", "维克托");//把ValueStack中第一个name属性值换成维克托，如果没有name对应的setName方法，则报错
		
		/**
		 * set(String key , Object o);
		 * String key: Map的key
		 * OBject o : map的value
		 * 如果栈顶是一个map元素，直接把key作为map的key，把Object作为map的value存入，存入的是栈顶
		 * 如果栈顶不是map元素，创建一个map元素，把key作为map的key，把Object作为map的value存入栈顶
		 */
		vs4.set("s1",new Student("拉克丝",18));
		vs4.push(new Student("维鲁斯",23));
		return SUCCESS;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

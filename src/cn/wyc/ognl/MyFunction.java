package cn.wyc.ognl;
/**
 * EL表达式的自定义方法 
 * 		1编写普通类 提供实现功能的静态方法
 * 		2在WEB-INF目录中创建一个.tld的xml文件，文件不能在classes和lib目录中
 *      3在jsp页面中使用tablib指令引入外部的标签库
 * EL表达式只支持静态方法调用
 * @author xd
 *
 */
public class MyFunction {
	public static String toUpperCase(String str) {
		return str.toUpperCase();
	}

}

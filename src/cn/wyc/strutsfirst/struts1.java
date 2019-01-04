package cn.wyc.strutsfirst;
/**
 * struts入门
 * @author xd
 *
 */
public class struts1 {//动作类
	/**
	 *  在动作类中指定的动作方法
	 *  动作方法的书写要求：
	 *  	1 都是public
	 *  	2 返回值必须是一个String
	 *  	3 必须没有参数
	 * @return
	 */
	public String sayhello() {
		System.out.println("my first struts2");
		return "success";//与配置文件中的result的name取值相对应
	}
}

package cn.wyc.strutsfirst;

import com.opensymphony.xwork2.Action;
/**
 * 创建动作类的第二种方式：创建普通类实现Action接口
 * @author xd
 *
 */
public class actionDemo3 implements Action{
	/**
	 * Action接口中的常量：
	 * 		SUCCESS   "success"   执行成功后前往指定位置
	 * 		NONE      "none"      不返回任何结果视图 =retrurn null
	 *      ERROR     "error"     当执行动作方法，出现异常后前往指定页面
	 *      LOGIN     "input"     数据回显
	 *      LOGIN     "login"	  一般用于返回登录页面
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}

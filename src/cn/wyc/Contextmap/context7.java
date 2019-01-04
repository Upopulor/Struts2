package cn.wyc.Contextmap;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
/**
 * 表单的一个小例子
 * @author xd
 *
 */
public class context7 extends ActionSupport implements ModelDriven<Customer>{
	//定义一个模型，必须自己实例化
	private Customer customer = new Customer();
	public String context7() {
		System.out.println(customer);
		return null;
	}
	@Override
	public Customer getModel() {
		return customer;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}

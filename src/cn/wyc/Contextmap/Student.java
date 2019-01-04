package cn.wyc.Contextmap;

import java.io.Serializable;
/**
 * ÑÝÊ¾Õ»µÄ´æÈ¡
 * @author xd
 *
 */
public class Student implements Serializable {
	private String name;
	private int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

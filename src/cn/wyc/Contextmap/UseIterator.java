package cn.wyc.Contextmap;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
/**
 * s:iterator标签的使用
 * @author xd
 *
 */
public class UseIterator extends ActionSupport {
	//Action动作类的引用，默认就在ValueStack的栈顶
	private List<Student> students;
	public String findAll() {
		//调用service层的方法，findAllStudent()
		students = new ArrayList<Student>();
		students.add(new Student("瞎子",28));
		students.add(new Student("压缩",24));
		students.add(new Student("狐狸",22));
		return SUCCESS;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
}

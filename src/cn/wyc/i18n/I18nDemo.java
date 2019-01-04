package cn.wyc.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.Test;

public class I18nDemo {
	@Test
	public void test1() {
		//使用ResourceBundle的getBundle获取对象，参数是资源包文件路径+名和所处的语言环境
		ResourceBundle boudle = ResourceBundle.getBundle("cn.wyc.i18n.message",Locale.CHINA);
		ResourceBundle boudle2 = ResourceBundle.getBundle("cn.wyc.i18n.message",Locale.US);
		String key = boudle.getString("key");
		String key2 = boudle2.getString("key");
		System.out.println(key);
		System.out.println(key2);
	}
}

package cn.wyc.strutsRegist;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsTest {
	public static void main(String[] args) {
		String s1 = null;
		String s2 = "";
		String s3 = "  ";
		//是否为null或者空字符串，但是不去空格
		System.out.println(StringUtils.isEmpty(s1));
		System.out.println(StringUtils.isEmpty(s2));
		System.out.println(StringUtils.isEmpty(s3));
		//是否为null。或者空字符串，但是去空格
		System.out.println(StringUtils.isBlank(s1));
		System.out.println(StringUtils.isBlank(s2));
		System.out.println(StringUtils.isBlank(s3));
	}
}

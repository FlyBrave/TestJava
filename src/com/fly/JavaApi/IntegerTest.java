package com.fly.JavaApi;

/**
 * @author Administrator
 *
 */
public class IntegerTest {
	public static void main(String[] args) {
		Integer a = new Integer("10");
		Integer b = new Integer("11");
		System.out.println(a.compareTo(b));
		System.out.println(a.equals(b));
		float c = a.floatValue();
		System.out.println(c);
		String d = "10101110";
		// 将字符串转换为数值
		int e = Integer.parseInt(d, 2);
		System.out.println(e);
	}
}
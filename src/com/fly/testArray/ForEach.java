package com.fly.testArray;

public class ForEach {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] ages = { 12, 18, 9, 33, 49, 60 };
		int i = 1;
		for (int age : ages) {
			System.out.println("�����е�" + i + "��Ԫ����" + age);
			i++;
		}
	}

}

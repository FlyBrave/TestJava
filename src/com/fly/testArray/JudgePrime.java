package com.fly.testArray;

public class JudgePrime {
	public static void main(String[]args) {
		int [] ages = {12, 18, 9, 33, 45, 60};
		for(int i = 0; i < ages.length; i++){ //ages.length是获取数组的长度
		    System.out.println("数组中第"+(i+1)+"个元素是 "+ages[i]); //数组下标是从零开始，一定要注意
	}
	}
}

package com.fly.yusuanfu;

public class JudgePrime {
	public static void main(String[] args) {
		int a=4549;
		boolean result=true;
		for(int i=2;i*i<=a;i++) {
			if(a%i==0) {
				result=false;
				break;
			}
		}
		if(result) {
			System.out.println(a+"是素数");
		}else
			System.out.println(a+"不是素数");
		
	}
}

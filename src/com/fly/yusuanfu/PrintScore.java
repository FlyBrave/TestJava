package com.fly.yusuanfu;

public class PrintScore {
	public static void main(String[] args) {
		PrintScore a = new PrintScore();
		double rAve;
		int sub1 = 78;
		int sub2 = 99;
		rAve = a.calcAve(sub1, sub2);
		System.out.println("Æ½¾ù·Ö£º" + rAve);
	}

	public double calcAve(int a, int b) {
		double ave = (a + b) / 2;
		return ave;
	}

}

package com.khushbu;

public class MethodOverloadingExample3 {
	public static void main(String[] args) {
		Dispaly obj = new Dispaly();
		System.out.println(obj.addition(12, 12));
		System.out.print(obj.addition(12, 12, 12));
	}
}

class Dispaly {
	public int addition(int a, int b) {

		return a + b;
	}

	public int addition(int a, int b, int c) {

		return a + b + c;
	}
}

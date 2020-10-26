package com.khushbu;

public class MethodOverloading {
	public static void main(String args[]) {
		Display obj = new Display();
		obj.display('k');
		obj.display('k', 927);
	}

}

class Display {
	public void display(char c) {
		System.out.println(c);
	}

	public void display(char c, int num) {
		System.out.println(c + " " + num);
	}
}

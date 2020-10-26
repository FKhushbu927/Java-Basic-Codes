/*method overloading :Difference in Data type in parameter*/

package com.khushbu;

public class MethodOverloadingExample {
	public static void main(String[] args) {
		Dispaly2 obj = new Dispaly2();
		obj.display('k');
		obj.display(927);
	}

}

class Dispaly2 {
	public void display(char c) {
		System.out.println(c);
	}

	public void display(int a) {
		System.out.println(a);
	}
}

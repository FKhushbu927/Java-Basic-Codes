package com.khushbu;

//parent class
class Cat {
	// defining method
	public void eat() {
		System.out.println("The cat is eating");
	}
}

//subclass
class BabyCat extends Cat {
	// defining the same method as in the parent class
	public void eat() {
		System.out.println("The baby cat is eating");
	}
}

public class MethodOverriding1 {
	public static void main(String[] args) {
		// creating object
		BabyCat obj = new BabyCat();
		obj.eat();
	}
}

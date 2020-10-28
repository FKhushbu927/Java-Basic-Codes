package com.khushbu;

import java.util.Scanner;

/*

User: khushboo
Date: 10/24/2020
Time: 4:10 PM

**/

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (reverseNum(num) == num) {
			System.out.println("The " + num + " is pallindrome");
		} else
			System.out.println("The " + num + " is not pallindrome");

	}

	static int reverseNum(int num) {
		int rev = 0;
		while (num > 0) {
			// int rev=0;
			rev = rev * 10;
			rev = rev + num % 10;
			num = num / 10;
		}
		return rev;

	}

}

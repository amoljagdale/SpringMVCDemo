package com.scp.tutorial;

public class PalindromDemo {
	public static void main(String[] args) {
		testPalindrome("DAD");
		testPalindromeNumber(12345);
	}
	private static void testPalindromeNumber(int number) {
		int temp= number;
		int sum = 0;
		int rem = 0;
		while (number >0)
		{
			rem = number % 10;
			sum = (sum * 10)+rem;
			number = number /10;
		}
		if(number == temp)
		{
			System.out.println("Given number is Palindrome : "+sum);
		}
		else {
			System.out.println("Given number is not Palindrome : "+sum);
		}
	}
	private static void testPalindrome(String original) {
		String reverse="";
		for(int i=original.length()-1; i>=0; i--)
		{
			reverse = reverse + original.charAt(i);
		}
		if(original.equals(reverse)){
			System.out.println("Given String is Palindrome : "+ reverse);
		}
		else {
			System.out.println("Given String is not Palindrome : "+ reverse);
		}
	}
	
}

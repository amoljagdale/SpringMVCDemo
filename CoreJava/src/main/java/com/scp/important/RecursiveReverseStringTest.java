package com.scp.important;

public class RecursiveReverseStringTest {
	public static void main(String[] args) {
		String str= "my name is khan";
		System.out.println("Original: "+str);
		String reverse= new StringBuffer(str).reverse().toString();
		System.out.println("After using Reverse : "+reverse);
		
		String reverseRec= reverseString(str);
		System.out.println("After using Recursive1 : "+reverseRec);
		
		String reverseRecursion= reverseRecursionString(str);
		System.out.println("After using Recursive2 : "+reverseRecursion);
		
	}

	private static String reverseRecursionString(String str) {
		if(str.length()<2)
		{
			return str;
		}
		return reverseRecursionString(str.substring(1)) + str.charAt(0);
	}

	private static String reverseString(String str) {
		StringBuilder builder= new StringBuilder();
		char[] strChar = str.toCharArray();
		for (int i = strChar.length-1; i>=0 ; i--) {
			builder.append(strChar[i]);
		}
		return builder.toString();
	}
}

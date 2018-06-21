package com.scp.missingnumber;

public class MissingNumber {

	public static void main(String[] args) {
		int[] input= { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9, 11, 11 };
		
		int[] register = new int[input.length];
		
		for (int i : input) {
			register[i] = 1;
			//System.out.println(register[i]);
		}
		System.out.println("Print all the missing number...");
		for(int i=1; i<register.length; i++)
		{
			if(register[i]==0)
			{
				System.out.println(i);
			}
		}
		


	}

}

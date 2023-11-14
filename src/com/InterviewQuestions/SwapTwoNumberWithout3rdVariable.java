package com.InterviewQuestions;

public class SwapTwoNumberWithout3rdVariable {

	public static void main(String[] args) {

		int a=10,b=20;
		
		System.out.println("Before Swapping: "+a+" and "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Before Swapping: "+a+" and "+b);
		
	}

}

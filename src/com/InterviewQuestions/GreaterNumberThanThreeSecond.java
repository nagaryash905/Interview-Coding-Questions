package com.InterviewQuestions;

public class GreaterNumberThanThreeSecond {

	public static void main(String[] args) {

		int a=41,b=40,c=30;
		if(a>b&&a>c)
		{
			System.out.println("A is the Greater Number: "+a);
		}
		else if(b>a&&b>c)
		{
			System.out.println("B is the Greater Number: "+b);
		}
		else
		{
			System.out.println("C is the Greater Number: "+c);
		}
	}

}

package com.InterviewQuestions;

public class GreaterNumberThanThree {

	public static void main(String[] args) {

		int a=90,b=50,c=30;
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is the Greater Number: "+a);
			}	
			else
			{
				System.out.println("C is the Greater Number: "+c);
			}
		}
		else if(b>c)
		{
			System.out.println("B is the Greater Number: "+b);
		}
		else
		{
			System.out.println("C is the Greater Number: "+c);
		}
		
		
	}

}

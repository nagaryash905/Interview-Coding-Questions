package com.InterviewQuestions;

public class SumOfInitger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5,b=8;
		int sum=0;
		
		for(int i=a;i<=b;i++)
		{
			sum=sum+i;
			System.out.print(i);
			if(i!=b)
			System.out.print("+");
		}
		System.out.println("="+sum);
		
	}

}

package com.InterviewQuestions;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Entre the Number for the Factorial");
		int a=sc.nextInt();
		//int a=5;
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			 fact=fact*i;
		}
		System.out.println("Factorial of "+a+" is " +fact);
	}

}

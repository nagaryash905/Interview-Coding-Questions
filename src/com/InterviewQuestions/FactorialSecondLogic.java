package com.InterviewQuestions;

import java.util.Scanner;

public class FactorialSecondLogic {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Entre the Number you want to factorial");
		int no=sc.nextInt();
		//int no=5;
		int fact=1;
		for(int i=no;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}

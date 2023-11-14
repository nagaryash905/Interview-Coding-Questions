package com.InterviewQuestions;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num=153;
		int temp=num;
		int len=0;
		int rem;
		while(temp!=0)
		{
			len=len+1;
			temp=temp/10;
		}
		
		
		int temp1=num;
		int arm=0;
		while(temp1!=0)
		{
			int mul=1;
			rem=temp1%10;
			for(int i=1;i<=len;i++)
			{
				mul=mul*rem;
			}
			arm=arm+mul;
			temp1=temp1/10;	
		}
		if(arm==num)
		{
			System.out.println(num + " is armstrong");
		}
		else
		{
			System.out.println(num+ " is not armstronmg number");
		}
	}

}

package com.InterviewQuestions;

public class SentenceFullOpposite {

	public static void main(String[] args) {

		String s="my name is khan";
		
		//String[] split = s.split(" ");
		
		String rev="";
		
		char[] c = s.toCharArray();
		
		for(int i=c.length-1;i>=0;i--)
		{
			rev=rev+c[i];
		}
		System.out.println(rev);
		
	}
}

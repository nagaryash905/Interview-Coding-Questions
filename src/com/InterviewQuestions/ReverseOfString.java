package com.InterviewQuestions;

public class ReverseOfString {

	public static void main(String[] args) {

		String rev="";
		
		String a="yash";
		
		int len = a.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		}
		System.out.println("reverse of name: "+rev);
	}

}

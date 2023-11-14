package com.InterviewQuestions;

public class ReverseSentence {

	public static void main(String[] args) {

		String a="my name is yash";
		
		String[] split = a.split(" ");
		 
		String result="";
		
		for(int i=split.length-1;i>=0;i--)
		{
			if(i==0)
			{
				result=result+split[i];
			}
			else
			{
				result=result+split[i]+" ";
			}
		}
		
		System.out.println(result);
		
	}

}

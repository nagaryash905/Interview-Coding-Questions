package com.InterviewQuestions;

public class ReverseEachWords {

	public static void main(String[] args) {

		String str="java fgjk";
		
		//created in array
		String[] words = str.split(" ");
		
		String rev="";
		
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String revword="";
			
			for(int j=word.length()-1;j>=0;j--)
				{
					revword=revword+word.charAt(j);
					
				}
		}
		
	}

}

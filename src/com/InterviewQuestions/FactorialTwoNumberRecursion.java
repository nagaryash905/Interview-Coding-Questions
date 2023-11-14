package com.InterviewQuestions;

public class FactorialTwoNumberRecursion {

	int fact=1;
	
	public static void main(String[] args) {
		
		int no=6,res;
		
		FactorialTwoNumberRecursion f = new FactorialTwoNumberRecursion();

		res=f.calFact(no);
		System.out.println(res);
	}
	
	int calFact(int no)
	{
		if(no>1)
		{
			fact=fact*no;
			calFact(no-1);
			return fact;
		}
		return fact;
	}

}

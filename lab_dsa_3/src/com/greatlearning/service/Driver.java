package com.greatlearning.service;

import com.greatlearning.service.*;

public class Driver {
	
	// driver code 
	public static void main(String []args)
	{
		BalancingBrackets balancingBrackets = new BalancingBrackets();
		String bracketExpression = "([[{}]])]";
		
		Boolean result ;
		
		result = balancingBrackets.checkingBracketsBalanced(bracketExpression);
		
		if (result)
			System.out.println("The entered string has balanced brackets ");
		else 
			System.out.println("The entered string do not contain balanced brackets ");
		}
     } 


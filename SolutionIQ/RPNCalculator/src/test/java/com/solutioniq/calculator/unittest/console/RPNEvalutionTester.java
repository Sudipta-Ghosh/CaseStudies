package com.solutioniq.calculator.unittest.console;

import java.util.Scanner;

import com.solutioniq.calculator.core.businessdelegate.BusinessDelegate;

// TODO: Auto-generated Javadoc
/**
 * The Class RPNEvalutionTester.
 */
public class RPNEvalutionTester {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusinessDelegate objBusinessDelegate=new BusinessDelegate();
	    System.out.print("Input:");
	    Scanner scanner = new Scanner(System.in);
	    String rpninput = scanner.nextLine();	
	    String rpnEvaluationResult= objBusinessDelegate.doProcessing(rpninput);
		
		System.out.println("rpnEvaluationResult:::"+rpnEvaluationResult);
	}

}

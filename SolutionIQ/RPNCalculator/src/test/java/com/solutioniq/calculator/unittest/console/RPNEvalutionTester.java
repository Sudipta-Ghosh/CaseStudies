package com.solutioniq.calculator.unittest.console;

import java.util.Scanner;

import com.solutioniq.calculator.core.businessdelegate.BusinessDelegate;
import com.solutioniq.calculator.core.exception.WrongExpressionException;

// TODO: Auto-generated Javadoc
/**
 * The Class RPNEvalutionTester.
 */
public class RPNEvalutionTester {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws WrongExpressionException Exception throws for Invalid RPN Expression
	 */
	public static void main(String[] args) throws WrongExpressionException {
		// TODO Auto-generated method stub
		BusinessDelegate objBusinessDelegate=new BusinessDelegate();
	    System.out.print("Input:");
	    Scanner scanner = new Scanner(System.in);
	    String rpninput = scanner.nextLine();	
	    String rpnEvaluationResult= objBusinessDelegate.doProcessing(rpninput);
		
		System.out.println("Output:"+rpnEvaluationResult);
	}

}

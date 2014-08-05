package com.solutioniq.calculator.util;

public class OutputFormatter {
	
	public static  String getFormattedOutput(double calculationResult){
		 if(calculationResult == (int) calculationResult)
		        return String.format("%d",(int)calculationResult);
		    else
		        return String.format("%s",calculationResult);
	}

}

package com.solutioniq.calculator.service.core;

import com.solutioniq.calculator.service.ICalculationService;

// TODO: Auto-generated Javadoc
/**
 * The Class CalculationService.
 */
public class CalculationService <E extends java.lang.Number> {

	/** The calculation service. */
	ICalculationService calculationService;
	
	/**
	 * Gets the calculationresult.
	 *
	 * @param rpnExpression the RPN expression
	 * @return 
	 * @return the evaluated Result
	 */
	public String getCalculationresult(String expression) {
		// TODO Auto-generated method stub
		double calculationResult=(double) calculationService.doRPNevaluation(expression);
		 if(calculationResult == (int) calculationResult)
		        return String.format("%d",(int)calculationResult);
		    else
		        return String.format("%s",calculationResult);
		
	}
 
	//DI via setter method
	/**
	 * Sets the calculation service.
	 *
	 * @param calculationService the new calculation service
	 */
	public void setcalculationService(ICalculationService calculationService) {
		this.calculationService = calculationService;
	}

	

	
	
}

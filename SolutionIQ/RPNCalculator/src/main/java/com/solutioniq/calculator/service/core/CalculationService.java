package com.solutioniq.calculator.service.core;

import com.solutioniq.calculator.core.exception.WrongExpressionException;
import com.solutioniq.calculator.service.ICalculationService;
import com.solutioniq.calculator.util.OutputFormatter;

// TODO: Auto-generated Javadoc
/**
 * The Class CalculationService.
 */
public class CalculationService {

	/** The calculation service. */
	ICalculationService calculationService;
	
	/**
	 * Gets the calculationresult.
	 *
	 * @param expression the expression
	 * @return the evaluated Result
	 * @throws WrongExpressionException the wrong expression exception
	 */
	public String getCalculationresult(String expression) throws WrongExpressionException {
		// TODO Auto-generated method stub
		double calculationResult=(double) calculationService.doRPNevaluation(expression);
		String strCalculationresult=OutputFormatter.getFormattedOutput(calculationResult);
		return strCalculationresult;
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

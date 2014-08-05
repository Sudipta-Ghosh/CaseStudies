package com.solutioniq.calculator.service;

import com.solutioniq.calculator.core.exception.WrongExpressionException;

// TODO: Auto-generated Javadoc
/**
 * The Interface ICalculationService.
 *
 * @author Sudipta Ghosh
 */
public interface ICalculationService {
	 
 	/**
	  * Do rp nevaluation.
	  *
	  * @param expression Reverse Polish Notation Expression to be evaluated
	  * @return double is  evaluated output of RPN expression
	  * @throws WrongExpressionException the wrong expression exception
	  */
 	public double doRPNevaluation(String expression) throws WrongExpressionException;

}

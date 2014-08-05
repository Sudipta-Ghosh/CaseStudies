package com.solutioniq.calculator.service.impl;

import java.util.LinkedList;

import com.solutioniq.calculator.log.LoggerBean;
import com.solutioniq.calculator.service.ICalculationService;
import com.solutioniq.calculator.util.FactorialEvaluator;

public class RPNEvaluator implements  ICalculationService{

	
	public double doRPNevaluation(String expr) {
		// TODO Auto-generated method stub
		LoggerBean.logdebug("Inside doRPNevaluation");
		LinkedList<Double> stack = new LinkedList<Double>();
		for(String token:expr.split("\\s")){
			Double tokenNum = null;
			try{
				tokenNum = Double.parseDouble(token);
			}catch(NumberFormatException e){}
			if(tokenNum != null){
				stack.push(Double.parseDouble(token+""));
			}else if(token.equals("*")){
				double secondOperand =stack.pop();
				double firstOperand = stack.pop();
				stack.push(firstOperand * secondOperand);
			}else if(token.equals("/")){
				double secondOperand = stack.pop();
				double firstOperand = stack.pop();
				stack.push(firstOperand / secondOperand);
			}else if(token.equals("-")){
				double secondOperand = stack.pop();
				double firstOperand = stack.pop();
				stack.push(firstOperand - secondOperand);
			}else if(token.equals("+")){
				double secondOperand = stack.pop();
				double firstOperand = stack.pop();
				stack.push(firstOperand + secondOperand);
			}else if(token.equals("^")){
				double secondOperand = stack.pop();
				double firstOperand = stack.pop();
				stack.push(Math.pow(firstOperand, secondOperand));
			}else if(token.equals("%")){
				LoggerBean.logdebug("Operate\t\t");
				double firstOperand = stack.pop();				
				stack.push(firstOperand/100);
			}else if(token.equals("!")){
				LoggerBean.logdebug("Operate\t\t");
				double firstOperand = stack.pop();
				long lngfirstOperand=Double.valueOf(firstOperand).longValue();				
				stack.push((double)FactorialEvaluator.factorial(lngfirstOperand));
			}
			else{//just in case
				LoggerBean.logdebug("Invalid Expression");
				return 0.0;
			}
			
		}
		
		double result=(Double) stack.pop();
		LoggerBean.logdebug("result:::" + result);
		return result;
	}

}

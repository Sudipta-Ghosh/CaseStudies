package com.solutioniq.calculator.core.businessdelegate;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.solutioniq.calculator.service.core.CalculationService;

// TODO: Auto-generated Javadoc
/**
 * BusinessDelegate is a single entry point class for client entities to provide access to Business Service methods.
 *
 * @param <E> the element type
 */
public class BusinessDelegate<E extends java.lang.Number> {	
	

	/**
	 * This method is used to process all business service methods.
	 *
	 * @param expression Reverse Polish Notation Expression to be evaluated
	 * @return String is output
	 */
	public String doProcessing(String expression) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		CalculationService objCalculationService = (CalculationService)context.getBean("CalculationServiceConsumer");
		String result= (String) objCalculationService.getCalculationresult(expression);
		return result;
	}

	

}

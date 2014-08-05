package com.solutioniq.calculator.unittest.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.solutioniq.calculator.core.businessdelegate.BusinessDelegate;
import com.solutioniq.calculator.log.LoggerBean;

// TODO: Auto-generated Javadoc
/**
 * The Class RPNEvaluationUnitTest.
 */
public class RPNEvaluationUnitTest {
	
	/** The obj business delegate. */
	BusinessDelegate objBusinessDelegate=new BusinessDelegate();

    /**
     * Test evaluate RPN for correct result
     *
     * @throws Exception the exception
     */
      @Test(groups = { "RPNEvaluationTest" })
	   public void testEvaluateRPNPositive() throws Exception {
		    LoggerBean.logdebug("inside testAddtionwithCorrectValue");
		    String message1 = "1 2 3 + -";
		    String message2 = "6 2 * 3 /";
		    String message3 = "2 3 ^ 4 5 + +";
		    String message4 = "50 % 2 *";
		    String message5 = "3 ! 4 5 * +";
		    String message6 = "12 3 / !";
		    String message = "5 1 2 + 4 * + 3 -";
		    
		    
		    String result= objBusinessDelegate.doProcessing(message);
			LoggerBean.logdebug("result==="+result);
	        assert result.equals("14") : "Expected result::" + result;

	   }
      
      /**
       * Test evaluate RPN for wrong result
       *
       * @throws Exception the exception
       */
      @Test(groups = { "RPNEvaluationTest" })
	   public void testEvaluateRPNNegative() throws Exception {
		    LoggerBean.logdebug("inside testAddtionwithCorrectValue");
		    String message = "1 2 3 + -";
		    
		    String result= objBusinessDelegate.doProcessing(message);
			LoggerBean.logdebug("result==="+result);
	        assert result.equals("4") : "Expected result::" + result;
	   }
      
      /**
       * Test evaluate RPN for invalid expression.
       *
       * @throws Exception the exception
       */
      @Test(groups = { "RPNEvaluationTest" })
	   public void testEvaluateRPNWrongInputs() throws Exception {
		    LoggerBean.logdebug("inside testAddtionwithCorrectValue");
		    String message = "a b c + -";
		    
		    String result= objBusinessDelegate.doProcessing(message);
			LoggerBean.logdebug("result==="+result);
	        assert result.equals("4") : "Expected result::" + result;
	   }
      
      
	   
	 

}

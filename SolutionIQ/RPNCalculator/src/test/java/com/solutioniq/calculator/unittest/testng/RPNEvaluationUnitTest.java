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
	
	  

    /**
     * Test evaluate rpn positive.
     */
    @Test(groups = { "functest" })
	   public void testEvaluateRPNPositive() {
		    LoggerBean.logdebug("inside testAddtionwithCorrectValue");
		    String message = "1 2 3 + -";
		    BusinessDelegate objBusinessDelegate=new BusinessDelegate();
		    String result= objBusinessDelegate.doProcessing(message);
			LoggerBean.logdebug("result==="+result);
	        Assert.assertEquals(result, -4.0);
	   }
	   
	 

}

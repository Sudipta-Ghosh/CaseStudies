package com.solutioniq.calculator.core.exception;

// TODO: Auto-generated Javadoc
/**
 * The Class WrongExpressionException.
 */
public class WrongExpressionException extends Exception {
	
	/** The exception string. */
	String exceptionString;
	
	/**
	 * Instantiates a new wrong expression exception.
	 *
	 * @param exceptionString the exception string
	 */
	public WrongExpressionException(String exceptionString) {
		this.exceptionString=exceptionString;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Throwable#toString()
     */
    public String toString(){ 
       return ("Output String = "+exceptionString) ;
    }

}

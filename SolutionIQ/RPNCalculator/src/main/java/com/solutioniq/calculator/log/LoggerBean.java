package com.solutioniq.calculator.log;

import org.apache.log4j.Logger;

// TODO: Auto-generated Javadoc
/**
 * The Class LoggerBean.
 */
public class LoggerBean {
	
	 /** The log. */
 	private static org.apache.log4j.Logger log = Logger.getLogger(LoggerBean.class);
	
	/**
	 * Logdebug.
	 *
	 * @param strMessage log message to be printed in debug level
	 */
	public static void logdebug(String strMessage)
	{
		log.debug(strMessage);
	}
	
	/**
	 * Log warn.
	 *
	 * @param strMessage log message to be printed in debug level
	 */
	public static void logWarn(String strMessage)
	{
		log.warn(strMessage);
	}


}

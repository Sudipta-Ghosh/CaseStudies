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
	 * @param strMessage the str message
	 */
	public static void logdebug(String strMessage)
	{
		log.debug(strMessage);
	}
	public static void logWarn(String strMessage)
	{
		log.warn(strMessage);
	}


}

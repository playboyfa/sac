package com.yang.sac.tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

import com.yang.sac.Log4JTest;

public class DateTimeTools
{
	private static SimpleDateFormat format = new SimpleDateFormat( "yyyy/MM/dd HH:mm:ss");
	private static Logger logger = Logger.getLogger(Log4JTest.class);
	
	public static Date parseDataTime(String dT)
	{
		Date date = null;
		try {
			date = format.parse(dT);
		} catch (ParseException e) {
			logger.error(e.toString());
		}
		return date;
	}
}

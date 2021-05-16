package com.marui.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 用于字符串与日期对象之间转换的工具类
 * @author MaRui
 *
 */
public class DateUtils {
	/**
	 * date转String
	 * @param date
	 * @return
	 */
	public static String dateToString(Date date) {
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return df.format(date);
	}
	
	public static Date stringToDate(String source ) throws ParseException {
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return df.parse(source);
	}
}

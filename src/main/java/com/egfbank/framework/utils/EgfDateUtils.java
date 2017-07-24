package com.egfbank.framework.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EgfDateUtils {

	public final static String  DATE_DETAIL_LIST = "yyyyMMddHHmmss";
	
	private static SimpleDateFormat dateDetailFormat = new SimpleDateFormat(DATE_DETAIL_LIST);
	
	public static String formateStringDate(Date date){
		return dateDetailFormat.format(date);
	}
	
	public static String formateCurrentDate(){
		return dateDetailFormat.format(new java.util.Date());
	}
	
	public static void main(String[] args){
		System.out.println(EgfDateUtils.formateCurrentDate());
	}
}

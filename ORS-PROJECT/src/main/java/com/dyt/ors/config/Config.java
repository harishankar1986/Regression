package com.dyt.ors.config;

import org.openqa.selenium.WebDriver;

public class Config {	
	public static WebDriver driver = null;
	public static final String URL = "http://13.233.50.231:8080/ORS_SIT/";
	public static String Browser = "chrome";
	public static String CurrentTestCaseName = "";
	public static String TestDataPath = System.getProperty("user.dir")+"//TestData//TestData1.xlsx";
	public static String ResultsPath = System.getProperty("user.dir")+"//Results//";
	public static String imagesPath = System.getProperty("user.dir")+"//images//glenmark.jpg";
	public static String Smoke_Sheet = "smoke";
	public static String Regression_Sheet = "regression";
}
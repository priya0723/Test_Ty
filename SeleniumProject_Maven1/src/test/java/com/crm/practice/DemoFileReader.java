package com.crm.practice;

import com.crm.autodesk.GenricUtils.JSONFileUtility;

public class DemoFileReader {
	public static void main(String [] args) throws Throwable {
		JSONFileUtility jsonLib = new JSONFileUtility();
		
		String val = jsonLib.readDataFromJSON("url");
		
		System.out.println(val);
	}

}

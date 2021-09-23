package com.crm.autodesk.GenricUtils;

import java.io.FileReader;

import java.util.HashMap;

import org.json.simple.parser.JSONParser;

/**
 * this class contains methods to read data from json file
 * @author priya
 *
 */

public class JSONFileUtility {
	
	/**
	 * this method reads the data from json file
	 * @throws Throwable
	 */
	
	public String readDataFromJSON(String Key) throws Throwable
	
	{
		//red the data from json file
		FileReader file = new FileReader(IpathConstants.JsonFilePath);
		
		//convert the json file into java object
		JSONParser jsonobj = new JSONParser();
		Object jobj = jsonobj.parse(file);
		
		//type cast javs ob to hashmap 
		HashMap map = (HashMap)jobj;
		String value = map.get(Key).toString();
		
		
		//return the value
		return value;
	}

}
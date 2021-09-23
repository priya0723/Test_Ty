package com.crm.autodesk.GenricUtils;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * 
 * This class contains generic methods to read from property file
 * @author priya
 *
 */

public class propertyFileUtility {
	
	 /**
	  * 
	  * this method reads data from  property file
	 * @throws Throwable 
	  * @throws Throwable
	  */
	
	public String getpropertyFileData(String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream(IpathConstants.PropertyFilePath);
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
		
	}

}

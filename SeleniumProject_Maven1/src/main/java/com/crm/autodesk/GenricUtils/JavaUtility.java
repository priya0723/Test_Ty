package com.crm.autodesk.GenricUtils;

import java.util.Random;

/**
	 *this class contains generic methods pertaining to java  
	 * @author priya
	 * 
	 */
	
	public class JavaUtility {
		
	/**
		 
     *this method generates random number with in the boundary of 0 to 10000
     *@return intData
     */
		
		public int getRanDomNumber() {
			Random ranDom = new Random();
			int ranDomNum = ranDom.nextInt(10000);
			return ranDomNum;
		}
		
	}
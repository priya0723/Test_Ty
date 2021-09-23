package com.crm.autodesk.GenricUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;



     /**
	 *this class contains generic method to read and write data from Excel sheet 
	 * author priya
	 */

  public class ExcelFileUtility {
	  
	

	/**
	   * this method reads data from property file
	 * @throws Throwable 
	   * @throws Throwable
	   */
	  
	  public String getExcelData(String sheetName, int rownum, int cellnum) throws Throwable {
		  
		    FileInputStream fis = new FileInputStream(IpathConstants.ExcelPath);
		    Workbook book = WorkbookFactory.create(fis);
		    Sheet sh=book.getSheet(sheetName);
		    Row row=sh.getRow(rownum);
		    Cell cell=row.getCell(cellnum);
		    String value=cell.getStringCellValue();
		    
		   
			return value;
		}
  }
		/*
		 * this method return the data full in sheet
		 * 
		 */
	  
	  
	  
	  
	  
	  
package com.crm.autodesk.ContactTest;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;

import com.crm.autodesk.GenricUtils.BaseClass;
import com.crm.autodesk.objectRepositry.ContactsPage;
import com.crm.autodesk.objectRepositry.HomePage;

	
	public class TC_16_ViewContact extends BaseClass {
		

		@Test(groups="RegresionSuite")
		public void ViewContact() throws Throwable {
			
			// String orgName = eLib.getExcelData("Sheet2", 1, 3) + jLib.getrandomNum();

			
			// navigate to contact page

			HomePage hp = new HomePage(driver);
			hp.clickonContacts();

			// navigate to lastviewed image
			ContactsPage cp = new ContactsPage(driver);
			cp.clickonLastViewBtn();

			// print all the lastViewd contact

			cp.getallViewdcontact();

			
		}

	

}

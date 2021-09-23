package com.crm.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.crm.autodesk.GenricUtils.JSONFileUtility;

public class DynamicWebTable {
	
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Test
	
	public void handlingDynamicWebtable() throws Throwable {
	{
		JSONFileUtility jsonLib = new JSONFileUtility();
		
		//fetch the common data from external resources
		String BROWSER = jsonLib.readDataFromJSON("browser");
		String URL = jsonLib.readDataFromJSON("url");
		String USERNAME = jsonLib.readDataFromJSON("username");
		String PASSWORD = jsonLib.readDataFromJSON("password");
		
		//choose the browser
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			 driver = new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			driver = new InternetExplorerDriver();
		}
		//load the url
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(URL);
		
		//login to application
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		
		//click on orgnization
		
		driver.findElement(By.id("Organizations")).click();
		
		
		
		
	}
		
}

}

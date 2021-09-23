package pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CreateOrganizationTest {
	
	@Test
	public void sampleTest() throws InterruptedException {
		
		System.out.println("execute Test");
		String URL = System.getProperty("url");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		String browser = System.getProperty("browser");
		String LASTNAME = System.getProperty("lastname");
		WebDriver driver = null;
		if(browser.equals("Chrome")) {
			
			driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}else {
			System.out.println("invalid browser");
		}
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[text ()='Organizations']")).click();
		driver.findElement(By.cssSelector("img[title='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys(LASTNAME);
		driver.close();
	}

}


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LenskartAutosuggestion {
	
	
		public static void main(String [] args) throws InterruptedException
		
		{
			System.setProperty("Webdriver.chrome.driver", "D:\\omca5 automation\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
			driver.get("https://www.lenskart.com/");
			driver.manage().window().maximize();
			driver.findElement(By.name("q")).sendKeys("Trending search");
			Thread.sleep(3000);
			List<WebElement> lst=driver.findElements(By.xpath("//input[@class='search_input-bar autoSuggest']"));
			
			for(WebElement wb:lst)
			{
				System.out.println(wb.getText());
			}
			driver.close();
			
		}

	}




package RABP.testsuites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_123 {
	{
		System.setProperty("webdriver.chrome.driver","E:\\Mashini Sushma\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
		//launch Firefox Browser
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("webdriver");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[contains(text(),'wait')]")).click();
			
		
	}

}

package Sample_Project.Sample_ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample123 {
	private static final String value = null;

	public static void main(String args[])
	{
	System.setProperty("webdriver.chrome.driver","E:\\Mashini Sushma\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.cleartrip.com/hotels");

WebElement element=driver.findElement(By.xpath(".//*[@id='travellersOnhome']"));
//WebElement element1=driver.findElement(By.xpath(".//*[@id='travellersOnhome']"));
Select value=new Select(driver.findElement(By.xpath(".//*[@id='travellersOnhome']")));
WebElement s=value.getFirstSelectedOption();
System.out.println(s.getText());
	}
}

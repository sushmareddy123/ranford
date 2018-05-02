package RABP.appfunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import configure.Config;
import pageobjects.PageObjects;
import testdata.TestData;

public class AppFunctions {
	// public WebDriver driver ;

	     /***********************************************************
	      * Method Name    : LaunchApplication
	      * Method For     : It launches the application in the browser
	      * Created By     :
	      * Created On     :
	      * Reviewed By    :
	      * Reviewed On    :
	      * @return
	      ************************************************************/
	
	     public static WebDriver LaunchApplication()
	     {
	    	System.out.println(" %%%%%%%%%%%%%%%execute the LaunchApplicaiton %%%%%%%%%%%%%%%");
	    	 System.out.println(" browser name : "+Config.sBrowser);
	    	// System.setProperty("webdriver.firefox.marionette","E:\\Mashini Sushma\\Browser_Driver\\geckodriver.exe");
	    	 //WebDriver driver=new FirefoxDriver();
	    	// driver.manage().deleteAllCookies();
	 	System.setProperty("webdriver.chrome.driver","E:\\Mashini Sushma\\Browser_Driver\\New folder\\chromedriver.exe");
	 	 ChromeOptions options = new ChromeOptions();
	        options.addArguments("window-size=800,480");
	 
	        DesiredCapabilities cap = DesiredCapabilities.chrome();
	        cap.setCapability(ChromeOptions.CAPABILITY, options);
	 
	        //this will open chrome with set size
	        WebDriver driver = new ChromeDriver(cap);
	 		//WebDriver driver=new ChromeDriver();
	 		driver.get(Config.sURL2);
	 		driver.manage().window().maximize();
	    	 /*switch(Config.sBrowser)
	    	 {
	    	 
	    	 //selecting the firefox driver
	    	
	    	 //selecting chrome driver
	    	 case "Chrome":
	    	 {
	    		 System.setProperty("webdriver.chrome.driver","E:\\Mashini Sushma\\Browser_Driver\\chromedriver_win32\\chromedriver.exe");
	    		 ChromeOptions chromeOptions = new ChromeOptions();
	    		 chromeOptions.addArguments("--start-maximized");
	    		 driver = new ChromeDriver(chromeOptions);
	    		 //driver=new ChromeDriver();
	    		 System.out.println(" executing the launch application method-------------------");
	    		 break;
	    	 }
	    	 }
	    	 
	    	 //get the URL
	    	 System.out.println(" browser name : "+Config.sURL2);
	    	 /*driver.get(Config.sURL2);*/	    	
	     /*driver.manage().window().maximize();
	    	 System.out.println(" maximize-----------------------------");
	   	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	 System.out.println(" print the driver: "+driver);*/
	    	 return driver;
	    	 
	     }
	     
	     /***********************************************************
	      * Method Name    : AdminLogin
	      * Method For     : It navigates to admin home page
	      * Created By     :
	      * Created On     :
	      * Reviewed By    :
	      * Reviewed On    :
	      * @return
	      ************************************************************/
	     
	     public static boolean AdminLogin(WebDriver driver)
	     {
	    	 System.out.println(" executing the admin login method");
	    	 try{
	    		 PageObjects.RanfordHomePage.txtUserName(driver).sendKeys(TestData.RanfordHomePage.sUserName);
	    	     PageObjects.RanfordHomePage.txtPassword(driver).sendKeys(TestData.RanfordHomePage.sPassword);
	    	     PageObjects.RanfordHomePage.imgLogin(driver).click();
	    	     return true;
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    		 return false;
	    	 }
	    	 
	     }
	     
	     /***********************************************************
	      * Method Name    : Branches
	      * Method For     : It navigates to Branches page
	      * Created By     :
	      * Created On     :
	      * Reviewed By    :
	      * Reviewed On    :
	      ************************************************************/
	     public static boolean Branches(WebDriver driver)
	     {
	    	 try{
	    	     PageObjects.GlobalPageObjects.imgBranches(driver).click();
	    	     return true;
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    		 return false;
	    	 }
	    	 
	     }
	     
	     /***********************************************************
	      * Method Name    : BrowserClose
	      * Method For     : It Closes the browser
	      * Created By     :
	      * Created On     :
	      * Reviewed By    :
	      * Reviewed On    :
	      ************************************************************/
	     public static boolean BrowserClose(WebDriver driver)
	     {
	    	 try{
	    	     driver.quit();;
	    	     return true;
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    		 return false;
	    	 }
	    	 
	     }
	     
	     /***********************************************************
	      * Method Name    : NewBranch
	      * Method For     : It navigates to new branch creation page
	      * Created By     :
	      * Created On     :
	      * Reviewed By    :
	      * Reviewed On    :
	     * @return 
	      ************************************************************/
	     public static boolean NewBranch(WebDriver driver)
	     {
	    	 try{
	    	     PageObjects.BranchesPage.imgNewBranch(driver).click();
	    	     return true;
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    		 return false;
	    	 }
	    	 
	     }
	     
	     /***********************************************************
	      * Method Name    : BranchesHomeButton
	      * Method For     : It navigates to admin home page
	      * Created By     :
	      * Created On     :
	      * Reviewed By    :
	      * Reviewed On    :
	     * @return 
	      ************************************************************/
	     public static boolean BranchesHomeButton(WebDriver driver)
	     {
	    	 try{
	    	     PageObjects.GlobalPageObjects.imgHome(driver).click();
	    	     return true;
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    		 return false;
	    	 }
	    	 
	     }
	     
	     /***********************************************************
	      * Method Name    : BranchesLogoutButton
	      * Method For     : It navigates to ranford home page
	      * Created By     :
	      * Created On     :
	      * Reviewed By    :
	      * Reviewed On    :
	     * @return 
	      ************************************************************/
	     public static boolean BranchesLogoutButton(WebDriver driver)
	     {
	    	 try{
	    	     PageObjects.GlobalPageObjects.imgLogout(driver).click();
	    	     return true;
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    		 return false;
	    	 }
	    	 
	     }
	     
	     /***********************************************************
	      * Method Name    : SelectBranchDetails
	      * Method For     : It displays the selected Country, State and City
	      * Created By     :
	      * Created On     :
	      * Reviewed By    :
	      * Reviewed On    :
	     * @return 
	      ************************************************************/
	     public static boolean SelectBranchDetails(WebDriver driver)
	     {
	    	 try{
	    	     PageObjects.BranchesPage.lstCountry(driver).selectByVisibleText(TestData.BranchesPage.sCountry);
	    	     PageObjects.BranchesPage.lstState(driver).selectByVisibleText(TestData.BranchesPage.sState);
	    	     PageObjects.BranchesPage.lstCity(driver).selectByVisibleText(TestData.BranchesPage.sCity);
	    	     return true;
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    		 return false;
	    	 }
	    	 
	     }
	     
	     /***********************************************************
	      * Method Name    : BranchesSearchButton
	      * Method For     : It displays branches details based on the selected Country, State and City
	      * Created By     :
	      * Created On     :
	      * Reviewed By    :
	      * Reviewed On    :
	     * @return 
	      ************************************************************/
	     public static boolean BranchesSearchButton(WebDriver driver)
	     {
	    	 try{
	    	    PageObjects.BranchesPage.imgSearch(driver).click();
	    	     return true;
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    		 return false;
	    	 }
	    	 
	     }
	     
	     /***********************************************************
	      * Method Name    : BranchesClearButton
	      * Method For     : It displays branches details based on the selected Country, State and City
	      * Created By     :
	      * Created On     :
	      * Reviewed By    :
	      * Reviewed On    :
	     * @return 
	      ************************************************************/
	     public static boolean BranchesClearButton(WebDriver driver)
	     {
	    	 try{
	    	    PageObjects.BranchesPage.imgClear(driver).click();
	    	     return true;
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    		 return false;
	    	 }
	    	 
	     }
	     
	     /***********************************************************
	      * Method Name    : NewBranchEntry
	      * Method For     : It fills the fields in new branch entry page with given test data
	      * Created By     :
	      * Created On     :
	      * Reviewed By    :
	      * Reviewed On    :
	     * @return 
	      ************************************************************/
	     public static boolean NewBranchEntry(WebDriver driver, String sBranchName,String sAddress1,String sZipCode,String sCountry,String sState,String sCity)
	     {
	    	 try{
	    	    PageObjects.NewBranchPage.txtBranchName(driver).sendKeys(sBranchName);
	    	    PageObjects.NewBranchPage.txtAddress1(driver).sendKeys(sAddress1);
	    	    PageObjects.NewBranchPage.txtAddress2(driver).sendKeys(TestData.NewBranchPage.sAddress2);
	    	    PageObjects.NewBranchPage.txtAddress3(driver).sendKeys(TestData.NewBranchPage.sAddress3);
	    	    PageObjects.NewBranchPage.txtArea(driver).sendKeys(TestData.NewBranchPage.sArea);
	    	    PageObjects.NewBranchPage.txtZipCode(driver).sendKeys(sZipCode);
	    	    PageObjects.NewBranchPage.lstCountry(driver).selectByVisibleText(sCountry);
	    	    PageObjects.NewBranchPage.lstState(driver).selectByVisibleText(sState);
	    	    PageObjects.NewBranchPage.lstCity(driver).selectByVisibleText(sCity);
	    	     return true;
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    		 return false;
	    	 }
	    	 
	     }
	     
	     /***********************************************************
	      * Method Name    : NewBranchesSubmitButton
	      * Method For     : It creates new branches page
	      * Created By     :
	      * Created On     :
	      * Reviewed By    :
	      * Reviewed On    :
	     * @return 
	      ************************************************************/
	     public static boolean NewBranchesSubmitButton(WebDriver driver)
	     {
	    	 try{
	    	    PageObjects.GlobalPageObjects.imgSubmit(driver).click();
	    	     return true;
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    		 return false;
	    	 }
	    	 
	     }
	     
	     /***********************************************************
	      * Method Name    : NewBranchesResetButton
	      * Method For     : It resets all the fields to default
	      * Created By     :
	      * Created On     :
	      * Reviewed By    :
	      * Reviewed On    :
	     * @return 
	      ************************************************************/
	     public static boolean NewBranchesResetButton(WebDriver driver)
	     {
	    	 try{
	    	    PageObjects.GlobalPageObjects.imgReset(driver).click();
	    	     return true;
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    		 return false;
	    	 }
	    	 
	     }
	     
	     /***********************************************************
	      * Method Name    : NewBranchesCancelButton
	      * Method For     : It navigates to branch details page
	      * Created By     :
	      * Created On     :
	      * Reviewed By    :
	      * Reviewed On    :
	     * @return 
	      ************************************************************/
	     public static boolean NewBranchesCancelButton(WebDriver driver)
	     {
	    	 try{
	    	    PageObjects.GlobalPageObjects.imgCancel(driver).click();
	    	     return true;
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    		 return false;
	    	 }
	    	 
	     }
	     
	     /***********************************************************
	      * Method Name    : NewBranchesHomeButton
	      * Method For     : It navigates to admin home page
	      * Created By     :
	      * Created On     :
	      * Reviewed By    :
	      * Reviewed On    :
	     * @return 
	      ************************************************************/
	     public static boolean NewBranchesHomeButton(WebDriver driver)
	     {
	    	 try{
	    	    PageObjects.GlobalPageObjects.imgHome(driver).click();
	    	     return true;
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    		 return false;
	    	 }
	    	 
	     }
	     
	     /***********************************************************
	      * Method Name    : NewBranchesLogoutButton
	      * Method For     : It navigates to ranford home page
	      * Created By     :
	      * Created On     :
	      * Reviewed By    :
	      * Reviewed On    :
	     * @return 
	      ************************************************************/
	     public static boolean NewBranchesLogoutButton(WebDriver driver)
	     {
	    	 try{
	    	    PageObjects.GlobalPageObjects.imgLogout(driver).click();
	    	     return true;
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    		 return false;
	    	 }
	    	 
	     }
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
}

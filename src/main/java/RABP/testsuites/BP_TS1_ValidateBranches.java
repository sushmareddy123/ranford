package RABP.testsuites;


import org.testng.annotations.Test;

import RABP.appfunctions.AppFunctions;
import locators.Locators;
import utilites.Util;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class BP_TS1_ValidateBranches {
 
WebDriver driver;
Boolean bStatus;

	 @BeforeTest
	 public void preCondition() 
	 {
		 driver= AppFunctions.LaunchApplication();//application launching
		 
		 bStatus=Util.verifyText(driver,"Banker Login");//verifying for banker login Text
		 System.out.println(" static :::::::::::::"+bStatus);
		 
		 if(bStatus)
		 {
			 Reporter.log("browser launched successfully",true);//generating  html report and also print in console tab
		 }
		 else
		 {
			 Reporter.log("Ranford not launched successfully",true);
		 }
	 }
	
	 @Test
     public void testCase() 
	 {
		 System.out.println("Executing the testcase method");
        bStatus= AppFunctions.AdminLogin(driver);//Admin login
        System.out.println(" enter the admincredentials");
        if(bStatus) //verifying admin login
        {

        	Reporter.log("Admin Login successful", true);
          	
        	if(Util.verifyText(driver,"Welcome to Admin"))        	
        	     Reporter.log("verifed welcome to admin",true);
        	else
        		Reporter.log("welcome to admin is not verified");
          }
        else
        {
        	Util.getScreenShot(driver,"adminLogin");
        	Reporter.log("Admin is failed to login", true);        
        }
        
        bStatus=AppFunctions.Branches(driver);//opening branches page
        if(bStatus) //verifying branches page is opened or not
        {
        	Reporter.log("branches home page opend successfully", true);
           	if(Util.verifyObjectExistance(driver,Locators.Branchespage.imgNewBranch))        	
       	     Reporter.log("verifed New Branch",true);
         	else
       		Reporter.log("New Branch is not verified");
        	
        }
        else
        {
        	Util.getScreenShot(driver,"Branches");
        	Reporter.log("failed to login to Branches page", true);
        }
 
        
	 }


     @AfterTest
     public void postCondition() throws Exception 
     {
    	 Thread.sleep(4000);
        bStatus=AppFunctions.BrowserClose(driver);
        if(bStatus)
        {
        	Reporter.log("close the browser", true);
        }
        else
        {
        	Reporter.log("browser is not closed", true);
        }
    }

}

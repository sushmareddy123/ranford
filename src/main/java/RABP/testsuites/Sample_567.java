package RABP.testsuites;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;

import RABP.appfunctions.AppFunctions;
import utilites.Util;

public class Sample_567 {
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
		
}

package RABP.testsuites;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import RABP.appfunctions.AppFunctions;
import utilites.Util;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext ;		
import org.testng.ITestListener ;		


public class Test implements ITestListener{
	WebDriver driver;
	Boolean bStatus;
	@Override
	public void onTestStart(ITestResult result) {
		
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
		
		// TODO Auto-generated method stub
		
	

	@Override
	public void onTestSuccess(ITestResult result) {
		 System.out.println("login passed ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}

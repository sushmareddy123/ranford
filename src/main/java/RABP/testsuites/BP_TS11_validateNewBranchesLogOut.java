package RABP.testsuites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import RABP.appfunctions.AppFunctions;
import utilites.Util;

public class BP_TS11_validateNewBranchesLogOut implements ITestListener {
	WebDriver driver;
	Boolean bStatus;
	 @Test
	    public void loginFB(){
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
	      
	    
	    
	    
	    @Override
	    public void onFinish(ITestContext arg0) {
	        // TODO Auto-generated method stub
	    	System.out.println(" testcase finished");
	       
	    }
	 
	    @Override
	    public void onStart(ITestContext arg0) {
	        // TODO Auto-generated method stub
	    	System.out.println(" testcase onstrat");
	    }
	 
	    @Override
	    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	        // TODO Auto-generated method stub
	       
	    }
	 
	    @Override
	    public void onTestFailure(ITestResult arg0) {
	    
	        System.out.println("Screen shot captured====="+arg0.toString());
	       
	    }
	 
	    @Override
	    public void onTestSkipped(ITestResult arg0) {
	        // TODO Auto-generated method stub
	       
	       
	    }
	 
	    @Override
	    public void onTestStart(ITestResult arg0) {
	        // TODO Auto-generated method stub
	        System.out.println("TestCase started====" +arg0.toString());
	       
	    }
	 
	    @Override
	    public void onTestSuccess(ITestResult arg0) {
	        // TODO Auto-generated method stub
	       
	        System.out.println("Congrates Testcase has been passed===="+ arg0.toString());
	       
	    }
	 
	}
package com.fastrax.web.listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.cipl.automation.property.PropertyManager;
import com.cipl.webdriver.TestBase;
import com.fastrax.web.pages.LoginPage;


public class Retry implements IRetryAnalyzer {
    private int retryCount = 0;
    private int maxRetryCount = 1;

// Below method returns 'true' if the test method has to be retried else 'false' 
//and it takes the 'Result' as parameter of the test method that just ran
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            System.out.println("Retrying test " + result.getName() + " with status "
                    + getResultStatusName(result.getStatus()) + " for the " + (retryCount+1) + " time(s).");
            retryCount++;
            
           // TestBase.switchToSecondBrowser();
          	TestBase.getDriver().manage().deleteAllCookies();
    		TestBase.pause(5000);
    		TestBase.getDriver().get(PropertyManager.getResourceBundle().getString("AUT_URL"));
    		new LoginPage().waitForPageToLoad();
    		
            return true;
        }
        return false;
    }
    
    public String getResultStatusName(int status) {
    	String resultName = null;
    	if(status==1)
    		resultName = "SUCCESS";
    	if(status==2)
    		resultName = "FAILURE";
    	if(status==3)
    		resultName = "SKIP";
		return resultName;
    }    
}
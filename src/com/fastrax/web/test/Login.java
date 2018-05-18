package com.fastrax.web.test;

import org.testng.annotations.Test;

import com.cipl.automation.property.PropertyManager;
import com.cipl.webdriver.TestBase;
import com.fastrax.web.pages.DashboardPage;
import com.fastrax.web.pages.LoginPage;

public class Login {
	
	/**
	 * <dl>
	 * <dt>Summary</dt>
	 * <dd>Login into Website</dd>
	 * <dt>Steps</dt>
	 * <dd>
	 * <ol>
	 * <li>Open Control Center Website
	 * <li>Enter valid UserName and invalid Password
	 * <li>Click on Login button
	 * </ol>
	 * </dd>
	 * <dt>Expected Result:</dt>
	 * <dd>
	 * <ol>
	 * <li>Verify Login window should be visible
	 * <li>Verify Login error message should be present and login should be unsuccessful
	 * </ol>
	 * </dd>
	 * </dl>
	 */
	@Test(description = "Login with valid username & invalid password", priority = 1, enabled = true)
	public void VALID_USERNAME_INVALID_PASSWORD_TC(){
		
		LoginPage loginpage = new LoginPage();
		
		//Switch to first browser
		TestBase.switchToFirstBrowser();
		
		//Navigate to Login page
		loginpage.navigateToPage();
		
		//Current test case name
		new DashboardPage().currentTestCaseName("VALID_USERNAME_INVALID_PASSWORD_TC");
		
		//Entering valid username and invalid password to login
		loginpage.login("admin@admin.com", "Password");
		
		//Wait for Login error message
		loginpage.waitForLoginErrorMessage();
		
		//Verify Login error message
		loginpage.verifyLoginErrorMessage();	
	}
	
	
	/**
	 * <dl>
	 * <dt>Summary</dt>
	 * <dd>Login into Website</dd>
	 * <dt>Steps</dt>
	 * <dd>
	 * <ol>
	 * <li>Open Control Center Website
	 * <li>Enter valid UserName and blank Password
	 * <li>Click on Login button
	 * </ol>
	 * </dd>
	 * <dt>Expected Result:</dt>
	 * <dd>
	 * <ol>
	 * <li>Verify Login window should be visible
	 * <li>Verify "Password is required" message should be present and login should be unsuccessful.
	 * </ol>
	 * </dd>
	 * </dl>
	 */
	@Test(description = "Login with valid username & blank password", priority = 2, enabled = true)
	public void VALID_USERNAME_BLANK_PASSWORD_TC(){
		
		LoginPage loginpage = new LoginPage();
		
		//Switch to first browser
		TestBase.switchToFirstBrowser();
		
		//Navigate to Login page
		loginpage.navigateToPage();
		
		//Current test case name
		new DashboardPage().currentTestCaseName("VALID_USERNAME_BLANK_PASSWORD_TC");
		
		//Refresh page
		new DashboardPage().refreshPage();
		loginpage.waitForPageToLoad();
		
		//Entering valid username and blank password to login
		loginpage.login("admin@admin.com", "");
		
		//Verify password error message
		loginpage.verifyPasswordErrorMessage();	
		
		//Verify login is unsuccessful
		loginpage.verifyAdminPageTitleNotPresent();
		
	}
	
	/**
	 * <dl>
	 * <dt>Summary</dt>
	 * <dd>Login into Website</dd>
	 * <dt>Steps</dt>
	 * <dd>
	 * <ol>
	 * <li>Open Control Center Website
	 * <li>Enter invalid UserName and valid Password
	 * <li>Click on Login button
	 * </ol>
	 * </dd>
	 * <dt>Expected Result:</dt>
	 * <dd>
	 * <ol>
	 * <li>Verify Login window should be visible
	 * <li>Verify login error message should be present and login should be unsuccessful.
	 * </ol>
	 * </dd>
	 * </dl>
	 */
	@Test(description = "Login with invalid username & valid password", priority = 3, enabled = true)
	public void INVALID_USERNAME_VALID_PASSWORD_TC(){
		
		LoginPage loginpage = new LoginPage();
		
		//Switch to first browser
		TestBase.switchToFirstBrowser();
		
		//Navigate to Login page
		loginpage.navigateToPage();
		
		//Current test case name
		new DashboardPage().currentTestCaseName("INVALID_USERNAME_VALID_PASSWORD_TC");
		
		//Refresh page
		new DashboardPage().refreshPage();
		loginpage.waitForPageToLoad();
		
		//Entering invalid username and valid password to login
		loginpage.login("Invalid", 
				PropertyManager.getResourceBundle().getString("adminpassword"));
		
		//Wait for Login error message
		loginpage.waitForLoginErrorMessage();
		
		//Verify Login error message
		loginpage.verifyLoginErrorMessage();
		
	}
	
	/**
	 * <dl>
	 * <dt>Summary</dt>
	 * <dd>Login into Website</dd>
	 * <dt>Steps</dt>
	 * <dd>
	 * <ol>
	 * <li>Open Control Center Website
	 * <li>Enter invalid UserName and invalid Password
	 * <li>Click on Login button
	 * </ol>
	 * </dd>
	 * <dt>Expected Result:</dt>
	 * <dd>
	 * <ol>
	 * <li>Verify Login window should be visible
	 * <li>Verify login error message should be present and login should be unsuccessful.
	 * </ol>
	 * </dd>
	 * </dl>
	 */
	@Test(description = "Login with invalid username & invalid password", priority = 4, enabled = true)
	public void INVALID_USERNAME_INVALID_PASSWORD_TC(){
		
		LoginPage loginpage = new LoginPage();
		
		//Switch to first browser
		TestBase.switchToFirstBrowser();
		
		//Navigate to Login page
		loginpage.navigateToPage();
		
		//Current test case name
		new DashboardPage().currentTestCaseName("INVALID_USERNAME_INVALID_PASSWORD_TC");
		
		//Refresh page
		new DashboardPage().refreshPage();
		loginpage.waitForPageToLoad();
		
		//Entering invalid username and invalid password to login
		loginpage.login("abc", "def");
		
		//Wait for Login error message
		loginpage.waitForLoginErrorMessage();
		
		//Verify Login error message
		loginpage.verifyLoginErrorMessage();	
	
	}
	
	/**
	 * <dl>
	 * <dt>Summary</dt>
	 * <dd>Login into Website</dd>
	 * <dt>Steps</dt>
	 * <dd>
	 * <ol>
	 * <li>Open Control Center Website
	 * <li>Keep blank UserName and blank Password
	 * <li>Click on Login button
	 * </ol>
	 * </dd>
	 * <dt>Expected Result:</dt>
	 * <dd>
	 * <ol>
	 * <li>Verify Login window should be visible
	 * <li>Verify password and username error message should be present and login should be unsuccessful.
	 * </ol>
	 * </dd>
	 * </dl>
	 */
	@Test(description = "Login with blank username & blank password", priority = 6, enabled = true)
	public void BLANK_USERNAME_BLANK_PASSWORD_TC(){
		
		LoginPage loginpage = new LoginPage();
		
		//Switch to first browser
		TestBase.switchToFirstBrowser();
		
		//Navigate to Login page
		loginpage.navigateToPage();
		
		//Current test case name
		new DashboardPage().currentTestCaseName("BLANK_USERNAME_BLANK_PASSWORD_TC");
		
		//Refresh page
		new DashboardPage().refreshPage();
		loginpage.waitForPageToLoad();
	
		//Keep blank username and blank password to login
		loginpage.login("", "");
		
		//Verify username error message
		loginpage.verifyUsernameErrorMessage();	

		//Verify login is unsuccessful
		loginpage.verifyAdminPageTitleNotPresent();
		
	}
	
	/**
	 * <dl>
	 * <dt>Summary</dt>
	 * <dd>Login into Website</dd>
	 * <dt>Steps</dt>
	 * <dd>
	 * <ol>
	 * <li>Open Control Center Website
	 * <li>Enter valid UserName and valid Password
	 * <li>Click on Login button
	 * </ol>
	 * </dd>
	 * <dt>Expected Result:</dt>
	 * <dd>
	 * <ol>
	 * <li>Verify Login window should be visible
	 * <li>Verify Login into Website should be successful and DashBoard page should be open 
	 * </ol>
	 * </dd>
	 * </dl>
	 */
	@Test(description = "Login with valid username & valid password", priority = 7, enabled = true)
	public void VALID_USERNAME_VALID_PASSWORD_TC() {
		
		LoginPage loginpage = new LoginPage();
		DashboardPage dashboardpage = new DashboardPage();
		
		//Switch to first browser
		TestBase.switchToFirstBrowser();
		
		//Navigate to Login page
		loginpage.navigateToPage();
		
		//Current test case name
		new DashboardPage().currentTestCaseName("VALID_USERNAME_VALID_PASSWORD_TC");
		
		//Refresh Page
		dashboardpage.refreshPage();
		loginpage.waitForPageToLoad();
		

		//Entering valid username and password.
		loginpage.login(PropertyManager.getResourceBundle().getString("adminusername"),
						PropertyManager.getResourceBundle().getString("adminpassword"));
		
		//Wait till Title: DashBoard is Present
		loginpage.verifyAdminPageTitle();
		
		//Wait till loading is completed
		dashboardpage.waitForPageToLoad();

	}
}

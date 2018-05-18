package com.fastrax.web.test;

import org.testng.annotations.Test;

import com.cipl.webdriver.TestBase;
import com.fastrax.web.pages.AccountsPage;
import com.fastrax.web.pages.DashboardPage;

public class Accounts {
	
	private static String companyName;
	
	public String getCompanyName(){
		return companyName;
	}
	
	public void setCompanyName(String name){
		this.companyName = name;
	}
	
	

	/**
	 * <dl>
	 * <dt>Summary</dt>
	 * <dd>Create New Account</dd>
	 * <dt>Pre-Conditions</dt>
	 * <dd>DashBoard page should be open</dd>
	 * <dt>Steps</dt>
	 * <dd>
	 * <ol>
	 * <li>Click on Accounts
	 * <li>Click on Accounts > Accounts
	 * <li>Click on Add new button
	 * <li>Enter all the necessary details
	 * <li>Click on Save button
	 * </ol>
	 * </dd>
	 * <dt>Expected Result:</dt>
	 * <dd>
	 * <ol>
	 * <li>Verify New account should be created and visible in Accounts list 
	 * </ol>
	 * </dd>
	 * </dl>
	 */
	@Test(description = "Create New Account", priority = 1, enabled = true)
	public void CREATE_NEW_ACCOUNT_TC() {
		
		DashboardPage dashboardpage = new DashboardPage();
		AccountsPage accountspage = new AccountsPage();
		
		//Switch to first browser
		TestBase.switchToFirstBrowser();
		
		//Navigate to Page and Login into WebSite(if not)
		dashboardpage.navigateToPage();
		
		//Current Test case name
		dashboardpage.currentTestCaseName("CREATE_NEW_ACCOUNT_TC");
		
		//Click on Accounts in Dashboard page
		dashboardpage.navigateToAccounts();
		
		//Wait for Accounts page to load
		accountspage.waitforAccountsPage();
		
		//Click on Accounts in Accounts page
		accountspage.clickOnAccountsInAccounts();
		
		//Create account named as Automation-"Random String"
		String companyname = accountspage.createAccount("Automation-");
		System.out.println(companyname);
		setCompanyName(companyname);
		
		//Click on Accounts in Accounts page
		accountspage.clickOnAccountsInAccounts();
		
		//Verify company name present in accounts
		accountspage.verifyCompanyName(companyname);
		
	}

	
	/**
	 * <dl>
	 * <dt>Summary</dt>
	 * <dd>Create New User</dd>
	 * <dt>Pre-Conditions</dt>
	 * <dd>DashBoard page should be open</dd>
	 * <dt>Steps</dt>
	 * <dd>
	 * <ol>
	 * <li>Click on Accounts
	 * <li>Click on Accounts > Users
	 * <li>Click on Add new button
	 * <li>Enter all the necessary details
	 * <li>Click on Save button
	 * <li>Click on Users
	 * <li>Select your Account name from the dropdown
	 * </ol>
	 * </dd>
	 * <dt>Expected Result:</dt>
	 * <dd>
	 * <ol>
	 * <li>Verify email address of the user should be created and visible in Users list 
	 * </ol>
	 * </dd>
	 * </dl>
	 */
	@Test(description = "Create New User", priority = 2, enabled = true)
	public void CREATE_NEW_USER_TC() {
		
		DashboardPage dashboardpage = new DashboardPage();
		AccountsPage accountspage = new AccountsPage();
		
		//Switch to first browser
		TestBase.switchToFirstBrowser();
		
		//Navigate to Page and Login into WebSite(if not)
		dashboardpage.navigateToPage();
		
		//Current Test case name
		dashboardpage.currentTestCaseName("CREATE_NEW_USER_TC");
		
		//Wait for Accounts page to load
		accountspage.waitforAccountsPage();
		
		//Click on Users in Accounts page
		accountspage.clickOnUsersInAccounts();
		
		String name = getCompanyName();
		System.out.println("Company Name:" + name);
		
		//Create account named as Automation-"Random String"
		String emailaddr = accountspage.createUser(name);
		System.out.println(emailaddr);
		
		//Click on Users in Accounts page
		accountspage.clickOnUsersInAccounts();
		
		//Verify Email Address present in users
		accountspage.verifyEmailAddr(emailaddr, companyName);
		
	}
	
}

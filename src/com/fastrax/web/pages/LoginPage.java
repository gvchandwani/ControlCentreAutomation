package com.fastrax.web.pages;

import com.cipl.annotation.FindBy;
import com.cipl.automation.property.PropertyManager;
import com.cipl.utility.Reporter;
import com.cipl.utility.Reporter.MessageType;
import com.cipl.webdriver.TWWebdriverBaseTestPage;
import com.cipl.webdriver.TWWebdriverTestPage;
import com.cipl.webdriver.TestBase;
import com.cipl.webelement.TWWebElement;
import com.fastrax.web.locator.Locators.Pages.LoginPageLocators;

public class LoginPage extends TWWebdriverBaseTestPage<TWWebdriverTestPage>implements LoginPageLocators {

	
	/*
	 * Below are the Locators of Elements and locators are stored in locators.java file
	 */
	@FindBy(locator = LOC_TXT_USERNAME, name = "Username Textbox")
	private TWWebElement txtUsername;

	@FindBy(locator = LOC_TXT_PASSWORD, name = "Password Textbox")
	private TWWebElement txtPassword;

	@FindBy(locator = LOC_BTN_SIGNIN, name = "SignIn button")
	private TWWebElement btnSignin;
	
	@FindBy(locator = LOC_LOGIN_ERROR_MSG, name = "Login Error Message")
	private TWWebElement loginErrorMsg;
	
	@FindBy(locator = LOC_PASSWORD_ERROR_MSG, name = "Password Error Message")
	private TWWebElement passwordErrorMsg;

	@FindBy(locator = LOC_USERNAME_ERROR_MSG, name = "Username Error Message")
	private TWWebElement usernameErrorMsg;
	
	@FindBy(locator = LOC_SHOW_PASSWORD, name = "Show Password")
	private TWWebElement showPass;
	
	@FindBy(locator = LOC_SHOW_PASSWORD_FIELD, name = "Show Password Field")
	private TWWebElement showPassField;
	
	/*
	 * Below are the Return methods of all the locators
	 */
	public TWWebElement getTxtUsername() {
		return txtUsername;
	}

	public TWWebElement getTxtPassword() {
		return txtPassword;
	}

	public TWWebElement getBtnSignin() {
		return btnSignin;
	}
	
	public TWWebElement getLoginErrorMsg() {
		return loginErrorMsg;
	}
	
	public TWWebElement getPasswordErrorMsg() {
		return passwordErrorMsg;
	}
	
	public TWWebElement getUsernameErrorMsg() {
		return usernameErrorMsg;
	}

	public TWWebElement getShowPass() {
		return showPass;
	}
	
	public TWWebElement getShowPassField() {
		return showPassField;
	}
	
	
	/*
	 * Below are the Override methods which will ensure that Page is already Opened , Open Page and Wait for Page to Load
	 */
	@Override
	public boolean isPageOpen(Object... Args) {
		return getTxtUsername().isPresent() && getTxtUsername().isDisplayed();
	}

	@Override
	public void openPage(Object... Args) {
		TestBase.getDriver().get(PropertyManager.getResourceBundle().getString("AUT_URL"));
	}

	@Override
	public void waitForPageToLoad() {
		//TestBase.getDriver().waitForJQueryComplete();
		getTxtUsername().waitForPresent();
		TestBase.pause(5000);
	}

	
	/*
	 * Method Description: 
	 * Click on SignIn
	 */
	public void clickOnSignIn() {
		getBtnSignin().click();
	}

	
	/*
	 * Method Description: 
	 * Login into WebSite by Sending UserName and Password as parameter
	 */
	public void login(String user, String pass) {
		getTxtUsername().clear();
		getTxtPassword().clear();
		getTxtUsername().sendKeys(user);
		getTxtPassword().sendKeys(pass);
		getBtnSignin().click();
		TestBase.pause(10000);
	}
	
	
	/*
	 * Below are Wait methods for different elements
	 */
	public void waitForUserNameErrorMessage(){
		getUsernameErrorMsg().waitForVisible();
	}
	
	public void waitForLoginErrorMessage(){
		getLoginErrorMsg().waitForVisible();
	}
	
	public void verifyAdminPageTitle(){
		TestBase.getDriver().waitForTitle("Dashboard :: Administration");
		TestBase.getDriver().verifyTitle("Dashboard :: Administration");
	}
	
	public void verifyAdminPageTitleNotPresent(){
		TestBase.getDriver().verifyNotTitle("Dashboard :: Administration");
	}
	
	/*
	 * Method Description: 
	 * Verifying the error message, when username or password are incorrect
	 */
	public void verifyLoginErrorMessage() {
		getLoginErrorMsg().verifyPresent();
		String errormsg = getLoginErrorMsg().getText();
		System.out.println(errormsg);
		
		if(errormsg.contains("These credentials do not match our records")){
			Reporter.log("Error message:" + errormsg + "is Present", MessageType.PASS);
		}
		else{
			Reporter.log("Error message:" + errormsg + "is not Present", MessageType.FAIL);
		}
	}
	
	/*
	 * Method Description: 
	 * Verifying the error message, when password field is blank
	 */
	public void verifyPasswordErrorMessage() {
		String value = getPasswordErrorMsg().getAttribute("required");
		if(value != null){
			Reporter.log("Please fill out this field message is present", MessageType.PASS);
		}
		else{
			Reporter.log("Please fill out this field message is not present", MessageType.FAIL);
		}
	}

	/*
	 * Method Description: 
	 * Verifying the error message, when username field is blank
	 */
	public void verifyUsernameErrorMessage() {
		String value = getUsernameErrorMsg().getAttribute("required");
		if(value != null){
			Reporter.log("Please fill out this field message is present", MessageType.PASS);
		}
		else{
			Reporter.log("Please fill out this field message is not present", MessageType.FAIL);
		}
	}
}
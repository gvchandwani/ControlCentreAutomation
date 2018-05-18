package com.fastrax.web.pages;

import com.cipl.annotation.FindBy;
import com.cipl.automation.property.PropertyManager;
import com.cipl.webdriver.TestBase;
import com.cipl.webelement.TWWebElement;
import com.fastrax.web.locator.Locators.Pages.DashboardPageLocators;

public class DashboardPage extends TemplatePage<LoginPage> implements DashboardPageLocators {

	
	/*
	 * Below are the Locators of Elements and locators are stored in locators.java file
	 */
	@FindBy(locator = LOC_HOME_LINK, name = "Home Link")
	private TWWebElement linkHome;

	@FindBy(locator = LOC_DASHBOARD_ACCOUNTS, name = "Accounts on Dashboard page")
	private TWWebElement accountsDashboard;
	
	
	
	
	/*
	 * Below are the Return methods of all the locators
	 */
	
	public TWWebElement getLinkHome() {
		return linkHome;
	}
	
	public TWWebElement getAccountsDashboard() {
		return accountsDashboard;
	}
	
	
	/*
	 * Below are the Click methods for different elements 
	 */
	
	public void clickOnHomeBtn() {
		getLinkHome().click();
	}

	public void navigateToAccounts() {
		getAccountsDashboard().click();
	}
	
		
	/*
	 * Below are the Override methods which will ensure that Page is already Opened , Open Page and Wait for Page to Load
	 */
	@Override
	public boolean isPageOpen(Object... Args) {
		//return getDialogWindow().verifyNotPresent() && getMnuInformation().isPresent() && getMnuInformation().isDisplayed();
		return getLinkHome().isPresent() && getLinkHome().isDisplayed();
	}

	@Override
	protected void openPage(Object... Args) {
		parent.navigateToPage();
		parent.login(PropertyManager.getResourceBundle().getString("adminusername"),
				PropertyManager.getResourceBundle().getString("adminpassword"));
	}

	@Override
	public void waitForPageToLoad() {
		getLinkHome().waitForPresent();
		getLinkHome().waitForVisible();
		//getBtnHome().waitForEnable();

		// Temporary wait
		TestBase.pause(10000);
	}

	
	/*
	 * Below are Wait methods for different elements
	 */
	
	
	/*
	 * Below are the Methods for finding specific element/s
	 * @return specific the element/s
	 */
	public TWWebElement getFolder(String name) {
		return this.findelement("xpath=.//*[@class='hover grid-text']/*[contains(text(), '" + name + "') and @data-type='folder']",
				"Folder : " + name);
	}

	public TWWebElement getFiles(String name) {
		return this.findelement("xpath=.//*[@class='hover grid-text']/*[contains(text(), '" + name + "') and @data-type='file']",
				"File : " + name);
	}

}


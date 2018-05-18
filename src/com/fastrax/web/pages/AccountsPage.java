package com.fastrax.web.pages;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import com.cipl.annotation.FindBy;
import com.cipl.automation.property.PropertyManager;
import com.cipl.utility.Reporter;
import com.cipl.utility.Reporter.MessageType;
import com.cipl.webdriver.TestBase;
import com.cipl.webelement.TWWebElement;
import com.fastrax.web.locator.Locators.Pages.AccountsPageLocators;

public class AccountsPage extends TemplatePage<LoginPage> implements AccountsPageLocators {

	
	/*
	 * Below are the Locators of Elements and locators are stored in locators.java file
	 */
		
	@FindBy(locator = LOC_ACCOUNTS_IN_ACCOUNTS, name = "Accounts in Accounts page")
	private TWWebElement accountsInAccounts;
	
	@FindBy(locator = LOC_ACCOUNTS_PAGE, name = "Accounts page")
	private TWWebElement accountsPage;
	
	@FindBy(locator = LOC_ACCOUNTS_FIRST_NAME, name = "Account First Name")
	private TWWebElement firstName;
	
	@FindBy(locator = LOC_ACCOUNTS_LAST_NAME, name = "Account Last Name")
	private TWWebElement lastName;
	
	@FindBy(locator = LOC_ACCOUNTS_EMAIL, name = "Account Email Address")
	private TWWebElement emailAddr;
	
	@FindBy(locator = LOC_ACCOUNTS_PASSWORD, name = "Account Password")
	private TWWebElement password;
	
	@FindBy(locator = LOC_ACCOUNTS_CONFIRM_PASSWORD, name = "Account Confirm Password")
	private TWWebElement confirmPassword;
	
	@FindBy(locator = LOC_ACCOUNTS_COMPANY, name = "Company Name")
	private TWWebElement companyName;
	
	@FindBy(locator = LOC_SELECT_SC_COMPANY, name = "Screen Connect Company Dropdown")
	private TWWebElement selectScCompany;
	
	@FindBy(locator = LOC_SELECT_ACCOUNT_PACKAGE, name = "Account Package Dropdown")
	private TWWebElement selectAccPackage;
	
	@FindBy(locator = LOC_ACCOUNTS_PHONE, name = "Account Phone Number")
	private TWWebElement phone;
	
	@FindBy(locator = LOC_ACCOUNTS_ADDRESS, name = "Account Address")
	private TWWebElement addr;
	
	@FindBy(locator = LOC_ACCOUNTS_CITY, name = "Account City")
	private TWWebElement city;
	
	@FindBy(locator = LOC_ACCOUNTS_STATE_DROPDOWN, name = "Account State Dropdown")
	private TWWebElement stateDropDown;
	
	@FindBy(locator = LOC_ACCOUNTS_STATE, name = "Account State")
	private TWWebElement state;
	
	@FindBy(locator = LOC_ACCOUNTS_ZIP, name = "Account ZIP")
	private TWWebElement zip;
	
	@FindBy(locator = LOC_IS_ADMIN_TOGGLE_ON, name = "Is Admin - Toggle ON")
	private TWWebElement isAdminToggleOn;
	
	@FindBy(locator = LOC_IS_ADMIN_CHKBOX, name = "Is Admin - Admin Checkbox")
	private TWWebElement chkbxAdmin;
	
	@FindBy(locator = LOC_ACCOUNTS_TABLE_NEXT_BTN, name = "Next button in Accounts Table")
	private TWWebElement nxtBtn;
	
	@FindBy(locator = LOC_ACCOUNTS_USERS, name = "Users in Accounts page")
	private TWWebElement usersAccounts;
	
	@FindBy(locator = LOC_ACCOUNTS_USERS_ACCNAME_DROPDOWN, name = "Account name dropdown in Users")
	private TWWebElement accNameDropDown;
	
	@FindBy(locator = LOC_ACCOUNTS_USERNAME, name = "Username")
	private TWWebElement username;
	
	@FindBy(locator = LOC_ACTIVE_TOGGLE_ON, name = "Active - Toggle ON")
	private TWWebElement activeToggleON;
	
	@FindBy(locator = LOC_ACCOUNTS_USERS_MAIN_ACCNAME_DROPDOWN, name = "Main Account name dropdown in Users")
	private TWWebElement mainAccNameDropDownUsers;
	
	/*
	 * Below are the Return methods of all the locators
	 */
	
	public TWWebElement getAccountsPage() {
		return accountsPage;
	}
	
	public TWWebElement getAccountsInAccounts() {
		return accountsInAccounts;
	}
	
	public TWWebElement getFirstName() {
		return firstName;
	}
	
	public TWWebElement getLastName() {
		return lastName;
	}
	
	public TWWebElement getEmailAddr() {
		return emailAddr;
	}
	
	public TWWebElement getPassword() {
		return password;
	}
	
	public TWWebElement getConfirmPassword() {
		return confirmPassword;
	}
	
	public TWWebElement getCompanyName() {
		return companyName;
	}
	
	public TWWebElement getSelectScCompany() {
		return selectScCompany;
	}
	
	public TWWebElement getSelectAccPackage() {
		return selectAccPackage;
	}
	
	public TWWebElement getPhone() {
		return phone;
	}
	
	public TWWebElement getAddr() {
		return addr;
	}
	
	public TWWebElement getCity() {
		return city;
	}
	
	public TWWebElement getStateDropDown() {
		return stateDropDown;
	}
	
	public TWWebElement getState() {
		return state;
	}
	
	public TWWebElement getZip() {
		return zip;
	}
	
	public TWWebElement getIsAdminToggleOn() {
		return isAdminToggleOn;
	}
	
	public TWWebElement getNxtBtn() {
		return nxtBtn;
	}
	
	public TWWebElement getChkbxAdmin() {
		return chkbxAdmin;
	}
	
	public TWWebElement getUsersAccounts() {
		return usersAccounts;
	}
	
	public TWWebElement getAccNameDropDown() {
		return accNameDropDown;
	}
	
	public TWWebElement getUsername() {
		return username;
	}
	
	public TWWebElement getActiveToggleON() {
		return activeToggleON;
	}
	
	public TWWebElement getMainAccNameDropDownUsers() {
		return mainAccNameDropDownUsers;
	}
	
	/*
	 * Below are the Click methods for different elements 
	 */
		
	public void clickOnAccountsInAccounts() {
		getAccountsInAccounts().click();
	}
	
	public void clickOnUsersInAccounts() {
		getUsersAccounts().click();
	}
	
		
	/*
	 * Below are the Override methods which will ensure that Page is already Opened , Open Page and Wait for Page to Load
	 */
	@Override
	public boolean isPageOpen(Object... Args) {
		//return getDialogWindow().verifyNotPresent() && getMnuInformation().isPresent() && getMnuInformation().isDisplayed();
		return getAccountsPage().isPresent() && getAccountsPage().isDisplayed();
	}

	@Override
	protected void openPage(Object... Args) {
		parent.navigateToPage();
		parent.login(PropertyManager.getResourceBundle().getString("adminusername"),
				PropertyManager.getResourceBundle().getString("adminpassword"));
		new DashboardPage().navigateToAccounts();
	}

	@Override
	public void waitForPageToLoad() {
		getAccountsPage().waitForPresent();
		getAccountsPage().waitForVisible();
		//getBtnHome().waitForEnable();

		// Temporary wait
		TestBase.pause(10000);
	}

	
	/*
	 * Below are Wait methods for different elements
	 */
	
	public void waitforAccountsPage(){
		getAccountsPage().waitForVisible();
	}
	
	
	/*
	 * Below are the Methods for finding specific element/s
	 * @return specific the element/s
	 */
	public TWWebElement stateName(String name) {
		return this.findelement("xpath=.//*[@id='select2-state-results']/li[contains(text(),'"+ name +"')]",
				"State : " + name);
	}

	public TWWebElement companyNameInAccTable(String name) {
		return this.findelement("xpath=.//*[@data-head='Company Name']/a[contains(text(),'"+ name +"')]",
				"Company Name : " + name);
	}
	
	public TWWebElement accName(String name) {
		return this.findelement("xpath=.//*[@id='select2-account_id-results']/li[contains(text(),'"+ name +"')]",
				"Account Name : " + name);
	}
	
	public TWWebElement emailAddrinUsersTable(String emailid) {
		return this.findelement("xpath=.//*[@data-head='User Email']/a[contains(text(),'"+ emailid +"')]",
				"User Email Address : " + emailid);
	}
	
	public TWWebElement mainAccName(String name) {
		return this.findelement("xpath=.//*[@id='select2-subAccount-results']/li[contains(text(),'"+ name +"')]",
				"Main Account Name : " + name);
	}
	
	/*
	 * Below are Click methods for different elements
	 */
	
	public void clickOnNextBtn() {
		getNxtBtn().click();
	}
	
	public void clickOnAdminChkBx() {
		getChkbxAdmin().click();
	}
	
	/*
	 * Method Description:
	 * Move to Specific element
	 */

	public void moveToElement(TWWebElement element){
		//new Actions(TestBase.getDriver()).moveToElement(element).perform();
		JavascriptExecutor js = (JavascriptExecutor) TestBase.getDriver();
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	
	public String fillRandomFirstName(){
		String uuid = RandomStringUtils.randomAlphanumeric(5);
		String firstname = "FirstName-" + uuid;
		getFirstName().sendKeys(firstname);
		return firstname;
	}
	
	public String fillRandomLastName(){
		String uuid = RandomStringUtils.randomAlphanumeric(5);
		String lastname = "LastName-" + uuid;
		getLastName().sendKeys(lastname);
		return lastname;
	}
	
	public String fillRandomEmailAddr(){
		String uuid = RandomStringUtils.randomAlphanumeric(5);
		String emailaddr = "Automation-" + uuid + "@gmail.com";
		getEmailAddr().sendKeys(emailaddr);
		return emailaddr;
	}
	
	
	/*
	 * Method Description:
	 * Create account as per the account name passed as parameter
	 */
	public String createAccount(String companyname) {
		clickOnAddNewBtn();
		
		//String uuid = UUID.randomUUID().toString();
		//String uuid = Long.toString(UUID.randomUUID().getMostSignificantBits(), 10);
		String uuid = RandomStringUtils.randomAlphanumeric(5);
		//getFirstName().sendKeys("FirstName-" + uuid);
		fillRandomFirstName();
		
		//getLastName().sendKeys("LastName-" + uuid);
		fillRandomLastName();
		
		//getEmailAddr().sendKeys("Automation-" + uuid + "@gmail.com");
		fillRandomEmailAddr();
		
		
		getPassword().sendKeys("Admin@123");
		getConfirmPassword().sendKeys("Admin@123");
		
		String name = companyname + uuid;
		getCompanyName().sendKeys(name);
		
		moveToElement(getSelectScCompany());
		getSelectScCompany().click();
		Select sc = new Select(getSelectScCompany());
		sc.selectByValue("1");
		
		moveToElement(getZip());
		getSelectAccPackage().click();
		Select accPackage = new Select(getSelectAccPackage());
		accPackage.selectByVisibleText("Unlimited Package");
				
		String number = RandomStringUtils.randomNumeric(10);
		getPhone().sendKeys(number);
		
		getAddr().sendKeys("Address-" + uuid);
		getCity().sendKeys("City-" + uuid);
		
		moveToElement(getZip());
		getStateDropDown().click();
//		Select state = new Select(getState());
//		state.selectByValue("CA");
		stateName("California").click();
		
		String zip = RandomStringUtils.randomNumeric(5);
		getZip().sendKeys(zip);
		
		TestBase.pause(5000);
		
		moveToElement(getBtnSave());
		getIsAdminToggleOn().click();
		clickOnAdminChkBx();
		
		clickOnSaveBtn();
		TestBase.pause(10000);
		
		return name;
	}
	
	public void verifyCompanyName(String name){
		while(companyNameInAccTable(name).isPresent() != true) {
			if(getNxtBtn().isEnabled() == true && getNxtBtn().isPresent() == true){
				clickOnNextBtn();
				TestBase.pause(2000);
			}
			else{
				Reporter.log("Company Name is not Present", MessageType.FAIL);
			}
		}
		companyNameInAccTable(name).verifyPresent();
		
	}
	
	
	/*
	 * Method Description:
	 * Create account as per the account name passed as parameter
	 */
	public String createUser(String companyname) {
		clickOnAddNewBtn();
		
		getAccNameDropDown().click();
		TestBase.pause(2000);
		accName(companyname).click();
		fillRandomFirstName();
		fillRandomLastName();
		getUsername().click();
		String emailaddr = fillRandomEmailAddr();
		getPassword().sendKeys("Admin@123");
		getConfirmPassword().sendKeys("Admin@123");
		
		moveToElement(getActiveToggleON());
		getActiveToggleON().click();
		
		
		moveToElement(getBtnSave());
		clickOnSaveBtn();
		return emailaddr;
	}
	
	public void verifyEmailAddr(String emailid, String companyName){
		getMainAccNameDropDownUsers().click();
		mainAccName(companyName).click();
		while(emailAddrinUsersTable(emailid).isPresent() != true) {
			if(getNxtBtn().isEnabled() == true && getNxtBtn().isPresent() == true){
				clickOnNextBtn();
				TestBase.pause(2000);
			}
			else{
				Reporter.log("User Email Address is not Present", MessageType.FAIL);
			}
		}
		emailAddrinUsersTable(emailid).verifyPresent();
		
	}
	
}


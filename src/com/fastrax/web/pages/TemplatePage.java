package com.fastrax.web.pages;

import org.openqa.selenium.interactions.Actions;

import com.cipl.annotation.FindBy;
import com.cipl.webdriver.TWWebdriverBaseTestPage;
import com.cipl.webdriver.TWWebdriverTestPage;
import com.cipl.webdriver.TestBase;
import com.cipl.webelement.TWWebElement;
import com.fastrax.web.locator.Locators.Pages.TemplatePageLocators;

/**
 * TemplatePage Class works for all the Pages
 */

public class TemplatePage<P extends TWWebdriverTestPage> extends TWWebdriverBaseTestPage<P> 
	implements TemplatePageLocators {

	@FindBy(locator = LOC_ADD_NEW_BTN, name = "Add New button")
	private TWWebElement btnAddNew;

	@FindBy(locator = LOC_SAVE_BTN, name = "Save button")
	private TWWebElement btnSave;
	
	public TWWebElement getBtnAddNew() {
		return btnAddNew;
	}
	
	public TWWebElement getBtnSave() {
		return btnSave;
	}
	
	public String currentTestCaseName(String name) {
		
		System.out.println("------------------------------");
		System.out.println("Currently "+name+" is being executed");
		System.out.println("------------------------------");
		
		return null;
	}
	
	public void clickOnAddNewBtn() {
		getBtnAddNew().click();
	}
	
	public void clickOnSaveBtn() {
		getBtnSave().click();
	}
	
	/*
	 * Method Description :
	 * Below method is for refresh the page
	 */
	public void refreshPage(){
		TestBase.getDriver().get(TestBase.getDriver().getCurrentUrl());
	}
	
}
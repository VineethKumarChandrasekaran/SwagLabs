package com.ecommerce.objectrepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Gaurav Singh
 */
public class CheckOutPage {

	@FindBy(id = "first-name")
	private WebElement firstnameTextfield;
	
	@FindBy(id = "last-name")
	private WebElement lastnameTextfield;
	
	@FindBy(id = "postal-code")
	private WebElement postalTextfield;
	
	@FindBy(id = "cancel")
	private WebElement cancelButton;
	
	@FindBy(id = "continue")
	private WebElement continueButton;
	
	public CheckOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstnameTextfield() {
		return firstnameTextfield;
	}

	public WebElement getLastnameTextfield() {
		return lastnameTextfield;
	}

	public WebElement getPostalTextfield() {
		return postalTextfield;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}
	
	public void checkout(String firstname, String lastname, String zipcode) throws IOException {
		getFirstnameTextfield().sendKeys(firstname);
		getLastnameTextfield().sendKeys(lastname);
		getPostalTextfield().sendKeys(zipcode);
	}
}

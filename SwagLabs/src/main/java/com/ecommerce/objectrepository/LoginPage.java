package com.ecommerce.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Gaurav Singh
 */
public class LoginPage {
	
	@FindBy(id = "user-name")
	private WebElement usernameTextfield;
	
	@FindBy(id = "password")
	private WebElement passwordTextfield;
	
	@FindBy(id = "login-button")
	private WebElement loginButton;
	
	@FindBy(xpath = "//h3[@data-test='error']")
	private WebElement errormessage;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsernameTextfield() {
		return usernameTextfield;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public WebElement getErrormessage() {
		return errormessage;
	}

	public void login(String username, String password) {
		getUsernameTextfield().clear();
		getUsernameTextfield().sendKeys(username);
		getPasswordTextfield().clear();
		getPasswordTextfield().sendKeys(password);
		getLoginButton().click();
	}
}

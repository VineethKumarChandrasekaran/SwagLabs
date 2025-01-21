package com.ecommerce.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Gaurav Singh
 */
public class CheckOutCompletePage {

	@FindBy(id = "back-to-products")
	private WebElement backhomeButton;
	
	@FindBy(className = "complete-header")
	private WebElement headerText;
	
	@FindBy(className = "complete-text")
	private WebElement bodyText;
	
	public CheckOutCompletePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getBackhomeButton() {
		return backhomeButton;
	}

	public WebElement getHeaderText() {
		return headerText;
	}

	public WebElement getBodyText() {
		return bodyText;
	}
}

package com.ecommerce.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Gaurav Singh
 */
public class CheckOutOverviewPage {

	@FindBy(id = "cancel")
	private WebElement cancelButton;
	
	@FindBy(id = "finish")
	private WebElement finishButton;
	
	public CheckOutOverviewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getFinishButton() {
		return finishButton;
	}
}

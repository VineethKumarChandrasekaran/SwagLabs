package com.ecommerce.objectrepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Vineeth Kumar C
 */
public class CheckOutOverviewPage {

	@FindBy(id = "cancel")
	private WebElement cancelButton;
	
	@FindBy(id = "finish")
	private WebElement finishButton;
	
	@FindBy(xpath = "//div[@class='inventory_item_price']")
	private List<WebElement> itemprice;
	
	@FindBy(xpath = "//div[@class='summary_subtotal_label']")
	private WebElement subtotalprice;
	
	@FindBy(xpath = "//div[@class='summary_tax_label']")
	private WebElement taxprice;
	
	@FindBy(xpath = "//div[@class='summary_total_label']")
	private WebElement totalprice;
	
	public CheckOutOverviewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getFinishButton() {
		return finishButton;
	}

	public List<WebElement> getItemprice() {
		return itemprice;
	}

	public WebElement getSubtotalprice() {
		return subtotalprice;
	}

	public WebElement getTaxprice() {
		return taxprice;
	}

	public WebElement getTotalprice() {
		return totalprice;
	}
}

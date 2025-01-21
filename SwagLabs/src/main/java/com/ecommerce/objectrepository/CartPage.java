package com.ecommerce.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Gaurav Singh
 */
public class CartPage {

	@FindBy(id = "remove-sauce-labs-backpack")
	private WebElement backpackRemove;
	
	@FindBy(id = "remove-sauce-labs-bike-light")
	private WebElement bikelightRemove;
	
	@FindBy(id = "remove-sauce-labs-fleece-jacket")
	private WebElement fleecejacketRemove;
	
	@FindBy(id = "remove-sauce-labs-bolt-t-shirt")
	private WebElement bolttshirtRemove;
	
	@FindBy(id = "remove-sauce-labs-onesie")
	private WebElement onesieRemove;
	
	@FindBy(id = "remove-test.allthethings()-t-shirt-(red)")
	private WebElement redtshirtRemove;
	
	@FindBy(id = "continue-shopping")
	private WebElement continueshoppingButton;
	
	@FindBy(id = "checkout")
	private WebElement checkoutButton;
	
	@FindBy(className = "shopping_cart_badge")
	private WebElement cartitemcount;
	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getBackpackRemove() {
		return backpackRemove;
	}

	public WebElement getBikelightRemove() {
		return bikelightRemove;
	}

	public WebElement getFleecejacketRemove() {
		return fleecejacketRemove;
	}

	public WebElement getBolttshirtRemove() {
		return bolttshirtRemove;
	}

	public WebElement getOnesieRemove() {
		return onesieRemove;
	}

	public WebElement getRedtshirtRemove() {
		return redtshirtRemove;
	}

	public WebElement getContinueshoppingButton() {
		return continueshoppingButton;
	}

	public WebElement getCheckoutButton() {
		return checkoutButton;
	}

	public WebElement getCartitemcount() {
		return cartitemcount;
	}
}

package com.ecommerce.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Gaurav Singh
 */
public class HomePage {

	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement backpackAddtocart;
	
	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	private WebElement bikelightAddtocart;
	
	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement bolttshirtAddtocart;
	
	@FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
	private WebElement fleecejacketAddtocart;
	
	@FindBy(id = "add-to-cart-sauce-labs-onesie")
	private WebElement onsieAddtocart;
	
	@FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
	private WebElement redtshirtAddtocart;
	
	@FindBy(className = "shopping_cart_link")
	private WebElement cartlink;
	
	@FindBy(id = "inventory_sidebar_link")
	private WebElement allitemsLink;
	
	@FindBy(id = "about_sidebar_link")
	private WebElement aboutLink;
	
	@FindBy(id = "logout_sidebar_link")
	private WebElement logoutLink;
	
	@FindBy(id = "reset_sidebar_link")
	private WebElement resetLink;
	
	@FindBy(id = "react-burger-menu-btn")
	private WebElement openmenuButton;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getBackpackAddtocart() {
		return backpackAddtocart;
	}

	public WebElement getBikelightAddtocart() {
		return bikelightAddtocart;
	}

	public WebElement getBolttshirtAddtocart() {
		return bolttshirtAddtocart;
	}

	public WebElement getFleecejacketAddtocart() {
		return fleecejacketAddtocart;
	}

	public WebElement getOnsieAddtocart() {
		return onsieAddtocart;
	}

	public WebElement getRedtshirtAddtocart() {
		return redtshirtAddtocart;
	}

	public WebElement getCartlink() {
		return cartlink;
	}

	public WebElement getAllitemsLink() {
		return allitemsLink;
	}

	public WebElement getAboutLink() {
		return aboutLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getResetLink() {
		return resetLink;
	}

	public WebElement getOpenmenuButton() {
		return openmenuButton;
	}
	
	public void logout() {
		getOpenmenuButton().click();
		getLogoutLink().click();
	}
}

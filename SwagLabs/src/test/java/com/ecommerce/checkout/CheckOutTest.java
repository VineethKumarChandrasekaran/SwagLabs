package com.ecommerce.checkout;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ecommerce.generic.baseclass.BaseClass;
import com.ecommerce.objectrepository.CartPage;
import com.ecommerce.objectrepository.CheckOutOverviewPage;
import com.ecommerce.objectrepository.CheckOutPage;
import com.ecommerce.objectrepository.HomePage;
@Listeners(com.ecommerce.generic.listenerutilities.ListenerUtility.class)
public class CheckOutTest extends BaseClass{
	public HomePage homepage;
	public CartPage cartpage;
	public CheckOutPage checkoutpage;
	public CheckOutOverviewPage checkoutoverviewpage;
	
	@Test
	public void checkOut() throws IOException {
		homepage = new HomePage(driver);
		cartpage = new CartPage(driver);
		checkoutpage = new CheckOutPage(driver);
		checkoutoverviewpage = new CheckOutOverviewPage(driver);
		
		double calculatedprice = 0;
		
        login(fileutility.getDataFromPropertyFile("username"), fileutility.getDataFromPropertyFile("password"));
		
		homepage.getBackpackAddtocart().click();
		homepage.getBikelightAddtocart().click();
		homepage.getBolttshirtAddtocart().click();
		homepage.getFleecejacketAddtocart().click();
		homepage.getOnsieAddtocart().click();
		homepage.getRedtshirtAddtocart().click();
		
		homepage.getCartlink().click();
		
		webdriverutility.jsScrollToBottom(driver);
		
		cartpage.getCheckoutButton().click();
		
		checkoutpage.checkout(fileutility.getDataFromPropertyFile("firstname"), 
				fileutility.getDataFromPropertyFile("lastname"), fileutility.getDataFromPropertyFile("zipcode"));
		
		checkoutpage.getContinueButton().click();
		
		for (WebElement itemprice : checkoutoverviewpage.getItemprice()) {
			String pricetext = itemprice.getText().replace("$", "").trim();
			Double cartitemprice = Double.parseDouble(pricetext);
			calculatedprice+=cartitemprice;
		}
		
		String subtotaltext = checkoutoverviewpage.getSubtotalprice().getText().replace("Item total: $", "").trim();
		double actualprice = Double.parseDouble(subtotaltext);
		
		Assert.assertEquals(actualprice, calculatedprice,"Item prices and Total Price are not matching");

	}
}

package com.ecommerce.addtocart;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ecommerce.generic.baseclass.BaseClass;
import com.ecommerce.objectrepository.CartPage;
import com.ecommerce.objectrepository.HomePage;
@Listeners(com.ecommerce.generic.listenerutilities.ListenerUtility.class)
public class CartValidationTest extends BaseClass {
	public HomePage homepage;
	public CartPage cartpage;
	@Test(groups = {"regression","smoke"})
	public void cartValidation() throws IOException {
		homepage = new HomePage(driver);
		cartpage = new CartPage(driver);
		int itemcount =0;
		
		login(fileutility.getDataFromPropertyFile("username"), fileutility.getDataFromPropertyFile("password"));
		
		homepage.getBackpackAddtocart().click();
		homepage.getBikelightAddtocart().click();
		homepage.getBolttshirtAddtocart().click();
		homepage.getFleecejacketAddtocart().click();
		homepage.getOnsieAddtocart().click();
		homepage.getRedtshirtAddtocart().click();
		
		homepage.getCartlink().click();
		
		for (WebElement element :cartpage.getItemcount()) {
			itemcount++;
		}
		
		int actualitemcount = Integer.parseInt(cartpage.getCartitemcount().getText());
		
		Assert.assertEquals(itemcount, actualitemcount,"Cart Item count is Mismatching");
		
		cartpage.getContinueshoppingButton();
		logout();
		
	}

}

package com.ecommerce.addtocart;

import org.testng.annotations.Test;

import com.ecommerce.generic.baseclass.BaseClass;
import com.ecommerce.objectrepository.CartPage;
import com.ecommerce.objectrepository.HomePage;

public class CartValidationTest extends BaseClass {
	public HomePage homepage;
	public CartPage cartpage;
	@Test(groups = {"regression","smoke"})
	public void cartValidation() {
		homepage = new HomePage(driver);
		cartpage = new CartPage(driver);
		
	}

}

package com.ecommerce.login;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.ecommerce.generic.baseclass.BaseClass;
import com.ecommerce.generic.listenerutilities.UtilityObject;
@Listeners(com.ecommerce.generic.listenerutilities.ListenerUtility.class)

/**
 * @author Gaurav Singh
 */
public class LoginWithValidCredentialsTest extends BaseClass {
	
	@Test(groups = {"regression","smoke"})
    public void login() throws IOException {
		Assert.assertEquals(driver.getCurrentUrl(), fileutility.getDataFromPropertyFile("homepageurl"));
		UtilityObject.getTest().log(Status.INFO, "Home Page got Displayed");
	}
}

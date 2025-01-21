package com.ecommerce.login;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.ecommerce.generic.baseclass.BaseClass;
import com.ecommerce.generic.listenerutilities.UtilityObject;
import com.ecommerce.objectrepository.LoginPage;
@Listeners(com.ecommerce.generic.listenerutilities.ListenerUtility.class)

/**
 * @author Gaurav Singh
 */
public class LoginWithInvalidCredentialsTest extends BaseClass {
	public LoginPage loginpage;
	@Test(groups = {"regression","smoke"})
    public void login() throws IOException {
		loginpage = new LoginPage(driver);
		Assert.assertEquals(loginpage.getErrormessage().getText(), fileutility.getDataFromPropertyFile("loginerrormessage"));
		UtilityObject.getTest().log(Status.INFO, "Login Credentidals are Invalid");
	}
}

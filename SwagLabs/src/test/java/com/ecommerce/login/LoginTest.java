package com.ecommerce.login;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.ecommerce.generic.baseclass.BaseClass;
import com.ecommerce.generic.excelutilities.ExcelUtility;
import com.ecommerce.generic.listenerutilities.UtilityObject;
import com.ecommerce.objectrepository.LoginPage;
@Listeners(com.ecommerce.generic.listenerutilities.ListenerUtility.class)
/**
 * @author Gaurav Singh
 */
public class LoginTest extends BaseClass {
    public LoginPage loginPage;
    
    @DataProvider(name = "loginData")
    public Object[][] getLoginData() throws EncryptedDocumentException, IOException {
        int rowCount = excelutility.getRowCount("Login"); // Dynamically get row count
        Object[][] data = new Object[rowCount - 1][2]; // Exclude header row
        for (int i = 1; i < rowCount; i++) {
            data[i-1][0] = excelutility.getDataFromExcel("Login", i, 0); // Username
            data[i-1][1] = excelutility.getDataFromExcel("Login", i, 1); // Password
        }
        return data;
    }

    @Test(dataProvider = "loginData", groups = {"regression", "smoke"})
    public void loginValidationTest(String username, String password) throws Exception {
    	loginPage = new LoginPage(driver);
        login(username,password); // Reuse the login method

        if (driver.getCurrentUrl().equals(fileutility.getDataFromPropertyFile("homepageurl"))) {
            // Validate successful login
            UtilityObject.getTest().log(Status.INFO, "Login Successful with Valid Credentials");
            logout(); // Logout after successful login
        } else if(loginPage.getErrormessage().getText().equals(fileutility.getDataFromPropertyFile("loginerrormessage"))) {
            // Validate error message
            UtilityObject.getTest().log(Status.INFO, "Login Unuccessful with Invalid Credentials");
        }
    }
}

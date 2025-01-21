package com.ecommerce.generic.baseclass;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.ecommerce.generic.excelutilities.ExcelUtility;
import com.ecommerce.generic.fileutilities.FileUtility;
import com.ecommerce.generic.javautilities.JavaUtility;
import com.ecommerce.generic.listenerutilities.UtilityObject;
import com.ecommerce.generic.webdriverutilities.WebdriverUtility;
import com.ecommerce.objectrepository.HomePage;
import com.ecommerce.objectrepository.LoginPage;

/**
 * @author Gaurav Singh
 */
public class BaseClass {
	public FileUtility fileutility = new FileUtility();
	public ExcelUtility excelutility = new ExcelUtility();
	public WebdriverUtility webdriverutility = new WebdriverUtility();
	public JavaUtility javautility = new JavaUtility();
	public WebDriver driver;
	public static WebDriver sdriver;
	
     @Parameters("browser")
	@BeforeClass(alwaysRun = true,groups = {"regression","smoke"})
	public void beforeClass(@Optional("chrome") String browser) throws IOException {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		webdriverutility.maximizeWindow(driver);
		webdriverutility.implicitwait(driver,10);
		webdriverutility.launchURL(driver, fileutility.getDataFromPropertyFile("url"));
		sdriver = driver;
		UtilityObject.setDriver(driver);
		
	}
	
     @AfterClass(alwaysRun = true,groups = {"regression","smoke"})
 	public void afterClass() {
 		webdriverutility.minimizeWindow(driver);
 		webdriverutility.quitBrowser(driver);
 	}
	
	public void login(String username, String password) throws IOException {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.login(username,password);  
	}

	public void logout() {
		HomePage homepage = new HomePage(driver);
		homepage.logout();
	}
	
}

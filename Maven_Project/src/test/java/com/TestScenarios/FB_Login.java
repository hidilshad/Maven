package com.TestScenarios;

import org.testng.annotations.Test;

import com.Utilities.CommonFunctions;
import com.Utilities.StaticVariables;
import com.objectRepository.Locators;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class FB_Login extends StaticVariables {
	//WebDriver driver;
	//Classnmae referanceName = new classname();
	CommonFunctions cfn = new CommonFunctions();
	Locators obj = new Locators();

	@Test
	public void f() {

		driver.get("https://fb.com");
		cfn.sendkeysByAnylocator(obj.fb_email, "test@sdgsdg.csdf");
		//driver.findElement(obj.fb_email).sendKeys("test@sdgsdg.csdf");
		cfn.sendkeysByAnylocator(obj.fb_password, "alphhabet");
		//driver.findElement(obj.fb_password).sendKeys("alphhabet");
		//driver.findElement(obj.fb_login_button).click();
		cfn.clickByAnylocator(obj.fb_login_button);

	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass
	public void beforeClass() {
		cfn.chromeBrowserLaunch();
		//System.setProperty("webdriver.chrome.driver", ".\\broserDrivers\\chromedriver.exe");
		//driver = new ChromeDriver();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}

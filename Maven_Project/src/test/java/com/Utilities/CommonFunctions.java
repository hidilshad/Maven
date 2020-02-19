package com.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonFunctions extends StaticVariables {

	public void chromeBrowserLaunch() {
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void sendkeysByAnylocator(By locator, String inputdata) {
		// is displayed
		// is enabled
		// if any existing data we must clear
		// enter the data
		WebElement ele = driver.findElement(locator);
		if (ele.isDisplayed()) {
			if (ele.isEnabled()) {
				ele.clear();
				ele.sendKeys(inputdata);

			} else {
				System.out.println("element is not enabled");
			}

		} else {
			System.out.println("element is not displayed");
		}

	}

	public void clickByAnylocator(By locator) {
		// is displayed
		// is enabled
		// if any existing data we must clear
		// enter the data
		WebElement ele = driver.findElement(locator);
		if (ele.isDisplayed()) {
			if (ele.isEnabled()) {

				ele.click();

			} else {
				System.out.println("element is not enabled");
			}

		} else {
			System.out.println("element is not displayed");
		}

	}
}

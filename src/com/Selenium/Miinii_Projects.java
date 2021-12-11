package com.Selenium;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Miinii_Projects {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebDriverWait  wait =  new   WebDriverWait(driver, 5);
		Createe_Accounts  accounts =   new  Createe_Accounts();
		accounts.CreateeAccounts(driver, wait);
		

	}

}

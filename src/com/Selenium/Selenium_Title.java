package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Title {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thasa\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	String title = driver.getTitle();
	System.out.println("Title :"+ title);
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println("CurrentUrl :"+currentUrl);
	
	Thread.sleep(3000);
	
	//String pageSource = driver.getPageSource();
	//System.out.println("PageSource :"+pageSource);
	
	driver.navigate().to("https://www.teleperformance.com/");
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.quit();
	
	
	}
}

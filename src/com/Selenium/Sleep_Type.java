package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sleep_Type {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        
        WebElement fresh = driver.findElement(By.xpath("(//img)[28]"));
       WebDriverWait w=new WebDriverWait(driver, 50);
       w.until(ExpectedConditions.visibilityOf(fresh));
       
       Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
    		   .withTimeout(60, TimeUnit.SECONDS)
    		   .pollingEvery(5, TimeUnit.SECONDS)
    		  .ignoring(NoSuchFieldException.class);
		

	}

}

package com.Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Create_Account {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thasa\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement Create_account = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		Create_account.click();
		Thread.sleep(3000);
		WebElement frist = driver.findElement(By.xpath("(//input[contains(@type,'text')])[2]"));
		frist.sendKeys("Thasarathan");
		Thread.sleep(3000);
		WebElement last = driver.findElement(By.xpath("(//input[contains(@type,'text')])[3]"));
	    last.sendKeys("T");
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.xpath("(//input[contains(@type,'text')])[4]"));
		email.sendKeys("Thasarathan3@gmail.com");
		Thread.sleep(3000);
		WebElement re_email = driver.findElement(By.xpath("(//input[contains(@type,'text')])[5]"));
		re_email.sendKeys("Thasarathan3@gmail.com");
		Thread.sleep(3000);
		WebElement pass = driver.findElement(By.xpath("(//input[contains(@type,'pass')])[2]"));
		pass.sendKeys("thasa");
		Thread.sleep(3000);
		WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		radio.click();
		Thread.sleep(3000);
		WebElement sing = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		sing.click();
		Thread.sleep(3000);
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Thasa\\eclipse-workspace\\Selenium\\Screenshot\\login.png");
	    FileUtils.copyFile(source, destination);
		
		
	}

}

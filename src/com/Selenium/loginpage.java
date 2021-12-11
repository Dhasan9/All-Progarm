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

public class loginpage {

	public static void main(String[] args) throws InterruptedException, IOException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thasa\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/");
				driver.manage().window().maximize();
				Thread.sleep(3000);
				
				WebElement Username = driver.findElement(By.xpath("//input [@id='txtUsername']"));
				Username.sendKeys("Admin");
				WebElement Pass = driver.findElement(By.xpath("//input [@id='txtPassword']"));
				Pass.sendKeys("admin123");
				Thread.sleep(3000);
				
				TakesScreenshot ts= (TakesScreenshot) driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				File destination = new File("C:\\Users\\Thasa\\eclipse-workspace\\Selenium\\Screenshot\\beforelogin.png");
			    FileUtils.copyFile(source, destination);
				
				WebElement Login = driver.findElement(By.xpath("//input [@id='btnLogin']"));
				Login.click();
				Thread.sleep(3000);
				
				TakesScreenshot t= (TakesScreenshot) driver;
				File sourc = t.getScreenshotAs(OutputType.FILE);
				File destinatio = new File("C:\\Users\\Thasa\\eclipse-workspace\\Selenium\\Screenshot\\afterlogin.png");
			    FileUtils.copyFile(sourc, destinatio);
			    
			    
				
				
				
				

		

	}

}

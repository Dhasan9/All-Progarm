package com.Selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mini_Procjet {
	public static void main(String[] args) throws IOException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thasa\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	WebElement  User_Register_Here = driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[7]/td/a"));
	User_Register_Here.click();
	WebElement Username = driver.findElement(By.xpath("//*[@id='username']"));
	Username.sendKeys("Thasa");
	WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
	password.sendKeys("thasa@3");
	WebElement re_password = driver.findElement(By.xpath("//*[@id='re_password']"));
	re_password.sendKeys("thasa@3");
	WebElement Full_Name = driver.findElement(By.xpath("//*[@id='full_name']"));
	Full_Name.sendKeys("Thasarathan.T");
	WebElement Email_Address = driver.findElement(By.xpath("//*[@id='email_add']"));
	Email_Address.sendKeys("thasarathan3@gmail.com");
	WebElement  agree  = driver.findElement(By.xpath("//*[@id='tnc_box']"));
	agree.click();
	File s =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File d=new File("C:\\Users\\Thasa\\eclipse-workspace\\Selenium\\Screenshot\\user_Register.png");
	FileUtils.copyFile(s, d);		
	
	}
}

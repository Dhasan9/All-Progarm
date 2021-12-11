package com.Selenium;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Createe_Accounts {
	
	void CreateeAccounts(WebDriver driver, WebDriverWait wait) throws IOException {

	WebElement  User_Register_Here = driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[7]/td/a"));
	wait.until(ExpectedConditions.elementToBeClickable(User_Register_Here)).click();
	WebElement Username = driver.findElement(By.xpath("//*[@id='username']"));
	Username.sendKeys("Thasarathan");
	WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
	password.sendKeys("thasa@3");
	WebElement re_password = driver.findElement(By.xpath("//*[@id='re_password']"));
	re_password.sendKeys("thasa@3");
	WebElement Full_Name = driver.findElement(By.xpath("//*[@id='full_name']"));
	Full_Name.sendKeys("Thasarathan.T");
	WebElement Email_Address = driver.findElement(By.xpath("//*[@id='email_add']"));
	Email_Address.sendKeys("thasarathan3@gmail.com");
	WebElement Captcha = driver.findElement(By.xpath("//*[@id='captcha-form']"));
	Scanner ss=new Scanner(System.in);
	System.out.println("Enter the captcha text");
	String captcha = ss.nextLine();
	Captcha.sendKeys(captcha);
	ss.close();
	WebElement  agree  = driver.findElement(By.xpath("//*[@id='tnc_box']"));
	agree.click();
	WebElement Register = driver.findElement(By.xpath("//*[@id='Submit']"));
	Register.click();
	File s =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File d=new File("C:\\Users\\Thasa\\eclipse-workspace\\Selenium\\Screenshot\\user_Register.png");
	FileUtils.copyFile(s, d);		
	
	}
}

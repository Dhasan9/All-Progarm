package com.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1_T1 {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", 
		System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File d=new File("C:\\Users\\Thasa\\eclipse-workspace\\Selenium\\Screenshot\\mainpage.png");
		FileUtils.copyFile(s, d);
		String oldwindow = driver.getWindowHandle();
		Actions a = new Actions(driver);
		WebElement moblie = driver.findElement(By.xpath("//a[@class='nav-a  ']"));
		a.contextClick(moblie).build().perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> new_window = driver.getWindowHandles();
		for (String string : new_window) {
			driver.switchTo().window(string);
			
		}
		File s1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File d1=new File("C:\\Users\\Thasa\\eclipse-workspace\\Selenium\\Screenshot\\s__page.png");
		FileUtils.copyFile(s1, d1);
		
	    WebElement shop = driver.findElement(By.xpath("//img[@alt='Shop now']"));
		shop.click();
		File s3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File d3=new File("C:\\Users\\Thasa\\eclipse-workspace\\Selenium\\Screenshot\\F__page.png");
		FileUtils.copyFile(s3, d3);
		
		WebElement oneplus = driver.findElement(By.xpath("//img[@class='s-image']"));
		oneplus.click();
		
		Set<String> window = driver.getWindowHandles();
		for (String Cart : window) {
			driver.switchTo().window(Cart);
			
		}
		File s2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File d2=new File("C:\\Users\\Thasa\\eclipse-workspace\\Selenium\\Screenshot\\T__page.png");
		FileUtils.copyFile(s2, d2);
		
		WebElement cart = driver.findElement(By.xpath("//input[@type='button']"));
		cart.click();
		Thread.sleep(3000);
		File s4=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File d4=new File("C:\\Users\\Thasa\\eclipse-workspace\\Selenium\\Screenshot\\n__page.png");
		FileUtils.copyFile(s4, d4);
		WebElement proceed = driver.findElement(By.xpath("//*[@id=\'attach-sidesheet-checkout-button\']/span/input"));
		proceed.click();
		File s5=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File d5=new File("C:\\Users\\Thasa\\eclipse-workspace\\Selenium\\Screenshot\\l__page.png");
		FileUtils.copyFile(s5, d5);
		

		
		
		
		
		
	}

}

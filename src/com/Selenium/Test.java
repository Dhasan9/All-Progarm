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

public class Test {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thasa\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement Username = driver.findElement(By.xpath("//input [@type='text']"));
		Username.sendKeys("abc@gmail.com");
		WebElement Pass = driver.findElement(By.xpath("//input [@type='password']"));
		Pass.sendKeys("56546");
		WebElement Login = driver.findElement(By.xpath("//button [@name='login']"));
		Login.click();
		Thread.sleep(3000);
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Thasa\\eclipse-workspace\\Selenium\\Screenshot\\facebook.png");
		FileUtils.copyFile(source, destination);
		
		
		WebElement Forgetten = driver.findElement(By.xpath("//*[@id=\"login_link\"]/div/a"));
		Forgetten.click();
		Thread.sleep(3000);
		TakesScreenshot ts1= (TakesScreenshot) driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("C:\\Users\\Thasa\\eclipse-workspace\\Selenium\\Screenshot\\Forgetten.png");
		FileUtils.copyFile(source1, destination1);
		
		WebElement identify = driver.findElement(By.xpath("//*[@id=\"identify_email\"]"));
		identify.sendKeys("thasarathan3@gmail.com");
		Thread.sleep(3000);
		WebElement Search = driver.findElement(By.xpath("//*[@id=\"did_submit\"]"));
		Search.click();
		Thread.sleep(3000);
		WebElement Continue = driver.findElement(By.xpath("//*[@id=\"initiate_interstitial\"]/div[3]/div/div[1]/button"));
		Continue.click();
		}

}

package com.Selenium;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Thasa\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://demo.automationtesting.in/Alerts.html");
		d.manage().window().maximize();
		Thread.sleep(3000);
		WebElement c = d.findElement(By.xpath("(//button)[2]"));
		c.click();
		Thread.sleep(3000);
		Alert alert = d.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		WebElement e = d.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		e.click();
		WebElement f = d.findElement(By.xpath("(//button)[3]"));
		f.click();
		Thread.sleep(3000);
		Alert alert1 = d.switchTo().alert();
		Thread.sleep(3000);
		alert1.accept();
		WebElement g = d.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		g.click();
		Thread.sleep(3000);
		WebElement h = d.findElement(By.xpath("(//button)[4]"));
		h.click();
		Thread.sleep(3000);
		Alert alert2 = d.switchTo().alert();
		Thread.sleep(3000);
		alert2.sendKeys("Hi Good");
		Thread.sleep(3000);
		alert2.accept();
		File s=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		File de = new File("C:\\Users\\Thasa\\eclipse-workspace\\Selenium\\Screenshot\\Alerts.png");
		FileUtils.copyFile(s, de);
	
		
		
		}

}

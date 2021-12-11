package com.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele_Ale {
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Thasa\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			WebDriver d = new ChromeDriver();
			d.get("http://demo.automationtesting.in");
			d.manage().window().maximize();
			Thread.sleep(3000);
			
			d.findElement(By.xpath("(//button)[2]")).click();
			Thread.sleep(3000);
			d.findElement(By.xpath("(//a[contains(text(),'S')])[1]")).click();
			Thread.sleep(3000);
			d.findElement(By.xpath("(//a[contains(text(),'A')])[1]")).click();
			Thread.sleep(3000);
			WebElement c = d.findElement(By.xpath("(//button)[2]"));
			Thread.sleep(3000);
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
		
	}

}

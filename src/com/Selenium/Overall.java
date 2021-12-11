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
import org.openqa.selenium.support.ui.Select;

public class Overall{

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://automationpractice.com/index.php");
		d.manage().window().maximize();
		
		WebElement f = d.findElement(By.xpath("//a[contains(text(),'W')]"));
		f.click();
		WebElement ff = d.findElement(By.xpath("(//a[contains(text(),'Tops')])[2]"));
		ff.click();
		WebElement fff = d.findElement(By.xpath("(//a[contains(text(),'T-shirts')])[3]"));
		fff.click();
		WebElement s1 = d.findElement(By.xpath("(//img)[8]"));
		s1.click();
		d.switchTo().frame(0);
		WebElement l = d.findElement(By.xpath("//input[@name='qty']"));
		l.clear();
		l.sendKeys("2");
		WebElement h = d.findElement(By.xpath("//select[@id='group_1']"));
		Select s2=new Select(h);
		s2.selectByIndex(2);
		File s=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		File de=new File("C:\\Users\\Thasa\\eclipse-workspace\\Selenium\\Screenshot\\Add.png");
		FileUtils.copyFile(s, de);
		WebElement k= d.findElement(By.xpath("//button[@name='Submit']"));
		k.click();
		File ss=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		File den=new File("C:\\Users\\Thasa\\eclipse-workspace\\Selenium\\Screenshot\\Add1.png");
		FileUtils.copyFile(ss, den);
		d.switchTo().defaultContent();
		WebElement p = d.findElement(By.xpath("(//i[contains(text(),'')])[5]"));
		Thread.sleep(3000);
		p.click();
		File ss2=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		File den1=new File("C:\\Users\\Thasa\\eclipse-workspace\\Selenium\\Screenshot\\Add2.png");
		FileUtils.copyFile(ss2, den1);
		
	}

}

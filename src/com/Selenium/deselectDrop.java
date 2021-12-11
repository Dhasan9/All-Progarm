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

public class deselectDrop {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.leafground.com/pages/Dropdown.html");
		d.manage().window().maximize();
		
		WebElement find = d.findElement(By.xpath("(//select)[6]"));
		Select ss=new Select(find);
		ss.selectByIndex(3);
		ss.selectByValue("2");
		ss.selectByVisibleText("Loadrunner");
		ss.selectByIndex(1);
		Thread.sleep(3000);
		
		ss.deselectByIndex(3);
		ss.deselectByValue("2");
		ss.deselectByVisibleText("Loadrunner");
		File j=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		File l=new File("C:\\Users\\Thasa\\eclipse-workspace\\Selenium\\Screenshot\\drop.png");
		FileUtils.copyFile(j, l);
		
	}

}

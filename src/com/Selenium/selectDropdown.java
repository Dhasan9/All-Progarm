package com.Selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropdown {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.leafground.com/pages/Dropdown.html");
		d.manage().window().maximize();
		
		WebElement drop = d.findElement(By.xpath("(//select)[1]"));
		Select s=new Select(drop);
		s.selectByIndex(2);
		Thread.sleep(3000);
		
		WebElement drop1 = d.findElement(By.xpath("(//select)[2]"));
		Select s1=new Select(drop1);
		Thread.sleep(3000);
		s1.selectByVisibleText("Selenium");
		s1.selectByIndex(3);
		
		WebElement drop2 = d.findElement(By.xpath("(//select)[3]"));
		Select s2=new Select(drop2);
		Thread.sleep(3000);
		s2.selectByValue("3");
		
		List<WebElement> all =s.getOptions();
		int size = all.size();
		System.out.println("Size of dropdown :"+size);
		
		WebElement first = s1.getFirstSelectedOption();
		System.out.println("First Element :"+first.getText());
		File j=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		File l=new File("C:\\Users\\Thasa\\eclipse-workspace\\Selenium\\Screenshot\\dropdown.png");
		FileUtils.copyFile(j, l);
		
		
		
		
		
	}

}

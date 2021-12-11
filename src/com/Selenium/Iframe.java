package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.leafground.com/pages/frame.html");
		d.manage().window().maximize();
		d.switchTo().frame(0);
		WebElement ff = d.findElement(By.xpath("//button[@id='Click']"));
		ff.click();
		d.switchTo().defaultContent();
		
		d.switchTo().frame(1);
		d.switchTo().frame("frame2");
		WebElement f = d.findElement(By.xpath("//button[@id='Click1']"));
		f.click();
		
		String text = f.getText();
		System.out.println(text);
		d.switchTo().defaultContent();
		
		List<WebElement> g = d.findElements(By.tagName("iframe"));
		int size2 = g.size();
		System.out.println(size2);
		
		
	}

}

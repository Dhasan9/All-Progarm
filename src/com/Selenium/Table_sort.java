package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_sort {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
	    List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement all : alldata) {
			System.out.println(all.getText());
			}
		List<WebElement> one = driver.findElements(By.xpath("//table/tbody/tr/th"));
		for (WebElement all : one) {
			System.out.println(all.getText());
			
		}
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
		for (WebElement all : row) {
			System.out.println(all.getText());
			
		}
		List<WebElement> cul = driver.findElements(By.xpath("//table/tbody/tr/td[4]"));
		for (WebElement all : cul) {
			System.out.println(all.getText());
			
		}
		WebElement par = driver.findElement(By.xpath("//table/tbody/tr[3]/td[5]"));
		System.out.println(par.getText());
		
		List<WebElement> rs = driver.findElements(By.tagName("tr"));
		int size = rs.size();
		System.out.println(size);
		
		List<WebElement> cs = driver.findElements(By.tagName("th"));
		int size2 = cs.size();
		System.out.println(size2);
		
		WebElement findElement = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td"));
		System.out.println(findElement.getText());
	}


}

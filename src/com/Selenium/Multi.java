package com.Selenium;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.leafground.com/pages/Dropdown.html");
		d.manage().window().maximize();
		
		WebElement find = d.findElement(By.xpath("(//select)[6]"));
		Select ss=new Select(find);
		
		List<WebElement> options = ss.getOptions();
		System.out.println("==========");
		
		for (WebElement s : options) {
				System.out.println(s.getText());
			
		}
		int size = options.size();
		System.out.println("===========");
		System.out.println(size);
		for (int i = 0; i <size; i++) {
			if (i==3|i==1) {
				ss.selectByIndex(i);
				
			}
		
			
			
		}
List<WebElement> allSelectedOptions = ss.getAllSelectedOptions();
		
		System.out.println("===========");
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());
			
		}
		
		
	}

}

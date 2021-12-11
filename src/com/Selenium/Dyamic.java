package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyamic {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		WebElement find = driver.findElement(By.xpath
				("//div[@id='leftcontainer']/table/tbody/tr[5]"));
	    System.out.println(find.getText());
	    
	    List<WebElement> c = driver.findElements(By.xpath
				("//div[@id='leftcontainer']/table/tbody/tr[1]/td"));
	    int size = c.size();
	    System.out.println("Total column " + size);
	    
	    List<WebElement> R = driver.findElements(By.tagName("tr"));
	    int size1 = R.size();
	    System.out.println("Total column " + size1);
	    
	    WebElement finds = driver.findElement(By.xpath
				("//div[@id='leftcontainer']/table/tbody/tr[5]/td[3]"));
	    System.out.println(finds.getText());
	    
	    
	    
	    
	    //WebElement findElement = driver.findElement(By.xpath
	    	//	("//td[normalize-space()='CESC Ltd.']//following::td"));
		//System.out.println(findElement.getText());
	    
	  
		
	}

}

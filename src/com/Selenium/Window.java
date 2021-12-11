package com.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions a= new Actions(driver);
		WebElement mobile = driver.findElement(By.xpath("//a[@class='nav-a  ']"));
		a.contextClick(mobile).build().perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement Best_seller = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
		a.contextClick(Best_seller).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement  Electronics = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
		a.contextClick( Electronics).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement  Fashion = driver.findElement(By.xpath("(//a[@class='nav-a  '])[5]"));
		a.contextClick( Fashion).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		int size = driver.getWindowHandles().size();
		System.out.println("Size :"+size);
		String Parent_id = driver.getWindowHandle();
		System.out.println("Parent_Id :"+Parent_id);
		Set<String> All_window = driver.getWindowHandles();
		for (String New : All_window) {
			String title = driver.switchTo().window(New).getTitle();
			System.out.println("Titles :"+title);
			}
		String child="Amazon.in Bestsellers: The most popular items on Amazon";
		for (String Item : All_window) {
			if (driver.switchTo().window(Item).getTitle().equalsIgnoreCase(child)) {
				break;
				
			}
			
		}
		//for (String close : All_window) {
			//if (!close.equals(Parent_id)) {
				//driver.switchTo().window(Parent_id);
				//driver.close();
				
			//}
			
		//} 
		
			
		
		
		
		
		
		

		
	}

}

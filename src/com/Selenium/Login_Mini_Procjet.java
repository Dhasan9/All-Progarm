package com.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Login_Mini_Procjet {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement Username = driver.findElement(By.xpath("//*[@id='username']"));
		Username.sendKeys("Thasarathan");
		WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
		password.sendKeys("thasa@3");
		File s =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File d=new File("C:\\Users\\Thasa\\eclipse-workspace\\Selenium\\Screenshot\\user_Login.png");
		FileUtils.copyFile(s, d);		
		WebElement login = driver.findElement(By.xpath("//*[@id='login']"));
		login.click();
		
		WebElement location = driver.findElement(By.xpath("//*[@id='location']"));
		Select t=new Select(location);
		t.selectByIndex(6);
		
		WebElement hotels = driver.findElement(By.xpath("//*[@id='hotels']"));
		Select tt=new Select(hotels);
		tt.selectByIndex(3);
		
		WebElement room_type = driver.findElement(By.xpath("//*[@id='room_type']"));
		Select ts=new Select(room_type);
		ts.selectByIndex(3);

		
		WebElement room_nos = driver.findElement(By.xpath("//*[@id='room_nos']"));
		Select t1=new Select(room_nos);
		t1.selectByIndex(3);
		
		WebElement datepick_in = driver.findElement(By.xpath("//*[@id='datepick_in']"));
		datepick_in.sendKeys("27/11/2021");
		
		WebElement datepick_out = driver.findElement(By.xpath("//*[@id='datepick_out']"));
		datepick_out.sendKeys("29/11/2021");
		
		WebElement adult_room = driver.findElement(By.xpath("//*[@id='adult_room']"));
		Select t2=new Select(adult_room);
		t2.selectByIndex(3);
		
		WebElement child_room = driver.findElement(By.xpath("//*[@id='child_room']"));
		Select t3=new Select(child_room);
		t3.selectByIndex(1);
		
		File ss =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dd=new File("C:\\Users\\Thasa\\eclipse-workspace\\Selenium\\Screenshot\\S_Hotel.png");
		FileUtils.copyFile(ss, dd);		
	
		WebElement Search = driver.findElement(By.xpath("//*[@id='Submit']"));
		Search.click();
		WebElement radio = driver.findElement(By.xpath("//*[@id='radiobutton_0']"));
		radio.click();
		
		WebElement continue1 = driver.findElement(By.xpath("//*[@id='continue']"));
		continue1.click();
		
		WebElement first_name = driver.findElement(By.xpath("//*[@id='first_name']"));
		first_name.sendKeys("Thasarathan");
		
		WebElement last_name = driver.findElement(By.xpath("//*[@id='last_name']"));
		last_name.sendKeys("Thathan");
		
		WebElement address = driver.findElement(By.xpath("//*[@id='address']"));
		address.sendKeys("Chennai Tamil Nadu");
		
		WebElement cc_num = driver.findElement(By.xpath("//*[@id='cc_num']"));
		cc_num.sendKeys("3456779686964567");
		
		Actions a = new Actions(driver);
		WebElement cc_type = driver.findElement(By.xpath("//*[@id='cc_type']"));
		a.click(cc_type).build().perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement cc_exp_month = driver.findElement(By.xpath("//*[@id='cc_exp_month']"));
		Select t4=new Select(cc_exp_month);
		t4.selectByIndex(3);
		WebElement cc_exp_year = driver.findElement(By.xpath("//*[@id='cc_exp_year']"));
		Select t5=new Select(cc_exp_year);
		t5.selectByIndex(12);
		WebElement cc_cvv = driver.findElement(By.xpath("//*[@id='cc_cvv']"));
		cc_cvv.sendKeys("1234");
		
		File ss1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dd1=new File("C:\\Users\\Thasa\\eclipse-workspace\\Selenium\\Screenshot\\book_now.png");
		FileUtils.copyFile(ss1, dd1);		
	
		
		WebElement book_now = driver.findElement(By.xpath("//*[@id='book_now']"));
		book_now.click();
		
		
	}

}

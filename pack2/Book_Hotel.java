package com.pack2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Book_Hotel {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\S SMITIKA\\eclipse-workspace\\Sele\\Driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://adactinhotelapp.com/");
			driver.manage().window().maximize();
			
			WebElement uname=driver.findElement(By.xpath("//input[@name='username']"));
			uname.sendKeys("srideviss");
			Thread.sleep(2000);
			
			WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));
			pwd.sendKeys("Sridevi07$");
			Thread.sleep(2000);
			
			WebElement log=driver.findElement(By.xpath("//input[@name='login']"));
			log.click();  
			Thread.sleep(2000);
			
			WebElement locate=driver.findElement(By.id("location"));		
			Select s=new Select(locate);
			s.selectByIndex(6);
			Thread.sleep(1000);
			
			WebElement hotels=driver.findElement(By.id("hotels"));		
			Select s1=new Select(hotels);
			s1.selectByValue("Hotel Sunshine");
			Thread.sleep(1000);
			
			WebElement rtype=driver.findElement(By.id("room_type"));		
			Select s2=new Select(rtype);
			s2.selectByValue("Double");
			Thread.sleep(1000);
			
			WebElement rno=driver.findElement(By.id("room_nos"));		
			Select s3=new Select(rno);
			s3.selectByIndex(2);
			Thread.sleep(1000);
			
			
			WebElement apr=driver.findElement(By.name("adult_room"));		//adult per room
			Select s4=new Select(apr);
			s4.selectByIndex(2);
			Thread.sleep(1000);
			
			WebElement cpr=driver.findElement(By.name("child_room"));		//child per room
			Select s5=new Select(cpr);
			s5.selectByIndex(3);
			Thread.sleep(1000);
			
			WebElement search=driver.findElement(By.name("Submit"));		//child per room
			search.click();
			Thread.sleep(2000);
			
			WebElement radio=driver.findElement(By.id("radiobutton_0"));
			radio.click();					
			Thread.sleep(1000);
			
			WebElement continu=driver.findElement(By.xpath("//input[@type='submit']"));
			continu.click();
			Thread.sleep(2000);
				
			Robot r =new Robot();
			r.keyPress(KeyEvent.VK_PAGE_DOWN);
			r.keyRelease(KeyEvent.VK_PAGE_DOWN);
			
			WebElement fname=driver.findElement(By.xpath("//input[@name='first_name']"));
			fname.sendKeys("Sridevi");
			Thread.sleep(1000);
			
			WebElement lname=driver.findElement(By.xpath("//input[@name='last_name']"));
			lname.sendKeys("77777");
			Thread.sleep(1000);
			
			WebElement addr=driver.findElement(By.xpath("//textarea[@name='address']"));
			addr.sendKeys("319 F,Madurai");
			Thread.sleep(1000);
			
			WebElement creditcard=driver.findElement(By.xpath("//input[@name='cc_num']"));
			creditcard.sendKeys("1234567891011123");
			Thread.sleep(1000);
			
			WebElement cardtype=driver.findElement(By.xpath("//select[@name='cc_type']"));		//child per room
			Select s6=new Select(cardtype);
			s6.selectByValue("VISA");
			Thread.sleep(1000);
			
			WebElement expiry_month=driver.findElement(By.xpath("//select[@name='cc_exp_month']"));		//child per room
			Select s7=new Select(expiry_month);
			s7.selectByValue("10");
			Thread.sleep(1000);
			
			WebElement expiry_year=driver.findElement(By.xpath("//select[@name='cc_exp_year']"));		//child per room
			Select s8=new Select(expiry_year);
			s8.selectByValue("2022");
			Thread.sleep(1000);
			
			WebElement cvv=driver.findElement(By.xpath("//input[@id='cc_cvv']"));
			 cvv.sendKeys("777");
			 Thread.sleep(1000);
			 
			 WebElement booking=driver.findElement(By.xpath("//input[@type='button']"));
			 booking.click();
			 Thread.sleep(1000);
			   
}
}

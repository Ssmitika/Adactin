package com.pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S SMITIKA\\eclipse-workspace\\pack2\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.facebook.com");
		driver.manage().window().maximize();
		
	//	driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys("abc@gmail.com");
		WebElement pass=driver.findElement(By.name("pass"));
		pass.sendKeys("123456");
		
		WebElement loginbtn=driver.findElement(By.name("login"));
		loginbtn.click();
	}

}

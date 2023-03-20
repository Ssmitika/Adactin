package com.pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S SMITIKA\\eclipse-workspace\\pack2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement frame1=driver.findElement(By.xpath("//input[@type='text']"));
	     frame1.sendKeys("Java");
	}

}

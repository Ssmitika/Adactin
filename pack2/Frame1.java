package com.pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S SMITIKA\\eclipse-workspace\\pack2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		WebElement nested=driver.findElement(By.xpath("//a[@classs='analystic'])[2]"));
		nested.click();
		Thread.sleep(3000);
		
	//	WebElement frame1=
	}

}

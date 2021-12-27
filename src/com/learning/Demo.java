package com.learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAMOD\\eclipse-workspace\\JavaBascics\\driver\\newdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://classic.freecrm.com/index.html");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign Up")).click();
		
		
	
	
	
	
	
}}
	
	
		
		
		
		
		
		



      

		
		
		
		
		
		
		


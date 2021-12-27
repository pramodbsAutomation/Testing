package com.learning;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Test {
	
	public static void main(String [] args) throws InterruptedException, IOException  {
		WebDriver driver;
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAMOD\\eclipse-workspace\\FreeCrmTest\\Driver\\Driver1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://qa.adiglobaldistribution.us/");
		Thread.sleep(4000);
		driver.switchTo().frame(0);
		Thread.sleep(4000);
		driver.findElement(By.linkText("Brands"));
		
		
		  WebElement e = driver.findElement(By.linkText("Featured Brands"));
		  
		  Actions action = new Actions(driver);
		  action.moveToElement(e).build().perform();
		  Thread.sleep(4000);
		  e.click();
		 
		
		
		
		  
		
		

}}

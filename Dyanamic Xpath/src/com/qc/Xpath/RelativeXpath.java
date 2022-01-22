package com.qc.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/Browser/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		WebElement UserName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		UserName.sendKeys("Admin");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("admin123");
		
		WebElement LogIn = driver.findElement(By.xpath("//input[@type='submit']"));
		LogIn.click();
		
		
	}

}

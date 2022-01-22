package com.qc.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:/Browser/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		WebElement UserName = driver.findElement(By.xpath("/html/body/div/div[1]/div[3]/div[2]/div[2]/form/div[2]/input"));
		UserName.sendKeys("Admin");
		
		WebElement pass = driver.findElement(By.xpath("/html/body/div/div[1]/div[3]/div[2]/div[2]/form/div[3]/input"));
		pass.sendKeys("admin123");
		
		WebElement LogIn = driver.findElement(By.xpath("/html/body/div/div[1]/div[3]/div[2]/div[2]/form/div[5]/input"));
		LogIn.click();
		
		
		WebElement openLogOut = driver.findElement(By.xpath("/html/body/div/div[1]/a[2]"));
		openLogOut.click();
		Thread.sleep(1000);
		
		WebElement LogOut = driver.findElement(By.xpath("/html/body/div/div[1]/div[10]/ul/li[3]/a"));
		LogOut.click();
		
		driver.close();
	
	}

}

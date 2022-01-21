package com.PratiesProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
			      "C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com/");
				Thread.sleep(5000);
		
				
				WebElement account = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
				account.click();
				
//				WebElement f1 = driver.findElement(By.name("firstname"));
//				f1.sendKeys("karthik");
				
				WebElement Firstname= driver.findElement(By.xpath("//input[@name='firstname']"));
				Firstname.sendKeys("karthik");
		
	}

}

package com.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);

	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("karthi350@gmail.com");
	
	WebElement password = driver.findElement(By.name("pass"));
	password.sendKeys("13456798765");
	WebElement log = driver.findElement(By.name("login"));
	log.click();
	}

}

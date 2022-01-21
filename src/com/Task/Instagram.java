package com.Task;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/");
		Thread.sleep(4000);

		WebElement id = driver.findElement(By.name("username"));
		id.sendKeys("karthi350ks@gmail.com");

		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("karthik2000m");

		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		Thread.sleep(6000);


		TakesScreenshot src=(TakesScreenshot) driver;
		File sr = src.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Selenium_Tool\\Screens\\snap.png");
		FileUtils.copyFile(sr, dest);
	}

}

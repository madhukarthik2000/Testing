package com.Task;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshort {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.instagram.com/");
	Thread.sleep(4000);
	driver.manage().window().maximize();
	WebElement A = driver.findElement(By.xpath("//span[text()='Log in with Facebook']"));
	A.click();
	WebElement S = driver.findElement(By.id("email"));
	S.sendKeys("karthi350ks@gmail.com");
	WebElement D = driver.findElement(By.id("pass"));
	D.sendKeys("karthik2000m");
	WebElement F = driver.findElement(By.name("login"));
	F.click();
	driver.switchTo().alert().accept();
	Thread.sleep(70000);
	TakesScreenshot src=(TakesScreenshot) driver;
	File sr = src.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Selenium_Tool\\Screens\\snap1s.png");
	FileUtils.copyFile(sr, dest);
}
}

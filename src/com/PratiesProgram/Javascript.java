package com.PratiesProgram;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Australia = driver.findElement(By.xpath("(//a[@class='nav_a'])[23]"));
	//	js.executeScript("arguments[0].scrollIntoView()", Australia);
		js.executeScript("arguments[0].click();", Australia);
//		TakesScreenshot src = (TakesScreenshot) driver;
//		File sr = src.getScreenshotAs(OutputType.FILE);
//		File dest = new File("C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Selenium_Tool\\Screens\\snap1ss.png");
//		FileUtils.copyFile(sr, dest);
		
		js.executeScript("window.scrollBy(0,3000);");
		js.executeScript("window.scrollBy(0,-4000);");
	//	driver.close();

	}
}
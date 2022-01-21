package com.PratiesProgram;

import java.io.File;

import javax.swing.Action;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mouseactions {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement TS = driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(TS).build().perform();
		a.click(TS).build().perform();
		Thread.sleep(2000);

		WebElement sl = driver.findElement(By.id("selectProductSort"));
		Select aa = new Select(sl);
		aa.selectByIndex(3);
		WebElement TS1 = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
		a.moveToElement(TS1).build().perform();
		a.click(TS1).build().perform();
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url :" + currentUrl);
		WebElement amount = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		a.moveToElement(amount).build().perform();
		a.click(amount).build().perform();

		TakesScreenshot src = (TakesScreenshot) driver;
		File sr = src.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Selenium_Tool\\Screens\\snap1s.png");
		FileUtils.copyFile(sr, dest);
		driver.close();

	}

}

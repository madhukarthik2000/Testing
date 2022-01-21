package com.PratiesProgram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;

public class Alert_Methods {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement s = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		s.click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		WebElement c = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		c.click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		WebElement p = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
		p.click();
		Thread.sleep(3000);
		driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("karthik surya");
		Thread.sleep(3000);

		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
	}

}

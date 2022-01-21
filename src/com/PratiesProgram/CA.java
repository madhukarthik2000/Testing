package com.PratiesProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CA {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();

	WebElement create = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	create.click();
	Thread.sleep(4000);
	WebElement f1 = driver.findElement(By.xpath("//input[@aria-label='First name']"));
	f1.sendKeys("Karthik");

	WebElement f2 = driver.findElement(By.xpath("//input[@name='lastname']"));
	f2.sendKeys("Surya");

	WebElement email = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
	email.sendKeys("ks8667345@gmail.com");

	WebElement email1 = driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']"));
	email1.sendKeys("ks8667345@gmail.com");

	WebElement pass = driver.findElement(By.xpath("//input[@data-type='password']"));
	pass.sendKeys("karthik2000m");
	WebElement BOB = driver.findElement(By.id("day"));
	Select a = new Select(BOB);
	a.selectByValue("17");
	WebElement s = driver.findElement(By.id("month"));
	Select ss = new Select(s);
	ss.selectByValue("4");
	WebElement d = driver.findElement(By.id("year"));
	Select dd = new Select(d);
	dd.selectByValue("2000");
}
}

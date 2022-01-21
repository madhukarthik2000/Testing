package com.PratiesProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Task.Navigate_Function;

public class Demo {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/search");
		WebElement q = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		q.sendKeys("Google");
		Thread.sleep(1000);
		WebElement w = driver.findElement(By.xpath("//span[text()='Google']"));

		w.click();
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.xpath("//a[@data-hveid='CAEQBg']"));
		e.click();
		driver.navigate().back();
		driver.navigate().forward();
		WebElement r = driver.findElement(By.xpath("(//img[@class='rg_i Q4LuWd'])[2]"));
		r.click();
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(1000);
		WebElement t = driver.findElement(By.xpath("//h3[text()='Google Play']"));
		t.click();
		Thread.sleep(1000);
		WebElement y = driver.findElement(By.xpath("(//span[@jsname='r4nke'])[1]"));
		y.click();
	}
}

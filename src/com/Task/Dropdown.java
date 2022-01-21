package com.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Dropdown.html");
		WebElement findElement = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		findElement.sendKeys("Selenium");
	}

}

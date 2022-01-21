package com.PratiesProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		WebElement click = driver.findElement(By.xpath("//img[@alt='Table']"));
		click.click();
		List<WebElement> column = driver.findElements(By.tagName("th"));
		int size = column.size();
		System.out.println("column size is:" + size);
		List<WebElement> row = driver.findElements(By.tagName("tr"));
		int size1 = row.size();
		System.out.println("row size is:" + size1);
		WebElement percentage = driver
				.findElement(By.xpath("//td[normalize-space()='Learn XPath']//following::td[1]"));
		String text = percentage.getText();
		System.out.println("percentage ie:" + text);

	}

}

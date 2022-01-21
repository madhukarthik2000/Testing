package com.PratiesProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framework {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		WebElement f = driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[10]"));
		f.click();
		// frame1
		driver.switchTo().frame(0);
		WebElement f1 = driver.findElement(By.id("Click"));
		f1.click();
		String text = driver.findElement(By.id("Click")).getText();
		System.out.println(text);

		// frame2
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement f2 = driver.findElement(By.id("Click1"));
		f2.click();
		String text2 = driver.findElement(By.id("Click1")).getText();
		System.out.println(text2);
		// frame3
		driver.switchTo().defaultContent();
		List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
		int size = findElements.size();
		System.out.println(size);
		//driver.close();

	}
}
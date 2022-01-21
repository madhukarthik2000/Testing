package com.PratiesProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Topdown {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("http://output.jsbin.com/osebed/2");
		Thread.sleep(2000);
		WebElement m = driver.findElement(By.id("fruits"));
		Select a = new Select(m);
		boolean multiple = a.isMultiple();
		System.out.println(multiple);
		a.selectByIndex(3);
		Thread.sleep(2000);
		a.selectByValue("orange");
		Thread.sleep(2000);
		a.selectByVisibleText("Apple");
		a.deselectByIndex(3);
		a.deselectByValue("orange");
		a.deselectByVisibleText("Apple");

		// getoptions
		System.out.println("--------------");
		List<WebElement> go = a.getOptions();
		for (WebElement webElement : go) {
			System.out.println(webElement.getText());
		}
		// allselect
		System.out.println("---------------");
		List<WebElement> as = a.getAllSelectedOptions();
		for (WebElement webElement : as) {
			System.out.println(webElement.getText());

		}
		//firstselect
		System.out.println("---------------");
		WebElement f1 = a.getFirstSelectedOption();
		System.out.println(f1.getText());
		
		a.deselectAll();

	}

}

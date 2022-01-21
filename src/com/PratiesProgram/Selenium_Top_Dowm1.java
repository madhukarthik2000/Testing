package com.PratiesProgram;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.yaml.snakeyaml.nodes.NodeId;

public class Selenium_Top_Dowm1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("http://www.leafground.com/");
		driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[5]")).click();
		// multiple
		Thread.sleep(2000);
		WebElement a = driver.findElement(By.xpath("//select[@multiple]"));
		Select aa = new Select(a);
		aa.selectByIndex(1);
		aa.selectByValue("3");
		aa.selectByVisibleText("Appium");
//		aa.deselectByIndex(1);
//		aa.deselectByValue("3");
//		aa.deselectByVisibleText("Appium");

		// getoptions
		System.out.println("-----------------");
		List<WebElement> options = aa.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}

		// getallselectedoptions
		System.out.println("------------------");
		List<WebElement> f2 = aa.getAllSelectedOptions();
		for (WebElement webElement : f2) {
			System.out.println(webElement.getText());
		}

		// firstselectoptions
		System.out.println("-----------------");
		WebElement f1 = aa.getFirstSelectedOption();
		System.out.println(f1.getText());
		aa.deselectAll();
	}
}

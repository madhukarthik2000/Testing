package com.Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Function  {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("title:" + title);

		driver.navigate().to("https://facebook.com/");
		String currentUrl = driver.getCurrentUrl();
		System.out.println("currentUrl:" + currentUrl);
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		driver.close();

	}

}

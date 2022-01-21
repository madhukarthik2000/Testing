package com.Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver_win32\\chromedriver.exe");
		// parent class //child class
		WebDriver driver = new ChromeDriver();
		// Maximize the windows
		driver.manage().window().maximize();
		// thread is waiting or sleep
		Thread.sleep(5000);

		driver.get("https://www.youtube.com/");
		driver.get("https://www.instagram.com/?hl=en");
	}
}
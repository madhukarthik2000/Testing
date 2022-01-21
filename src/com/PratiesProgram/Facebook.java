package com.PratiesProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("karthi30ks@gmail.com");
		boolean c = email.isEnabled();
		System.out.println("enable or not" + c);

		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("karthik2000m");
		boolean b = pass.isDisplayed();
		System.out.println("display or not" + b);

		WebElement login = driver.findElement(By.name("login"));
		login.click();
		//driver.close();

	}

}

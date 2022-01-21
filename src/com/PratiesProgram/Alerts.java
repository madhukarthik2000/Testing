package com.PratiesProgram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public final class Alerts {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement a = driver.findElement(By.className("analystic"));
		a.click();
		WebElement s = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		s.click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		WebElement d = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		d.click();
		WebElement f = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		f.click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		WebElement z = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		z.click();
		WebElement x = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		x.click();
		driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("karthik surya");
		Thread.sleep(3000);

		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();

	}

}

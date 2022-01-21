package com.PratiesProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Task.Navigate_Function;

public class Selenium_Top_Down {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// page is minimize
		Dimension a = new Dimension(300, 400);
		driver.manage().window().setSize(a);
		Thread.sleep(2000);
		// page center use
		Point b = new Point(400, 400);
		driver.manage().window().setPosition(b);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		String aa = driver.getTitle();
		System.out.println(aa);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Thread.sleep(2000);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		Thread.sleep(2000);
//		driver.findElement(By.name("email")).sendKeys("karthi350@gmail.com");
//		driver.findElement(By.name("pass")).sendKeys("karthik2000m");
//		driver.findElement(By.name("login")).click();
//		driver.findElement(By.xpath("//i[@class='_9ai6 img sp_-Ww9-2lZPiS sx_3813d1']")).click();
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("karthik");
		driver.findElement(By.name("lastname")).sendKeys("s");
		driver.findElement(By.name("reg_email__")).sendKeys("kaertygddb@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kaertygddb@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("1236547890");
		WebElement d1 = driver.findElement(By.id("day"));
		Select a1 = new Select(d1);
		a1.selectByIndex(16);
		WebElement m = driver.findElement(By.id("month"));
		Select m1 = new Select(m);
		m1.selectByIndex(3);
		WebElement y = driver.findElement(By.id("year"));
		Select y1 = new Select(y);
		y1.selectByIndex(21);
		driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
		driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
		Thread.sleep(2000);
		driver.navigate().to("https://www.instagram.com/?hl=en");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@aria-label='Phone number, username, or email']"))
				.sendKeys("karthi350ks@gmail.com");
		driver.findElement(By.name("password")).sendKeys("karthik2000m");
		driver.findElement(By.xpath("//*[text()='Log In']")).click();
		driver.close();

	}

}

package com.PratiesProgram;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Teamproject {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement google = driver.findElement(By.xpath("//input[@type='text']"));
		google.sendKeys("Automationpractice");
		WebElement search = driver.findElement(By.xpath("(//span[text()='automationpractice'])[1]"));
		search.click();
		WebElement click = driver.findElement(By.xpath("//h3[text()='Automation Practice']"));
		click.click();

		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys("karthik8951@gmail.com");

		WebElement creataccount = driver.findElement(By.xpath("//i[@class='icon-user left']"));
		creataccount.click();
		js.executeScript("window.scrollBy(0,200)");
		WebElement Tittle = driver.findElement(By.id("id_gender1"));
		Tittle.click();
		WebElement firstname = driver.findElement(By.id("customer_firstname"));
		firstname.sendKeys("karthik");
		WebElement Lastname = driver.findElement(By.id("customer_lastname"));
		Lastname.sendKeys("surya");
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("karthik2000");
		WebElement day = driver.findElement(By.id("days"));
		Select days = new Select(day);
		days.selectByValue("17");
		WebElement month = driver.findElement(By.id("months"));
		Select months = new Select(month);
		months.selectByValue("4");
		WebElement year = driver.findElement(By.id("years"));
		Select years = new Select(year);
		years.selectByValue("2000");
		js.executeScript("window.scrollBy(0,300)");
		WebElement Address = driver.findElement(By.id("address1"));
		Address.sendKeys("5/493-Nallampalli,Dharmapuri");
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Dharmapuri");
		WebElement state = driver.findElement(By.id("id_state"));
		Select states = new Select(state);
		states.selectByValue("14");
		WebElement code = driver.findElement(By.id("postcode"));
		code.sendKeys("63680");
		WebElement country = driver.findElement(By.id("id_country"));
		Select countrys = new Select(country);
		countrys.selectByIndex(1);
		js.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.id("other")).sendKeys("8428618346");
		WebElement phone = driver.findElement(By.id("phone_mobile"));
		phone.sendKeys("9751378346");
		WebElement reference = driver.findElement(By.id("alias"));
		reference.sendKeys("Madhu");

		WebElement register = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		register.click();

		WebElement TS = driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(TS).build().perform();
		a.click(TS).build().perform();

		js.executeScript("window.scrollBy(0,400)");
		WebElement sl = driver.findElement(By.id("selectProductSort"));
		Select aa = new Select(sl);
		aa.selectByIndex(3);

		WebElement TS1 = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
		a.moveToElement(TS1).build().perform();
		a.click(TS1).build().perform();
		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();

		WebElement size = driver.findElement(By.id("group_1"));
		Select q = new Select(size);
		q.selectByIndex(1);

		WebElement color = driver.findElement(By.id("color_14"));
		color.click();
		js.executeScript("window.scrollBy(0,400)");

		WebElement amount = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		a.moveToElement(amount).build().perform();
		a.click(amount).build().perform();

		WebElement shops = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[2]"));
		shops.click();
		js.executeScript("window.scrollBy(0,700)");

		WebElement continuoushops = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		a.moveToElement(continuoushops).build().perform();
		a.doubleClick(continuoushops).build().perform();
		js.executeScript("window.scrollBy(0,700)");

		WebElement nextstep = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[7]"));
		nextstep.click();
		js.executeScript("window.scrollBy(0,600)");

		WebElement accept = driver.findElement(By.id("cgv"));
		accept.click();
		WebElement nextstep1 = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		nextstep1.click();

		js.executeScript("window.scrollBy(0,600)");
		WebElement findElement = driver.findElement(By.xpath("//a[@class='cheque']"));
		findElement.click();

		WebElement findElements = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		findElements.click();
		js.executeScript("window.scrollBy(0,400)");
		TakesScreenshot src71 = (TakesScreenshot) driver;
		File sr17 = src71.getScreenshotAs(OutputType.FILE);
		File dest71 = new File("C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Selenium_Tool\\Screens\\project98.png");
		FileUtils.copyFile(sr17, dest71);
		driver.close();
	}
}

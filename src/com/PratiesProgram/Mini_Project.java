package com.PratiesProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Mini_Project {
	public static void main(String[] args)   {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver_win32");
		WebDriver driver =new ChromeDriver();
		 JavascriptExecutor js =(JavascriptExecutor)driver;
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//a[@class='login']")).click();
		js.executeScript("window.scrollBy(0,450);");
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("karthi15031997@gmail.com");
		WebElement password = driver.findElement(By.name("passwd"));
		password.sendKeys("91767542331597");
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		Actions action = new Actions(driver);
		action.moveToElement(women).build().perform();
		driver.findElement(By.xpath("//a[@title='T-shirts']")).click();
	    js.executeScript("window.scrollBy(0,620);"); 
	    driver.findElement(By.xpath("//div[@class='product-container']")).click();
		js.executeScript("window.scrollBy(0,400);");
		WebElement item = driver.findElement(By.id("quantity_wanted"));
		item.clear();
		item.sendKeys("3");
		WebElement size  = driver.findElement(By.id("group_1"));
		Select s= new Select(size);
		s.selectByValue("2"); 
		driver.findElement(By.name("Blue")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		js.executeScript("arguments[0].click();",proceed);
		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
		driver.findElement(By.name("processAddress")).click();
		driver.findElement(By.id("cgv")).click();
		driver.findElement(By.name("processCarrier")).click();
	    driver.findElement(By.xpath("(//p[@class='payment_module'])[2]")).click();
	    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	}
}

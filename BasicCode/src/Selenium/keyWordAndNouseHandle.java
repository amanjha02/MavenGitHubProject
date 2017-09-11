package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class keyWordAndNouseHandle {
	public static WebDriver driver;

	public static void KeyboardHandle() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MICROSECONDS);
		driver.get("https://www.facebook.com/");
		WebElement elemnet=driver.findElement(By.id("email"));
		Actions action=new Actions(driver);
		action.moveToElement(elemnet).click().keyDown(elemnet, Keys.SHIFT).sendKeys(elemnet, "hello")
		.doubleClick().build().perform();
		
		/*action.sendKeys(Keys.chord(Keys.CONTROL,"c")).moveToElement(driver.findElement(By.id("pass")))
		.sendKeys(Keys.chord(Keys.CONTROL,"v")).build().perform();*/
		elemnet.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		driver.findElement(By.id("pass")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
	
}
	public static void main(String[] args) 
	{
		KeyboardHandle();
	}
}
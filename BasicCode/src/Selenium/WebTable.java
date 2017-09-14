package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {
	/*public static WebDriver driver;

	public static void WebHandle() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MICROSECONDS);
		driver.get("file:///C:/Users/aman.kumar.SPECTRA/Desktop/table.html");
		List<WebElement> rowvalue = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println(rowvalue.size());
		for (int i = 1; i <= rowvalue.size(); i++) {
			// System.out.println(driver.findElement(By.xpath("//table/tbody/tr["
			// +i+"]")).getText());
			List<WebElement> columnValue = driver.findElements(By.xpath("//table/tbody/tr[" + i + "]/td"));
			System.out.println(columnValue.size());
		 for(int j=1;j<=columnValue.size();j++) {
			 System.out.print(driver.findElement(By.xpath("//table/tbody/tr[" +i+"]/td[" +j+"]")).getText()+"---");
		 }
		}

		// System.out.println(driver.findElement(By.xpath("//table/tbody/tr[1]")).getText());
	}

	public static void main(String[] args) {
		WebHandle();
	}*/
}

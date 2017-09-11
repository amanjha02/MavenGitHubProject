package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindallLink {
	public static void main(String[] args) throws InterruptedException {
		   String underConsTitle = "Under Construction: Mercury Tours";	
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MICROSECONDS);
		
		//click on image link
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Helloi");
	WebElement image=	driver.findElement(By.xpath(".//i[@class='fb_logo img sp_ex0C8BIsLat sx_7401de']"));
		
	System.out.println(image.getText());
	image.click();
	// find all the links and check all link are working or not:
		/*driver.get("http://demo.guru99.com/selenium/newtours/");
		List <WebElement> alllinks=driver.findElements(By.tagName("a"));
		for(WebElement linkValue: alllinks) {
			System.out.println(linkValue.getText());
			linkValue.click();
			System.out.println(driver.getTitle());
			Thread.sleep(5000);
			driver.navigate().back();
		}
		
		   String[] linkTexts = new String[alllinks.size()];							
					int	i = 0;					

					//extract the link texts of each link element		
					for (WebElement e : alllinks) {							
					linkTexts[i] = e.getText();							
					i++;			
		        }	
					
					for (String t : linkTexts) {							
						driver.findElement(By.linkText(t)).click();					
						if (driver.getTitle().equals(underConsTitle)) {							
			                System.out.println("\"" + t + "\""								
			                        + " is under construction.");			
			            } else {			
			                System.out.println("\"" + t + "\""								
			                        + " is working.");			
			            }		
						driver.navigate().back();			
			        }		*/
		
	}

}

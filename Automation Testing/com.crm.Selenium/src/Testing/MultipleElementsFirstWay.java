package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleElementsFirstWay {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr= new FirefoxDriver();
		dr.manage().window().maximize();
		dr.get("https://demowebshop.tricentis.com/");
//		List<WebElement> community_poll = dr.findElements(By.name("pollanswers-1"));
//		Thread.sleep(1000);
		
		// first type
//		for(WebElement web:community_poll) {
//			web.click();
//			Thread.sleep(1000);
//			
//		}
		// second way
		List<WebElement> header_elements = dr.findElements(By.xpath("//div [@class=\"header-links\"]/ul/li/a"));
		
		for (WebElement web : header_elements) {
			web.click();
			Thread.sleep(2000);
			dr.navigate().back();
		}
		
		dr.close();
	}
}

package TestCases;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class RegisterFacebook extends BaseClass{

	public static void main(String[] args) throws Exception {
		
		String expected_URL="https://demowebshop.tricentis.com/";
		String facebook="https://www.facebook.com/nopCommerce";
		
		preCondition("chrome", "https://demowebshop.tricentis.com/");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		if (expected_URL.equals(dr.getCurrentUrl())) {
			login();
			Actions act= new Actions(dr);
			act.scrollToElement(dr.findElement(By.xpath("//a[text()='Google+']"))).perform();
			List<WebElement> links= dr.findElements(By.xpath("//div[@class='column follow-us']/ul/li"));
			System.out.println(links.size());
			Thread.sleep(1000);
			for (WebElement web : links) {
				
				web.click();
				Thread.sleep(1000);
			}
			Set<String> handles= dr.getWindowHandles();
			for (String str: handles) {
				dr.switchTo().window(str);
	
				if(dr.getCurrentUrl().equals(facebook)) {
					Thread.sleep(3000);
					dr.findElement(By.xpath("//span[text()='Create new account']")).click();
					Thread.sleep(1500);
					
					
				} 
				Thread.sleep(1000);
			}
			
			
		}else {
			postCondition();
			throw new Exception("Landed into wrong page");
		}
		postCondition();
	}
}

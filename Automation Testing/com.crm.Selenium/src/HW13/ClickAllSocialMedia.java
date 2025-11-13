package HW13;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAllSocialMedia extends BaseClass{

	public static void clickAllsocialMedia() throws InterruptedException {
		
		preCondition("firefox", "https://demowebshop.tricentis.com/");
		login();
		List<WebElement> social_media = dr.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
		System.out.println(social_media.size());
		Thread.sleep(2000);
		
		for (WebElement web : social_media) {
			try {
				web.click();
				Thread.sleep(2000);
			}
			catch (Exception e) {
				
				dr.navigate().back();
				Thread.sleep(2000);
			}
			
		}
//		
//		Thread.sleep(2000);
//		dr.findElement(By.xpath("//li[@class=\"facebook\"]/a")).click();
//		Thread.sleep(2000);
//		dr.navigate().to("https://demowebshop.tricentis.com/");
//		System.out.println("hi");
		logout();
		Thread.sleep(2000);
		postCondition();
		
		
	}
}

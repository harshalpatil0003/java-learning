package HW14;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class SocialLinks extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		preCondition("firefox", "https://demowebshop.tricentis.com/");
		//login();
		
		String demo="https://demowebshop.tricentis.com/";
		String twitter="https://x.com/nopCommerce";
		String youtube="https://www.youtube.com/user/nopCommerce";
		String google="https://workspaceupdates.googleblog.com/2023/04/new-community-features-for-google-chat-and-an-update-currents%20.html";
		String facebook="https://www.facebook.com/nopCommerce";
		
			List<WebElement> links = dr.findElements(By.xpath("//a[@target='_blank']"));
			for (WebElement web : links) {
				web.click();
				Thread.sleep(1000);
			}
			Actions act= new Actions(dr);
			
			Set<String> handles= dr.getWindowHandles();
			for (String str: handles) {
				dr.switchTo().window(str);
				
				if (dr.getCurrentUrl().equals(demo)) {
					Thread.sleep(3000);
					dr.findElement(By.id("small-searchterms")).sendKeys("Laptop");
					dr.findElement(By.cssSelector(".button-1.search-box-button")).click();
					Thread.sleep(1500);
				}
				
				else if(dr.getCurrentUrl().equals(facebook)) {
					Thread.sleep(3000);
					dr.findElement(By.xpath("//span[text()='Create new account']")).click();
					Thread.sleep(1500);
				} 
				else if(dr.getCurrentUrl().equals(twitter)) {
					Thread.sleep(3000);
					dr.findElement(By.className("Bz112c Bz112c-r9oPif")).click();
					Thread.sleep(1000);
					dr.findElement(By.xpath("//span[text()='Create account']")).click();
					Thread.sleep(1500);
				}
				else if (dr.getCurrentUrl().equals(youtube)) {
					Thread.sleep(3000);
					WebElement search = dr.findElement(By.name("search_query"));
					search.sendKeys("Judo sloth");
					act.keyDown(Keys.ENTER).perform();
					Thread.sleep(1500);
				}
				else if(dr.getCurrentUrl().equals(google)) {
					Thread.sleep(3000);
					dr.findElement(By.xpath("//a[contains(text(),'Subscribe')]")).click();
					Thread.sleep(1500);
				}
				Thread.sleep(1000);
			}
			//logout();
			postCondition();
	}
}

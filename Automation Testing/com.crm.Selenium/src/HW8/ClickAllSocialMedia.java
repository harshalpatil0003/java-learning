package HW8;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class ClickAllSocialMedia extends BaseClass {

	public static void main(String[] args) throws Exception {
		
		preCondition("firefox", "https://demowebshop.tricentis.com/");
		login();
		try {
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
			System.out.println("All links clicked successfully");
		}catch( Exception e) {
			postCondition();
			throw new Exception("failed to click links!");
		}

		
	}
}

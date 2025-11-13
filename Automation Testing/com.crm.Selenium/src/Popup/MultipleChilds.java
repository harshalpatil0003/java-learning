package Popup;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class MultipleChilds  extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		String expected_url="https://x.com/nopCommerce";
		preCondition("firefox", "https://demowebshop.tricentis.com/");
		login();
		
		List<WebElement> links = dr.findElements(By.xpath("//a[@target='_blank']"));
		
		for (WebElement web : links) {
			web.click();
			Thread.sleep(1000);
		}
		
		Set<String> childHandles= dr.getWindowHandles();
		
		for (String str: childHandles) {
			dr.switchTo().window(str);
			String actual_str=dr.getCurrentUrl();
			if (actual_str.equals(expected_url)) {
				dr.findElement(By.xpath("//span[text()='Sign up with Apple']")).click();
			}
			Thread.sleep(1000);
		}
		logout();
		postCondition();
	}
}

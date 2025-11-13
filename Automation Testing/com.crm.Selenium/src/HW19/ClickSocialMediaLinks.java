package HW19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class ClickSocialMediaLinks extends BaseClass{
	public static void main(String[] args) throws Exception {
		
		preCondition("chrome", "https://shoppersstack.com/");
		String src="https://shoppersstack.com/" ;
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		dr.findElement(By.xpath("//a[text()='facebook'] ")).click();
//		WebElement twitter = dr.findElement(By.xpath("//a[text()='twitter'] "));
//		WebElement youtube = dr.findElement(By.xpath("//a[text()='youTube'] "));
		
		if (src.equals(dr.getCurrentUrl())) {
			postCondition();
			throw new Exception("Test case fail, Link not working");
		
		}else {
			System.out.println("Testcase passed");
		}
		postCondition();
	}
}

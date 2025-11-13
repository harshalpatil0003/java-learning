package HW19;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class ClickShopProduct extends BaseClass{

	public static void main(String[] args) throws Exception {
		preCondition("chrome", "https://shoppersstack.com/");
		String src="https://shoppersstack.com/" ;
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
			WebElement btn = dr.findElement(By.xpath("(//button[text()='shop products'])[2]"));
			btn.click();
			if (dr.getCurrentUrl().equals(src)) {
				postCondition();
				throw new Exception("TestCase Fail, Button Not working");
			}
			else {
				System.out.println("TestCase Passed!");
			}
		postCondition();
	}
}

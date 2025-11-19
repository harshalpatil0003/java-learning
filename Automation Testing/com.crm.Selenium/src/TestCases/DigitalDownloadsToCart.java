package TestCases;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import UtilityClass.BaseClass;

public class DigitalDownloadsToCart extends BaseClass{

	public static void main(String[] args) throws Exception {
		String expected_URL="https://demowebshop.tricentis.com/";
		preCondition("chrome", "https://demowebshop.tricentis.com/");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		if (expected_URL.equals(dr.getCurrentUrl())) {
			
			//login();
			
			Actions act= new Actions(dr);
			WebElement element = dr.findElement(By.xpath("//a[contains(text(),'Digital downloads')]"));
			for (int i = 0; i <12; i++) {
				act.keyDown(Keys.TAB).perform();
			}
			act.keyDown(Keys.CONTROL).keyDown(Keys.ENTER).perform();
			
			String current_handle = dr.getWindowHandle();
			
			Set<String> childHandles=dr.getWindowHandles();
			childHandles.remove(current_handle);
			System.out.println(childHandles);
			dr.switchTo().window("childHandles");
			
			List<WebElement> btns = dr.findElements(By.xpath("//input[@value='Add to cart']"));
			for (WebElement str : btns) {
				str.click();
			}
		
			
			
			System.out.println("Landed to right page");
		}
		else {
			postCondition();
			throw new Exception("Landed to wrong page");
		}
		
		
	}
}

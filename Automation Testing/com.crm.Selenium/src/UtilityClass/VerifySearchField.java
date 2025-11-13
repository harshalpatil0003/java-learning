package UtilityClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VerifySearchField extends BaseClass{

	public static void verifySearchField() throws Exception {
		
		
			preCondition("firefox", "https://demowebshop.tricentis.com/");
			login();
			
			String passed_value="Laptop";
			
			WebElement field = dr.findElement(By.id("small-searchterms"));
			
			field.sendKeys("Laptop");
			
			if (passed_value.equals(field.getAttribute("value"))) {
				System.out.println("test case passed ");
			}
			else {
				postCondition();
				throw new Exception("Test case fail");
			}
			logout();
			Thread.sleep(2000);
			postCondition();
	}
}

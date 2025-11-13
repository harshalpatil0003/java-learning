package UtilityClass;

import org.openqa.selenium.By;

public class IsRegisteredDisplayed extends BaseClass {

	public static void isRegisteredDisplayed() throws Exception {
		
		preCondition("firefox", "https://demowebshop.tricentis.com/");
		login();
		Thread.sleep(1000);
		
		
		try {
			dr.findElement(By.xpath("//a[text()='Register']"));
			postCondition();
			throw new Exception("test case fail Link is present");
		}catch (Exception e) {
			postCondition();
			System.out.println("Test case Passed, Link is not present");
		}
		Thread.sleep(1000);
		postCondition();
	}
}

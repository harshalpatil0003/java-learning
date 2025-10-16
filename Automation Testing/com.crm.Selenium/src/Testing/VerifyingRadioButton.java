package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyingRadioButton {

	public static void main(String[] args) throws Exception {
		WebDriver dr= new ChromeDriver();
		
		dr.manage().window().maximize();
		dr.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement excellent= dr.findElement(By.xpath("//ul[contains(@ class,'poll-options')]/li[1]/label"));
		if(excellent.isEnabled()) {
			System.out.println("Excellent radio button is Enabled and working");
		
			excellent.click();
			Thread.sleep(2000);
			
		}
		else {
			System.out.println("Excellent radio button is not working");
			throw new Exception("Test Script fail, Excellent radio button is not working");
		}
		dr.close();
	}
}

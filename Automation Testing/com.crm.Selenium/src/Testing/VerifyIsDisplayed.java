package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyIsDisplayed {

	public static void main(String[] args) throws Exception {
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://demowebshop.tricentis.com/");
		WebElement register = dr.findElement(By.className("ico-register"));
		if(register.isDisplayed()) {
			System.out.println("pass");
		}
		else{
			dr.close();
			throw new Exception("fail");
		}
		dr.close();
	}
}

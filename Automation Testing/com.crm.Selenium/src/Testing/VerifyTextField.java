package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTextField {

	public static void main(String[] args) throws Exception {
		String data="Selenium";
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://demowebshop.tricentis.com/");
		WebElement textfield = dr.findElement(By.id("small-searchterms"));
		
		textfield.sendKeys(data);
		String currentData = textfield.getAttribute("value");
		
		if (data.equals(currentData)) {
			System.out.println("text matched testCase Passed ");
		}
		else {
			dr.close();
			throw new Exception("Texts are not equal TestCase fail");
		}
		dr.close();
	}
}

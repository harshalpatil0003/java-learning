package Testing;


import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByWebElement {

	public static void main(String[] args) throws Exception{
		
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://demowebshop.tricentis.com/");
		try {
			WebElement poll= dr.findElement(By.xpath("//strong [text()='Community poll']"));
			System.out.println("pass");
		}
		catch (NoSuchElementException e) {
			throw new NoSuchElementException("fail");
		}
		
		dr.close();
	}
}

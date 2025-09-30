package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookRegister {

	
	//HW: 1// write script for demoweb apllication 
//	1. Open browser
//	2 Maximize it
//	3. EnterDWS site
//	4. click register
//	5. Fill the form
	
	public static void main(String[] args) {
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.facebook.com/");
		
		dr.findElement(By.linkText("Create new account")).click();
		dr.findElement(By.name("firstname")).sendKeys("Harshal");
		dr.findElement(By.name("lastname")).sendKeys("Patil");
		
		dr.findElement(By.id("day")).sendKeys("15");
		dr.findElement(By.id("month")).sendKeys("Mar");
		dr.findElement(By.id("year")).sendKeys("2003");
		dr.findElement(By.partialLinkText("Male")).click();
		
	}
}

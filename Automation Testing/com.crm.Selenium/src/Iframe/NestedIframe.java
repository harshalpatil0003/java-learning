package Iframe;

import org.openqa.selenium.By;

import UtilityClass.BaseClass;

public class NestedIframe extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		preCondition("chrome", "https://demo.automationtesting.in/Frames.html");
		
		dr.findElement(By.linkText("Iframe with in an Iframe")).click();
//		dr.switchTo().frame(1);
//		dr.switchTo().frame(0);
		
		dr.switchTo().frame(dr.findElement(By.xpath("(//iframe)[2]")));
		dr.switchTo().frame(dr.findElement(By.xpath("(//iframe)[1]")));
		dr.findElement(By.xpath("//input[@type='text']")).sendKeys("Harshal");
		
		//switching back to the main page.
		
		//switch to immediate parent
		//dr.switchTo().parentFrame();
		//dr.switchTo().parentFrame();
		
		//switch to original page(main Page) 
		dr.switchTo().defaultContent();
		dr.findElement(By.linkText("Home")).click();
	}
}

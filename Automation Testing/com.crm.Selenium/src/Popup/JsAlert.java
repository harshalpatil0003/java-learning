package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import UtilityClass.BaseClass;

public class JsAlert extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		preCondition("chrome", "https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);
//		dr.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		Alert alt1= dr.switchTo().alert();
//		Thread.sleep(2000);
//		alt1.accept();
//		
//		dr.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Alert alt2=dr.switchTo().alert();
//		Thread.sleep(2000);
//		alt2.dismiss();
		

		dr.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alt3=dr.switchTo().alert();
		alt3.sendKeys("Harshal");
		Thread.sleep(2000);
		System.out.println(alt3.getText());
		alt3.dismiss();
		
		dr.close();
		
	}
}

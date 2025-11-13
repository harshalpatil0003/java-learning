package HW16;

import org.openqa.selenium.By;

import UtilityClass.BaseClass;

public class AgodaTrip extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		preCondition("chrome", "https://www.agoda.com/en-in/");
		Thread.sleep(2000);
		dr.findElement(By.id("textInput")).sendKeys("Madrid");
		Thread.sleep(2000);
		dr.findElement(By.xpath("//ul[@class='AutocompleteList']/li")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//div[@id='check-in-box']")).click();
		Thread.sleep(2000);
//		dr.findElement(By.xpath("(//span[text()='7'])[1]")).click();
//		Thread.sleep(2000);
		
		dr.findElement(By.id("check-out-box")).click();
		Thread.sleep(2000);
		for(;;) {
			try {
				dr.findElement(By.id("(//span[text()='7'])[2]")).click();
				break;
			}catch (Exception e) {
				Thread.sleep(2000);
				dr.findElement(By.id("(//span[@class='a3315-inline-flex a3315-align-baseline'])[5]")).click();
			}
			Thread.sleep(2000);	
		}
		Thread.sleep(2000);
		dr.findElement(By.xpath("//span[text()='SEARCH']")).click();
		
			
	}
}

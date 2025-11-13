package HW16;

import org.openqa.selenium.By;

import UtilityClass.BaseClass;

public class RedBusColombia extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		preCondition("chrome", "https://www.redbus.co/en");
		dr.findElement(By.id("onwardCal")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//span[text()='12']")).click();
		
	}
}

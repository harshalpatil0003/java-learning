package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;

import UtilityClass.BaseClass;

public class QspidersDemoIframe extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		preCondition("chrome", "https://demoapps.qspiders.com/ui/frames");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		dr.switchTo().frame(dr.findElement(By.xpath("//iframe[contains(@class,'w-full h-96')]")));
		dr.findElement(By.id("username")).sendKeys("Harshal");
		dr.findElement(By.id("password")).sendKeys("123456");
		dr.findElement(By.id("submitButton")).click();
		postCondition();
	}
}

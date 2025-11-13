package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;

import UtilityClass.BaseClass;

public class DemoMultipleFrames extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		preCondition("chrome", "https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		dr.switchTo().frame(dr.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]")));
		
		dr.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		dr.findElement(By.id("password")).sendKeys("Admin@1234");
		dr.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
		dr.findElement(By.id("submitButton")).click();
		
		dr.switchTo().parentFrame();
		
		dr.switchTo().frame(dr.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]")));
		
		dr.findElement(By.id("username")).sendKeys("SuperAdmin@gmail.com");
		dr.findElement(By.id("password")).sendKeys("SuperAdmin@1234");
		dr.findElement(By.id("submitButton")).click();
		postCondition();
		
	}
}

package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;

import UtilityClass.BaseClass;

public class DemoNestedMultiple extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		preCondition("chrome", "https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@class='w-full h-96']")));
		
		dr.switchTo().frame(0);
		
		dr.switchTo().frame(0);
		dr.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		dr.switchTo().parentFrame();
		
		dr.switchTo().frame(1);
		dr.findElement(By.id("password")).sendKeys("Admin@1234");
		dr.switchTo().parentFrame();
		
		dr.switchTo().frame(2);
		dr.findElement(By.id("confirm")).sendKeys("Admin@1234");
		dr.switchTo().parentFrame();
		
		dr.switchTo().frame(3);
		dr.findElement(By.id("submitButton")).click();
		dr.switchTo().parentFrame();
		postCondition();
		
	}
}

package HW20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class DisabledButton extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		preCondition("chrome", "https://demoapps.qspiders.com/ui/button");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.findElement(By.xpath("//a[text()='Disabled']")).click();
		
		JavascriptExecutor js= (JavascriptExecutor) dr;
		Thread.sleep(2000);
		WebElement name = dr.findElement(By.id("submit"));
		js.executeScript("arguments[0].disabled=false;",name );
		js.executeScript("arguments[0].click()", name);
		Thread.sleep(2000);
		postCondition();
		
		
	}
}

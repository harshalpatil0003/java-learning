package HW20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import UtilityClass.BaseClass;

public class DisabledRadioButton extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		preCondition("chrome", "https://demoapps.qspiders.com/ui/radio");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.findElement(By.xpath("//a[text()='Disabled']")).click();
		
		JavascriptExecutor js= (JavascriptExecutor) dr;
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].disabled=false;", dr.findElement(By.xpath("(//input[@name=\"Attended\"])[1]")));
		js.executeScript("arguments[0].click();", dr.findElement(By.xpath("(//input[@name=\"Attended\"])[1]")));
		Thread.sleep(1000);
		js.executeScript("arguments[0].disabled=false;", dr.findElement(By.xpath("(//input[@name=\"Willing\"])[2]")));
		js.executeScript("arguments[0].click();", dr.findElement(By.xpath("(//input[@name=\"Willing\"])[2]")));
		postCondition();
	}
}

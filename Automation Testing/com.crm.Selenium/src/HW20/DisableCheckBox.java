package HW20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import UtilityClass.BaseClass;

public class DisableCheckBox extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		preCondition("chrome", "https://demoapps.qspiders.com/ui/checkbox");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.findElement(By.xpath("//a[text()='Disabled']")).click();
		
		JavascriptExecutor js= (JavascriptExecutor) dr;
		Thread.sleep(2000);
		js.executeScript("arguments[0].disabled=false;", dr.findElement(By.xpath("(//input[@name='Domain'])[2]")));
		js.executeScript("arguments[0].click();", dr.findElement(By.xpath("(//input[@name='Domain'])[2]")));
		
		Thread.sleep(1000);
		js.executeScript("arguments[0].disabled=false;", dr.findElement(By.xpath("(//input[@name='mode'])[2]")));
		js.executeScript("arguments[0].click();", dr.findElement(By.xpath("(//input[@name='mode'])[2]")));
		Thread.sleep(1000);
		js.executeScript("arguments[0].disabled=false;", dr.findElement(By.xpath("(//input[@name='mode'])[5]")));
		js.executeScript("arguments[0].click();", dr.findElement(By.xpath("(//input[@name='mode'])[5]")));
		Thread.sleep(1000);
		
		postCondition();
	}
}

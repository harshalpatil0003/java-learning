package HW20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class DisabledForm extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		
		preCondition("chrome", "https://demoapps.qspiders.com/ui"); 
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.findElement(By.xpath("//li[text()='Disabled']")).click();
		
		JavascriptExecutor js= (JavascriptExecutor) dr;
		Thread.sleep(1000);
		js.executeScript("arguments[0].value='Harshal';", dr.findElement(By.id("name")));
		Thread.sleep(1000);
		js.executeScript("arguments[0].value='harsh@gmail.com';", dr.findElement(By.id("email")));
		Thread.sleep(1000);
		js.executeScript("arguments[0].value='123456';", dr.findElement(By.id("password")));
		
		
	}

}

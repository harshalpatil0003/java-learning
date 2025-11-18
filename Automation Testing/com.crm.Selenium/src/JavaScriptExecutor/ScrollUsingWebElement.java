package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class ScrollUsingWebElement extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		preCondition("chrome", "https://demowebshop.tricentis.com/");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor) dr;
	
		WebElement ele = dr.findElement(By.xpath("//a[text()='Build your own expensive computer']"));
		js.executeScript("arguments[0].scrollIntoView(false);",ele);
	}
}

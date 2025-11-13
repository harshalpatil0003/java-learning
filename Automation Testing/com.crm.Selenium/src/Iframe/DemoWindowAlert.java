package Iframe;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import UtilityClass.BaseClass;

public class DemoWindowAlert extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		preCondition("chrome", "https://demoapps.qspiders.com/ui/frames/frameAlert?sublist=4");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@class='w-full h-96']")));
		dr.findElement(By.xpath("(//button[text()='Buy Now'])[1]")).click();
		
		//dr.switchTo().window(dr.getWindowHandle());
		dr.findElement(By.className("buy-btn")).click();
		Alert alt= dr.switchTo().alert();
		alt.accept();
		postCondition();
	}
}

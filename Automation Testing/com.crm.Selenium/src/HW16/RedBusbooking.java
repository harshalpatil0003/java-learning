package HW16;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import UtilityClass.BaseClass;

public class RedBusbooking extends BaseClass{
public static void main(String[] args) throws InterruptedException, AWTException {
	preCondition("chrome", "https://www.abhibus.com/");
	Robot bot= new Robot();
	dr.findElement(By.xpath("//div[@id='search-from']/div/div/div/div/div[2]/input")).sendKeys("Pune");
	Thread.sleep(1000);
	bot.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(1000);
	dr.findElement(By.xpath("//div[@id='search-to']/div/div/div/div/div[2]/input")).sendKeys("Hyderabad");
	Thread.sleep(1000);
	bot.keyPress(KeyEvent.VK_ENTER);

	dr.findElement(By.xpath("//h3[text()='Departure']")).click();
	dr.findElement(By.id("search-button")).click();
	
}
}

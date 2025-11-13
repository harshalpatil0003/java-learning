package Popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import UtilityClass.BaseClass;

public class SendValuesUsingRobot extends BaseClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		preCondition("chrome", "https://demowebshop.tricentis.com/");
		Robot bot= new Robot();
		dr.findElement(By.id("small-searchterms")).click();
		bot.keyPress(KeyEvent.VK_P);
		bot.keyPress(KeyEvent.VK_E);
		bot.keyPress(KeyEvent.VK_N);
		bot.keyPress(KeyEvent.VK_D);
		bot.keyPress(KeyEvent.VK_R);
		bot.keyPress(KeyEvent.VK_I);
		bot.keyPress(KeyEvent.VK_V);
		bot.keyPress(KeyEvent.VK_E);
		
		Thread.sleep(2000);
		
		dr.close();
	}
}

package Popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RobotClass {
public static void main(String[] args) throws InterruptedException, AWTException {

	// disabling notifiaction 
	ChromeOptions options= new ChromeOptions();
	options.addArguments("--disable-notifications");

	WebDriver dr= new ChromeDriver(options);
	dr.manage().window().maximize();
	dr.get("https://www.easemytrip.com/");
//	Thread.sleep(3000);
//	
//	Robot bot= new Robot();
//	bot.keyPress(KeyEvent.VK_TAB);
//	Thread.sleep(1000);
//	bot.keyPress(KeyEvent.VK_TAB);
//	Thread.sleep(1000);
//	bot.keyPress(KeyEvent.VK_TAB);
//	Thread.sleep(1000);
//	bot.keyPress(KeyEvent.VK_ENTER);
//	Thread.sleep(1000);
//	
//	bot.keyRelease(KeyEvent.VK_TAB);
//	bot.keyRelease(KeyEvent.VK_ENTER);
	
}

}

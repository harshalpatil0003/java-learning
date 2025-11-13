package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import UtilityClass.BaseClass;

public class ElementScreenShot extends BaseClass{

	public static void main(String[] args) throws InterruptedException, IOException {
		preCondition("chrome", "https://demowebshop.tricentis.com/");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement img = dr.findElement(By.xpath("//img[@alt='Picture of $25 Virtual Gift Card']"));
		File from = img.getScreenshotAs(OutputType.FILE);
		File to= new File("C:\\Users\\harsh\\Documents\\SeleniumScreenShot\\giftcard.jpeg");
		FileHandler.copy(from, to);
		postCondition();
	}
}

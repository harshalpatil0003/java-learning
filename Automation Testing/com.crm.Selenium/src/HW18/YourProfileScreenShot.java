package HW18;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import UtilityClass.BaseClass;

public class YourProfileScreenShot  extends BaseClass{

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		
		preCondition("chrome", "https://www.instagram.com/cristiano/");
		
		String name="cristiano";
		LocalDateTime date = LocalDateTime.now();
		String time= date.toString().replace(":", "-");
		String fileName=name+time;
		System.out.println(fileName);
		
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement ts = dr.findElement(By.xpath("//img[@alt=\"cristiano's profile picture\"]"));
		File from =ts.getScreenshotAs(OutputType.FILE);
		File to= new File("C:\\Users\\harsh\\Documents\\SeleniumScreenShot\\"+fileName+".png");
		FileHandler.copy(from, to);
		postCondition();
	}
}
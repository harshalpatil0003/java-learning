package ScreenShot;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import UtilityClass.BaseClass;

public class ScreenShotBasedOnCondtn extends BaseClass {

	public static void main(String[] args) throws Exception {
		
		preCondition("chrome", "https://shoppersstack.com/");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		dr.findElement(By.id("men")).click();
		try {
			dr.findElement(By.xpath("//div[contains(@class,'MuiPaper-root')]"));
			System.out.println("Product found and testCase Passed");
		}
		catch (Exception e) {
			String name="shopperstackmen";
			LocalDateTime date = LocalDateTime.now();
			String time= date.toString().replace(":", "-");
			String fileName=name+time;
			
			TakesScreenshot ts=(TakesScreenshot) dr;
			File from =ts.getScreenshotAs(OutputType.FILE);
			File to= new File("C:\\Users\\harsh\\Documents\\SeleniumScreenShot\\"+fileName+".png");
			FileHandler.copy(from, to);
			postCondition();
			throw new Exception("product not found and test case fail");
		}
		postCondition();
	}
}

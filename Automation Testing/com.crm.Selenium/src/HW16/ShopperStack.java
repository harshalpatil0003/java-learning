package HW16;

import java.time.Duration;

//import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import UtilityClass.BaseClass;

public class ShopperStack extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		preCondition("chrome", "https://shoppersstack.com/");
		
		WebDriverWait wait= new WebDriverWait(dr, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));
		
		dr.findElement(By.id("loginBtn")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Create Account']")));
		
		dr.findElement(By.xpath("//span[text()='Create Account']")).click();
		
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.get("https://shoppersstack.com/");
		
		dr.findElement(By.id("loginBtn")).click();
		dr.findElement(By.xpath("//span[text()='Create Account']")).click();
		
		
		
	}
}

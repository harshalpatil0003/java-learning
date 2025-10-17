package HW10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterFB {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.facebook.com/");
		
		dr.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		
		
		List<WebElement> inputs = dr.findElements(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']"));
		
		for (int i = 0; i < inputs.size(); i++) {
				
			if (inputs.get(i)==inputs.get(0)) {
				
				inputs.get(i).sendKeys("Harshal");
				Thread.sleep(1000);
			}
			else if (inputs.get(i)==inputs.get(1)) {
				inputs.get(i).sendKeys("Patil");
				Thread.sleep(1000);
			}
			else if (inputs.get(i)==inputs.get(4)) {
				inputs.get(i).sendKeys("harsh@gmail.com");
				Thread.sleep(1000);
			}
			else if (inputs.get(i)==inputs.get(6)) {
				inputs.get(i).sendKeys("123456");
				Thread.sleep(1000);
			}
		}
		
		List<WebElement> dates = dr.findElements(By.xpath("//select [@aria-describedby='birthday-error-message']"));
		
		for (int i = 0; i < dates.size(); i++) {
			Select sel = new Select(dates.get(i));
			
			if (dates.get(i)==dates.get(0)) {
				
				sel.selectByIndex(14);
				Thread.sleep(1000);
			}
			else if (dates.get(i)==dates.get(1)) {
				sel.selectByValue("3");
				Thread.sleep(1000);
			}
			else if (dates.get(i)==dates.get(2)) {
				sel.selectByVisibleText("2003");
				Thread.sleep(1000);
			}
		}
		
		dr.findElement(By.xpath("(//input[@id='sex'])[2]")).click();
		Thread.sleep(3000);
		dr.quit();
	}
}

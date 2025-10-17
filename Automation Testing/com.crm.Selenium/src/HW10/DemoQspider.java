package HW10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoQspider {
	
		static WebDriver dr= new FirefoxDriver();
	
	public static void main(String[] args) throws Exception {
		
		dr.manage().window().maximize();
		dr.get("https://demoapps.qspiders.com/");
		dr.findElement(By.xpath("(//a[@class='block w-[100%] h-full'])[1]")).click();
		
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("//ul[@class='pt-2 pe-1']/li[2]")).click();
//		//dr.findElement(By.xpath("//section[text()='X Path']")).click();
		
		List<WebElement> inputs = dr.findElements(By.xpath("//ul[@class='mt-1 ps-3 pe-4']/li"));
		
		for (int i = 0; i < inputs.size(); i++) {
			
			if (inputs.get(i)==inputs.get(0)) {
				inputs.get(i).click();
				Thread.sleep(1000);
				fillCredentials();
			}
			else if(inputs.get(i)==inputs.get(1)) {
				inputs.get(i).click();
				Thread.sleep(1000);
				fillCredentials();
			}
			else if(inputs.get(i)==inputs.get(2)) {
				inputs.get(i).click();
				Thread.sleep(1000);
				fillCredentials();
			}
		}
		dr.close();
	}
	
	public static void fillCredentials() throws Exception {
		
		dr.findElement(By.xpath("(//input[contains(@class,'p-3 w-72 rounded border-none text-lg')])[1]")).sendKeys("Harsh");
		Thread.sleep(1000);
		dr.findElement(By.xpath("(//input[contains(@class,'p-3 w-72 rounded border-none text-lg')])[2]")).sendKeys("123456");
		Thread.sleep(1000);
		try {
			dr.findElement(By.xpath("(//input[contains(@class,\"rounded-full\")])[1]")).click();
			Thread.sleep(1000);
			dr.findElement(By.xpath("(//input[contains(@class,\"rounded-full\")])[2]")).click();
			Thread.sleep(1000);
		}
		catch (Exception e) {
			dr.findElement(By.xpath("//button[text()='Login']")).click();
			Thread.sleep(2000);
			dr.close();
			throw new Exception("no input boxes to click here! and button also clicked ");
		}
	}
	
}

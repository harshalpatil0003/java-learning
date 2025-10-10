package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr= new ChromeDriver();
		dr.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		dr.get("https://flipkart.com");
		Thread.sleep(1000);
		
		dr.navigate().back();
		Thread.sleep(1000);
		
		dr.navigate().forward();
		Thread.sleep(2000);
		
		dr.navigate().refresh();
		Thread.sleep(1000);
		dr.quit();
	}
}

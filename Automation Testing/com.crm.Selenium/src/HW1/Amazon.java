package HW1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://amazon.com");
		driver.navigate().to("https://amazon.com");
		Thread.sleep(10000);
		driver.close();
	}
}

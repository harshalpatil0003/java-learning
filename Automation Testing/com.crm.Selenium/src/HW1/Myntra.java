package HW1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
			
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://myntra.com");
		Thread.sleep(10000);
		dr.close();
	}
}

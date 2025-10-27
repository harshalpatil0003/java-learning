package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) {
		for (int i = 0; i <5; i++) {
			WebDriver dr= new ChromeDriver();
			dr.manage().window().maximize();
			dr.get("https://www.flipkart.com/");
			dr.close();
		}
	}
}

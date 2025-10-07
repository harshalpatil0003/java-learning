package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByTitle {

	public static void main(String[] args) {
		String title="Demo Web Shop";
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://demowebshop.tricentis.com/");
		System.out.println("Title: "+dr.getTitle());
		System.out.println((title.equals(dr.getTitle()))?("Landed at right page"):("Mislanding"));
		dr.quit();
	}
}

package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByUrl {

	public static void main(String[] args) throws Exception {
		String expect_url= "https://demowebshop.tricentis.com";
		
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://demowebshop.tricentis.com/");
		System.out.println(dr.getCurrentUrl());
		
	//	System.out.println((dr.getCurrentUrl().equals(expect_url))?("Into Targeted Page"):("Not Into Targeted Page"));
		
		if (dr.getCurrentUrl().equals(expect_url)) {
			System.out.println("Into Targeted Page");
		}
		else {
			System.out.println("Not Into Targeted Page");
			dr.close();
			throw new Exception("wrong page");
		}
		
		dr.quit();
	
	}
}

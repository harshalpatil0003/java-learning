package Basic;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	@Test
	public void a(){
		WebDriver dr= new ChromeDriver();
		dr.get("https://demowebshop.tricentis.com/");
		
	}
	@Test
	public void A1() {
		WebDriver dr= new ChromeDriver();
		dr.get("https://demowebshop.tricentis.com/digital-downloads");
	}
	@Test
	public void A2() {
		WebDriver dr= new ChromeDriver();
		dr.get("https://demowebshop.tricentis.com/gift-cards");
	}
	
}

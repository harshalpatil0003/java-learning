package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {

	public static void main(String[] args) {
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://demowebshop.tricentis.com/");
		
		Actions act= new Actions(dr);
		
		//scroll by coordinates
		//act.scrollByAmount(0, 735).perform();
		
		//scroll by webElement
		//WebElement feature_products = dr.findElement(By.xpath("//div[contains(@class,'product-grid home-page-product-grid')]"));
		WebElement feature_products = dr.findElement(By.xpath("//h3[text()='My account']"));
		act.scrollToElement(feature_products).perform();
	}
}

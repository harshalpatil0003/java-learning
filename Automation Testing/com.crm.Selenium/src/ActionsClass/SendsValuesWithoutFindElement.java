package ActionsClass;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendsValuesWithoutFindElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		Actions act =new Actions(dr);
		
//		for (int i = 0; i < 6; i++) {
//			
//			act.keyDown(Keys.TAB).perform();
//			Thread.sleep(1000);
//		}
//		
//		act.sendKeys("Laptops").perform();
		
		
		//Enter text to textField
//		WebElement serch_field=dr.findElement(By.id("small-searchterms"));
//		act.sendKeys(serch_field, "chai").keyDown(Keys.ENTER).perform();
//		Thread.sleep(1000);
		
		//WebElement books= dr.findElement(By.xpath("//a[contains(text(),'Books')]"));
		
		
		//act.keyDown(books, Keys.CONTROL).keyDown(Keys.ENTER).perform();
		//act.keyDown(Keys.CONTROL).click(books).perform();
		
		WebElement shoes= dr.findElement(By.xpath("//a[contains(text(),'Apparel & Shoes')]"));
		act.keyDown(shoes, Keys.SHIFT).click().perform();
		
		
		
		Thread.sleep(1000);
		dr.quit();
	}
}

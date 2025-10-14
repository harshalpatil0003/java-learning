package HW9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddGiftCards {

	public static void main(String[] args) throws Exception {
		
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://demowebshop.tricentis.com/");
		
		//enter to giftcards page
		dr.findElement(By.xpath("//ul[@class='top-menu']/li[7]/a")).click();
		Thread.sleep(1000);
		
		List<WebElement> add_to_cart = dr.findElements(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']"));
		
		//add products to card
		
		try {	
			for (int i = 0; i < add_to_cart.size(); i++) {
				
				add_to_cart.get(i).click();
				Thread.sleep(1000);
				
				// loop for inputs
				List<WebElement> inputs = dr.findElements(By.xpath("//div[@class='giftcard']/div/input"));
				
				try {
					for (int j = 0; j < inputs.size(); j++) {
						
						if (inputs.get(j)==inputs.get(0)) {
							
							inputs.get(j).sendKeys("Harshal");
						}
						else if (inputs.get(j)==inputs.get(1)) {
							inputs.get(j).sendKeys("harsh003@gmail.com");
						}
						else if (inputs.get(j)==inputs.get(2)) {
							inputs.get(j).sendKeys("Harshal");
						}
						else if (inputs.get(j)==inputs.get(3)) {
							inputs.get(j).sendKeys("harsh003@gmail.com");
						}
					}
				}
				catch (Exception e) {
					throw new Exception("failed to add values");
				}
				
				dr.findElement(By.className("message")).sendKeys("jaldi bhejo");
				Thread.sleep(1000);
			
				dr.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
				Thread.sleep(1000);
				
				dr.navigate().back();
				
				Thread.sleep(1000);
			}
			dr.navigate().refresh();
		}
		catch (Exception e) {
			throw new Exception("fail to to add gift card!");
		}
	}
}

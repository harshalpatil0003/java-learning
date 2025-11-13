package HW13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddProductToCart extends BaseClass {

	public static void addProductTocart() throws Exception {
		
		preCondition("chrom","https://demowebshop.tricentis.com/");
		login();
		
		try {
			dr.findElement(By.xpath("//input[@onclick=\"AjaxCart.addproducttocart_catalog('/addproducttocart/catalog/2/1/1    ');return false;\"]")).click();
			Thread.sleep(2000);
			List<WebElement> fields = dr.findElements(By.xpath("//div[@class='giftcard']/div/input"));
			
			for (int i = 0; i <fields.size(); i++) {
			
			
				if (i==0) {
					Thread.sleep(1000);
					fields.get(i).sendKeys("Harshal Patil");
					Thread.sleep(1000);
				}
				else if (i==1) {
					fields.get(i).sendKeys("harshpatil@gmail.com");
					Thread.sleep(1000);
				}
				
			}
			
			dr.findElement(By.id("giftcard_2_Message")).sendKeys("Jaldi Bhejo!");
			
			dr.findElement(By.id("add-to-cart-button-2")).click();
			
			System.out.println("product added successfully");
		}catch(Exception e) {
			postCondition();
			throw new Exception("Failed to add product");
			
		}
		logout();
		Thread.sleep(1000);
		postCondition();
	}
}

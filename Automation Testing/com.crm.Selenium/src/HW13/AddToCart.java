package HW13;

import org.openqa.selenium.By;

public class AddToCart extends BaseClass {


	public static void addAndRemove() throws Exception {
		
		preCondition("firefox", "https://demowebshop.tricentis.com/");
		login();
		try {
			dr.findElement(By.cssSelector("input[onclick=\"AjaxCart.addproducttocart_catalog('/addproducttocart/catalog/2/1/1    ');return false;\"]")).click();
			Thread.sleep(2000);
			dr.findElement(By.className("recipient-name")).sendKeys("Harshal");
			Thread.sleep(1000);
			dr.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("harshp123@gmail.com");
			Thread.sleep(1000);
			dr.findElement(By.id("giftcard_2_SenderName")).sendKeys("Harshal");
			Thread.sleep(1000);
			dr.findElement(By.id("giftcard_2_SenderEmail")).sendKeys("harshp123@gmail.com");
			Thread.sleep(1000);
			dr.findElement(By.id("giftcard_2_Message")).sendKeys("Jaldi Pohchao! ");
			Thread.sleep(2000);
			dr.findElement(By.id("addtocart_2_EnteredQuantity")).clear();
			Thread.sleep(1000);
			dr.findElement(By.id("addtocart_2_EnteredQuantity")).sendKeys("2");
			Thread.sleep(1000);
			dr.findElement(By.id("add-to-cart-button-2")).click();
			Thread.sleep(1000);
			dr.findElement(By.linkText("Shopping cart")).click();
			dr.findElement(By.name("removefromcart")).click();
			dr.findElement(By.cssSelector(".button-2.update-cart-button")).click();
			System.out.println("product successfully added and removed");
		}
		catch(Exception e) {
			postCondition();
			throw new Exception("fail to do");
			
		}
		Thread.sleep(3000);
		logout();
		Thread.sleep(1000);
		postCondition();
		
		
	}
}

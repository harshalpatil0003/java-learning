package HW4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddToCart {


	public static void main(String[] args) throws InterruptedException {
		WebDriver dr= new FirefoxDriver();
		dr.manage().window().maximize();
		dr.get("https://demowebshop.tricentis.com/");
		dr.findElement(By.cssSelector("input[onclick=\"AjaxCart.addproducttocart_catalog('/addproducttocart/catalog/2/1/1    ');return false;\"]")).click();
		
	//	dr.findElement(By.cssSelector(".recipient-name")).sendKeys("harshal");
		dr.findElement(By.id("add-to-wishlist-button-2")).click();
		System.out.println("hi ganu");
//		dr.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("harsh@gmail.com");
//		dr.findElement(By.id("giftcard_2_SenderName")).sendKeys("Harshal");
//		dr.findElement(By.id("giftcard_2_SenderEmail")).sendKeys("harshal@gmailcom");
//		dr.findElement(By.id("giftcard_2_Message")).sendKeys("Jaldi Pohchao! ");
		

		
//		Thread.sleep(2000);
		dr.quit();
	}
}

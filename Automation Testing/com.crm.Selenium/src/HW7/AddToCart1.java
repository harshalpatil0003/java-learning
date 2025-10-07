package HW7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://demowebshop.tricentis.com/");
		dr.findElement(By.xpath("(//input[contains(@class,'button-2 product-box-add-to-cart-button')])[3]")).click();
		dr.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		dr.findElement(By.xpath("(//ul[contains(@class,'option-list')])[1]/li[3]/input")).click();
		Thread.sleep(1000);
		dr.findElement(By.xpath("(//ul[contains(@class,'option-list')])[2]/li[1]/input")).click();
		Thread.sleep(1000);
		dr.findElement(By.xpath("(//ul[contains(@class,'option-list')])[3]/li[2]/input")).click();
		Thread.sleep(1000);
		
		dr.findElement(By.xpath("(//ul[contains(@class,'option-list')])[4]/li[1]")).click();
		Thread.sleep(1000);
		dr.findElement(By.xpath("(//ul[contains(@class,'option-list')])[4]/li[2]")).click();
		Thread.sleep(1000);
		dr.findElement(By.xpath("(//ul[contains(@class,'option-list')])[4]/li[3]")).click();
		Thread.sleep(1000);
		
		dr.findElement(By.id("addtocart_72_EnteredQuantity")).clear();
		dr.findElement(By.id("addtocart_72_EnteredQuantity")).sendKeys("3");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//input[contains(@ class,'button-1 add-to-cart-button')]")).click();
		Thread.sleep(3000);
		String qty= dr.findElement(By.xpath("//span[contains(@ class,'cart-qty')]")).getText();
		System.out.println(qty);
		
		if (qty.equals("(3)")) {
			System.out.println("Product Added");
		}
		else {
			System.out.println("Product Removed! ");
		}
		Thread.sleep(2000);
		
		dr.quit();
	}
}

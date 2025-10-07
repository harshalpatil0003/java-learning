package HW7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAddToCart2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://demowebshop.tricentis.com/");
		dr.findElement(By.xpath("//a[contains(@href,'/login')]")).click();
		Thread.sleep(4000);
		dr.findElement(By.xpath("//input [contains(@id,'Email')]")).sendKeys("iamteju@gmail.com");
		dr.findElement(By.xpath("//input [contains(@id,'Password')]")).sendKeys("123456");
		dr.findElement(By.xpath("//input [contains(@id,'RememberMe')]")).click();
		dr.findElement(By.xpath("//input [contains(@value,'Log in')]")).click();
		
		dr.findElement(By.xpath("(//a [contains(@href,'/digital-downloads')])[1]")).click();
		
		dr.findElement(By.xpath("(//input [contains(@class,'button-2 product-box-add-to-cart-button')])[1]")).click();
		Thread.sleep(1000);
		dr.findElement(By.xpath("(//input [contains(@class,'button-2 product-box-add-to-cart-button')])[2]")).click();
		Thread.sleep(1000);
		dr.findElement(By.xpath("(//input [contains(@class,'button-2 product-box-add-to-cart-button')])[3]")).click();
		
		Thread.sleep(3000);
		dr.findElement(By.xpath("(//span[contains(@class,'cart-label')])[1]")).click();
		
		dr.findElement(By.xpath("(//a[text()='3rd Album'])[2]/../preceding-sibling::td/input")).click();
		
		dr.findElement(By.xpath("//input[contains(@value,'Update shopping cart')]")).click();
		
//		String prod = dr.findElement(By.xpath("//a[contains(@class,'product-name')]")).getText();
//		System.out.println(prod);
		

		String qty=dr.findElement(By.xpath("//span[text()='(2)']")).getText();
		
		if (qty.equals("(2)")) {
			System.out.println("Product Removed! ");
		}
		else {
			System.out.println("failed! ");
		}
		
		//logout
		dr.findElement(By.xpath("//a[contains(@ href,'/logout')]")).click();
		Thread.sleep(4000);
		dr.quit();
		
	}
}

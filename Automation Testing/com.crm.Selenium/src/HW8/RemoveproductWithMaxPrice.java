package HW8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveproductWithMaxPrice {

	public static void main(String[] args) throws Exception {
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://demowebshop.tricentis.com/");
		dr.findElement(By.xpath("(//ul [contains(@class,'top-menu')]/li[5]/a)[1]")).click();
		Thread.sleep(1000);
		 List<WebElement> ele=dr.findElements(By.xpath("//input [@class='button-2 product-box-add-to-cart-button']"));
		 
		 for (WebElement web : ele) {
			web.click();
			Thread.sleep(1000);
		}
		 
		 dr.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	
		 List<WebElement> prices = dr.findElements(By.className("product-unit-price"));
		 ArrayList<Double> pri= new ArrayList<Double>();
		for (WebElement web : prices) {
	
			pri.add(Double.parseDouble(web.getText()));
		}
	
		
		Thread.sleep(2000);
	
		double maxPrice=Collections.max(pri);
		
		try {
		dr.findElement(By.xpath("(//span[text()="+maxPrice+"])[2]/../preceding-sibling::td/input")).click();
		Thread.sleep(1000);
		dr.findElement(By.xpath("//input[contains(@value,'Update shopping cart')]")).click();
		
		Thread.sleep(2000);
		}
		catch (Exception e) {
			System.out.println("fail");
			dr.close();
			throw new Exception("fail to remove product!");		}
		
		dr.quit();
	}
}


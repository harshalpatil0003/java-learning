package basics;

import org.openqa.selenium.WebElement ;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr= new FirefoxDriver();
		dr.manage().window().maximize();
		// xpath By Attribute
		dr.get("https://demowebshop.tricentis.com/");
//		dr.findElement(By.xpath("//a[@ href='/books']")).click();
//		dr.findElement(By.xpath("//a[@ href='/computers']")).click();
//		dr.findElement(By.xpath("//a[@ href='/electronics']")).click();
		
		//Xpath By text() function.
//		dr.get("https://facebook.com");
//		dr.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
//		Thread.sleep(2000);
		
		// conatins method selector
//		dr.get("https://facebook.com");
//		dr.findElement(By.xpath("//a[contains(@ id,'u_0_0_')]")).click();
//		Thread.sleep(2000);
		
		
		//Xpath By Group of Index
		//dr.findElement(By.xpath("(//input [(@ name='pollanswers-1')]) [4]")).click();
		
		// xpath by dependent and independent path
		
		//WebElement laptop = dr.findElement(By.xpath("//a [text(),'141-inch-laptop']/../../div[3]/div/span"));
		WebElement laptop =dr.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../../div[3]/div/span"));
		System.out.println(laptop.getText());
		
		dr.quit();
	}
}

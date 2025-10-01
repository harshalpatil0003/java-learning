package Webelementsmethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class ReadText {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://demowebshop.tricentis.com");
		Thread.sleep(1000);
		WebElement cart=dr.findElement(By.className("ico-cart"));
		
		String str=dr.findElement(By.partialLinkText("Community")).getText();
		System.out.println(str);
		//System.out.println(cart.getText());
		Thread.sleep(2000);
		//dr.close();
		
		
	}
}

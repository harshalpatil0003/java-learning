package HW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {

	public static void main(String[] args) {
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://demowebshop.tricentis.com/");
		dr.findElement(By.className("ico-register")).click();
		dr.findElement(By.className("ico-login")).click();
		dr.findElement(By.className("ico-cart")).click();
		dr.findElement(By.className("ico-wishlist")).click();
		dr.close();
	}
}

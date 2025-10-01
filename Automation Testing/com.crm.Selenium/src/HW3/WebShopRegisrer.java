package HW3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebShopRegisrer {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr =new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://demowebshop.tricentis.com/");
		dr.findElement(By.className("ico-register")).click();
		dr.findElement(By.id("gender-male")).click();
		dr.findElement(By.id("FirstName")).sendKeys("Tejus");
		dr.findElement(By.id("LastName")).sendKeys("Kashyap");
		dr.findElement(By.name("Email")).sendKeys("iamteju@gmail.com");
		dr.findElement(By.name("Password")).sendKeys("123456");
		dr.findElement(By.name("ConfirmPassword")).sendKeys("123456");
		Thread.sleep(2000);
		dr.findElement(By.id("register-button")).click();
	}
}

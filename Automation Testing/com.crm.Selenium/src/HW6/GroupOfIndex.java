package HW6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GroupOfIndex {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr= new FirefoxDriver();
		dr.manage().window().maximize();
		dr.get("https://facebook.com");
		dr.findElement(By.xpath("//a[text()='Create new account']")).click();
		dr.findElement(By.name("firstname")).sendKeys("Harshal");
		dr.findElement(By.name("lastname")).sendKeys("Patil");
		Thread.sleep(1000);
		dr.findElement(By.xpath("(// span[contains (@class,'_5k_4')])[1]/span/select[1]")).click();
		dr.findElement(By.xpath("(// span[contains (@class,'_5k_4')])[1]/span/select[1]")).sendKeys("15");
		Thread.sleep(1000);
		
		dr.findElement(By.xpath("(// span[contains (@class,'_5k_4')])[1]/span/select[2]")).click();
		dr.findElement(By.xpath("(// span[contains (@class,'_5k_4')])[1]/span/select[2]")).sendKeys("Mar");
		Thread.sleep(1000);
		
		dr.findElement(By.xpath("(// span[contains (@class,'_5k_4')])[1]/span/select[3]")).click();
		dr.findElement(By.xpath("(// span[contains (@class,'_5k_4')])[1]/span/select[3]")).sendKeys("2003");
		Thread.sleep(1000);
		
		dr.findElement(By.xpath("// span[contains(@ class,'_5k_3')]/span[2]")).click();
		Thread.sleep(1000);
		
		dr.findElement(By.xpath("(// div[contains(@ class,'mbm _a4y')])[1]/div/div/input")).sendKeys("8767887013");
		Thread.sleep(1000);
		
		dr.findElement(By.xpath("//div [contains(@class, 'mbm _br- _a4y')]/div/div/input")).sendKeys("123456");
		
		Thread.sleep(2000);
		dr.quit();
		
	}
}

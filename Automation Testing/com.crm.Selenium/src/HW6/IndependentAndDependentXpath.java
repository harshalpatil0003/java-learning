package HW6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IndependentAndDependentXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr= new FirefoxDriver();
		dr.manage().window().maximize();
		dr.get("https://demowebshop.tricentis.com/");
		dr.findElement(By.xpath("// ul[contains(@ class, 'top-menu')]/li[5]/a")).click();
		Thread.sleep(1000);
		String p1=dr.findElement(By.xpath("//a[text()='3rd Album']/../../div[3]/div/span")).getText();
		System.out.println(p1);
		
		String p2= dr.findElement(By.xpath("(//a[text()='Music 2']/../../div[3]/div/span)[1]")).getText();
		System.out.println(p2);
		
		String p3= dr.findElement(By.xpath("(//a[text()='Music 2']/../../div[3]/div/span)[2]")).getText();
		System.out.println(p3);
		dr.quit();
	}
}

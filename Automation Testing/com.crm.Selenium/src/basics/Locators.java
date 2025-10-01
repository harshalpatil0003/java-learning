package basics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {

	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://demowebshop.tricentis.com/");
		
//		dr.navigate().to("https://demowebshop.tricentis.com/");
		//tagName Selector
//		WebElement searchField=dr.findElement(By.tagName("input"));
//		searchField.sendKeys("computer");
		
		// className Selector
//		WebElement searchField2=dr.findElement(By.className("search-box-button"));
//		//WebElement searchField21=dr.findElement(By.tagName("a"));
//		searchField2.click();
		// name Selector
//		dr.findElement(By.name("q")).sendKeys("computer");
//		dr.findElement(By.className("search-box-button")).click();
//		dr.findElement(By.className("ico-register")).click();
//		
		// id Selector
//		dr.findElement(By.id("gender-male")).click();
		
		
		//dr.findElement(By.id("small-searchterms")).sendKeys("laptop");
		
		//cssSelector used
		//dr.findElement(By.cssSelector("input[type='submit']")).click();
		dr.findElement(By.cssSelector("#small-searchterms")).sendKeys("laptop");
		dr.findElement(By.cssSelector(".button-1.search-box-button")).click();
		Thread.sleep(3000);
		dr.close();
	}
}

package basics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class directLocators {

	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		//dr.get("https://demowebshop.tricentis.com/");
		dr.navigate().to("https://demowebshop.tricentis.com/");
		WebElement searchField=dr.findElement(By.tagName("input"));
		searchField.sendKeys("computer");
		WebElement searchField2=dr.findElement(By.className("search-box-button"));
		//WebElement searchField21=dr.findElement(By.tagName("a"));
		searchField2.click();
		Thread.sleep(10000);
		dr.close();
	}
}

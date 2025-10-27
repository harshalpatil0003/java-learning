package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSortByInSDWS {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://demowebshop.tricentis.com/");
		
		dr.findElement(By.xpath("//ul[@class='top-menu']/li[5]")).click();
		
		Thread.sleep(1000);
		
		WebElement sortedBy = dr.findElement(By.id("products-orderby"));
		
		Select sel= new Select(sortedBy);
		
		List<WebElement> options = sel.getOptions();
		int i=0;
		for (WebElement web : options) {
			sortedBy = dr.findElement(By.id("products-orderby"));
			sel= new Select(sortedBy);
			sel.selectByIndex(i++);
			Thread.sleep(1000);
			
		}
		Thread.sleep(2000);
		dr.close();
	}
}

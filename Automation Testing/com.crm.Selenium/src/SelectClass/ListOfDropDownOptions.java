package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListOfDropDownOptions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("file:///C:/Users/harsh/Downloads/demo.html");
		
		WebElement singleSelect = dr.findElement(By.id("standard_cars"));
		
		Select sel= new Select(singleSelect);
		
		List<WebElement> cars = sel.getOptions();
		
		for (WebElement web : cars) {
			
			web.click();
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		dr.close();
	}
}

package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("file:///C:/Users/harsh/Downloads/demo.html");
//		WebElement singleSelect = dr.findElement(By.id("standard_cars"));
		
		
		// single select
//		Select sel= new Select(singleSelect);
//		sel.selectByIndex(2);
//		Thread.sleep(1000);
//		
//		sel.selectByVisibleText("Nissan");
//		Thread.sleep(1000);
//		
//		sel.selectByValue("lr");
//		Thread.sleep(2000);
		
		//select Multiple select 
		
		WebElement multiSelect = dr.findElement(By.id("multiple_cars"));
		Select sel= new Select(multiSelect);
		sel.selectByIndex(1);
		Thread.sleep(1000);
		
		sel.selectByVisibleText("BMW");
		Thread.sleep(1000);
		
		sel.selectByValue("lr");
		Thread.sleep(2000);
		
		
		//deselect 
		sel.deselectByVisibleText("BMW");
		sel.deselectByValue("lr");
		sel.deselectByIndex(2);
		sel.deselectAll();
		
		
		
		
		dr.close();
		
		
	}
}

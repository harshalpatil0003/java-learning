package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("file:///C:/Users/harsh/Downloads/demo.html");
		
		WebElement singleSelect = dr.findElement(By.id("standard_cars"));
		
		Select sel= new Select(singleSelect);
		sel.selectByIndex(2);
		
		if (sel.isMultiple()) {
			System.out.println("It is a MultiSelect dropdown menu");
			sel.deselectByIndex(2);
		}
		else {
			System.out.println("It is a single select dropdown");
			System.out.println("Deselect Cannot be performed");
		}
		
		dr.quit();
	}
}

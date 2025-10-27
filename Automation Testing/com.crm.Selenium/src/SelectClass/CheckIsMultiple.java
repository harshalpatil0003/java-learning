package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckIsMultiple {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("file:///C:/Users/harsh/Downloads/demo.html");
		WebElement multiDropdown = dr.findElement(By.id("multiple_cars"));
		
		Select sel= new Select(multiDropdown);
		
		sel.selectByIndex(0);
		Thread.sleep(1000);
		sel.selectByIndex(1);
		Thread.sleep(1000);
		sel.selectByIndex(2);
		Thread.sleep(1000);
		sel.selectByIndex(3);
		Thread.sleep(1000);
		
		if (sel.isMultiple()) {
			System.out.println("It is muti select DropDown");
		}
		else {
			System.out.println("It is not multiselect DropDown");
		}
		
		sel.deselectAll();
		Thread.sleep(2000);
		
		dr.close();
	}
}

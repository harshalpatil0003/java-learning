package Popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class ChildBrowser extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		preCondition("chrome","https://demowebshop.tricentis.com/");
		login();
		String parenthandle= dr.getWindowHandle();
		WebElement facebook = dr.findElement(By.xpath("//a[text()='Facebook']"));
		
		Actions act= new Actions(dr);
		//act.scrollToElement(facebook).click().perform();
		
		Set<String> childHandles=dr.getWindowHandles();
		childHandles.remove(parenthandle);
		for (String str : args) {
			dr.switchTo().window("childHandles");
		}
		//dr.findElement(By.xpath("//span[text()='Create new account']")).click();
		
		//postCondition();
		
	}
}

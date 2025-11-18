package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class OmayoScroll extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		preCondition("chrome", "https://omayo.blogspot.com/");
		Actions act= new Actions(dr);
		act.scrollByAmount(0, 400).perform();
		//act.scrollToElement(dr.findElement(By.id("HTML28"))).perform();
	}
}

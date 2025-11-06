package ActionsClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyPress {

	public static void main(String[] args) throws Exception {
		String URL="https://demowebshop.tricentis.com/register";
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(1000);
		Actions act= new Actions(dr);
		act.keyDown(Keys.TAB).perform();
		Thread.sleep(1000);
		act.keyDown(Keys.TAB).perform();
		Thread.sleep(1000);
		act.keyDown(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		if (URL.equals(dr.getCurrentUrl())) {
			System.out.println("You are at right page");
		}
		else {
			dr.quit();
			throw new Exception("You are not at register page");
		}
		dr.quit();
	}
}

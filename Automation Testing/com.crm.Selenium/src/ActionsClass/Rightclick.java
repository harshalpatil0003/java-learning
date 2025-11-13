package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act= new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//span[text()='right click me']"))).contextClick().click(driver.findElement(By.xpath("//span[text()='Copy']"))).perform();
	}
}

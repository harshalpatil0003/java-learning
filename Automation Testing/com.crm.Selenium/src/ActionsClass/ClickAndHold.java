package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) {
		
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://demo.automationtesting.in/Static.html");
		
		Actions act= new Actions(dr);
		
		WebElement source = dr.findElement(By.id("mongo"));
		WebElement target= dr.findElement(By.id("droparea"));
		act.clickAndHold(source).release(target).perform();
		
		dr.close();
	}
}

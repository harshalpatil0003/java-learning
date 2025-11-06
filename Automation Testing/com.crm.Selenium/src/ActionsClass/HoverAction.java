package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		WebElement kids = driver.findElement(By.xpath("//a[@data-group='kids']"));
		
		Actions act= new Actions(driver);
		
		// Action class Hover method
		act.moveToElement(kids).perform();
		
		WebElement ethenic_Wear = driver.findElement(By.xpath("//a[text()='Ethnic Wear' and @data-reactid='357']"));
		
		
		//Actions class click method
		act.click(ethenic_Wear).perform();
		Thread.sleep(2000);
		driver.close();
		
	}
}

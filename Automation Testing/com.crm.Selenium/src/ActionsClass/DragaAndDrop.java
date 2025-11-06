package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragaAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr= new ChromeDriver();
		
		dr.manage().window().maximize();
		dr.get("https://demo.automationtesting.in/Static.html");
		
		Actions act= new Actions(dr);
		
		WebElement source1= dr.findElement(By.id("node"));
		WebElement source2 = dr.findElement(By.id("mongo"));
		WebElement source3 = dr.findElement(By.id("angular"));
		WebElement target= dr.findElement(By.id("droparea"));
		
		act.dragAndDrop(source1,target).perform();
		Thread.sleep(2000);
		act.dragAndDrop(source2,target).perform();
		Thread.sleep(2000);
		act.dragAndDrop(source3,target).perform();
		Thread.sleep(2000);
		dr.close();
	}
}

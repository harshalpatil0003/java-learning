package ActionsClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RegisterWithoutFindElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://demowebshop.tricentis.com/");
		
		Actions act= new Actions(dr);
		
		act.keyDown(Keys.TAB).perform();
		act.keyDown(Keys.TAB).keyDown(Keys.ENTER).perform();
		
		for (int i = 1; i <= 31; i++) {
			
			act.keyDown(Keys.TAB).perform();
			
			if(i==25) {
				act.sendKeys(Keys.SPACE).perform();
				Thread.sleep(500);
			}
			else if (i==26) {
				act.sendKeys("Harshal").perform();
				Thread.sleep(500);
			}
			else if (i==27) {
				act.sendKeys("Patil").perform();
				Thread.sleep(500);
			}
			else if (i==28) {
				act.sendKeys("harsh@gmail.com").perform();
				Thread.sleep(500);
			}
			else if (i==29) {
				act.sendKeys("123456").perform();
				Thread.sleep(500);
			}
			else if (i==30) {
				act.sendKeys("123456").perform();
				Thread.sleep(500);
			}
			else if (i==31) {
				act.sendKeys(Keys.SPACE).perform();
				Thread.sleep(500);
			}
		}
		
		dr.close();
		
	}
}

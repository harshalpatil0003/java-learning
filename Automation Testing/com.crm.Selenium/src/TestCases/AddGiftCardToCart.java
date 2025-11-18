package TestCases;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import UtilityClass.BaseClass;
public class AddGiftCardToCart extends BaseClass{

	public static void main(String[] args) throws Exception {
		String expected_URL="https://demowebshop.tricentis.com/";
		preCondition("chrome", "https://demowebshop.tricentis.com/");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		if (expected_URL.equals(dr.getCurrentUrl())) {
			login();
			Actions act= new Actions(dr);
			WebElement item=dr.findElement(By.xpath("(//input[@value='Add to cart'])[1]"));
			act.scrollToElement(item);
			item.click();
			//List<WebElement> inputs = dr.findElements(By.xpath("//div[@class='giftcard']/div/input"));
			Thread.sleep(2000);
			try {
				dr.findElement(By.xpath("(//div[@class='giftcard']/div/input)[1]")).sendKeys("Harshal Patil");
				Thread.sleep(2000);
				dr.findElement(By.xpath("(//div[@class='giftcard']/div/input)[2]")).sendKeys("harsh@gmil.com");
				Thread.sleep(2000);
				dr.findElement(By.className("message")).sendKeys("Jaldi Bhejo");
				dr.findElement(By.id("addtocart_2_EnteredQuantity")).clear();
				Thread.sleep(1000);
				dr.findElement(By.id("addtocart_2_EnteredQuantity")).sendKeys("2");
				dr.findElement(By.id("add-to-cart-button-2")).click();
				System.out.println("Test case passed, Product Successfully added to cart");
			}catch (Exception e) {
				postCondition();
				throw new Exception("Failed to add in cart");
			}
			System.out.println("Landed into right page");
			
		}else {
			postCondition();
			throw new Exception("Landed Into wrong page");
		}
		logout();
		postCondition();
	}
}

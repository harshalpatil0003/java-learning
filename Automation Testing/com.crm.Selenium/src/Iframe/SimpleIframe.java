package Iframe;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import UtilityClass.BaseClass;
public class SimpleIframe extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		preCondition("chrome", "https://demo.automationtesting.in/Frames.html");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//3 ways to switch controller to iframe from main page 
		//dr.switchTo().frame(0);
		//dr.switchTo().frame("singleframe");
		WebElement iframe = dr.findElement(By.xpath("//iframe[@id='singleframe']"));
		dr.switchTo().frame(iframe);
		dr.findElement(By.xpath("//input[@type='text']")).sendKeys("Harshal");
		dr.switchTo().parentFrame();
		dr.findElement(By.linkText("Home")).click();
		postCondition();
	}
}
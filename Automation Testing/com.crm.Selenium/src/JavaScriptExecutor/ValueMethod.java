package JavaScriptExecutor;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import UtilityClass.BaseClass;

public class ValueMethod extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		preCondition("chrome", "https://www.facebook.com/");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.findElement(By.linkText("Create new account")).click();
		JavascriptExecutor js=(JavascriptExecutor) dr;
		js.executeScript("arguments[0].value='Transgender';", dr.findElement(By.id("custom_gender")));
	}
}
package JavaScriptExecutor;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import UtilityClass.BaseClass;

public class ScrollMethods extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		preCondition("chrome", "https://demowebshop.tricentis.com/");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)dr;
		js.executeScript("window.scrollTo(0,500)");
		//js.executeScript("window.scrollBy(0,500)");
	}
}

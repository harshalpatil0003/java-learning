package HW16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicittimout {

	public static void main(String[] args) {
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.get("https://shoppersstack.com/");
		
		dr.findElement(By.id("loginBtn")).click();
		dr.findElement(By.xpath("//span[text()='Create Account']")).click();
	}
}

//Open browser
// enter to Omayo.blogspot
//retrive text of textWillbedisplaywithdelay
//refresh page
//click timer enabled button
//after clicking handle popup
//close browser (dont use thread.sleep)


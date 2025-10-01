package HW4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadCommunityPoll {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://demowebshop.tricentis.com/");
		dr.findElement(By.id("pollanswers-1")).click();
		Thread.sleep(1000);
		dr.findElement(By.id("pollanswers-2")).click();
		Thread.sleep(1000);
		dr.findElement(By.id("pollanswers-3")).click();
		Thread.sleep(1000);
		dr.findElement(By.id("pollanswers-4")).click();
		Thread.sleep(3000);
		dr.close();
	}
}

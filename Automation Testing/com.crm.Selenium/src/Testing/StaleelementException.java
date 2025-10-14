package Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaleelementException {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr= new FirefoxDriver();
		dr.manage().window().maximize();
		dr.get("https://demowebshop.tricentis.com/");
		List<WebElement> links = dr.findElements(By.xpath("//div[@class=\"header-links-wrapper\"]/div/ul/li/a"));
		
		for (int i = 0; i < links.size(); i++) {
			links.get(i).click();
			links=dr.findElements(By.xpath("//div[@class=\"header-links-wrapper\"]/div/ul/li/a"));
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		dr.quit();
	}
}

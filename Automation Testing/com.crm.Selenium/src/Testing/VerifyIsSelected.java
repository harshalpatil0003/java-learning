package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyIsSelected {

	public static void main(String[] args) throws Exception {
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://demowebshop.tricentis.com/");
		WebElement excellent=dr.findElement(By.xpath("//ul[contains(@ class,'poll-options')]/li[1]/label"));
		excellent.click();
		Thread.sleep(2000);
		System.out.println("hi");
		System.out.println(excellent.isSelected());
		
		if (excellent.isSelected()) {
			System.out.println("radio button is selected !");
		}
		else {
		
			throw new Exception("fail to select ");
			
		}
		dr.close();
	}
}

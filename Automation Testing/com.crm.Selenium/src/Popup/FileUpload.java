package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class FileUpload extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		preCondition("chrome", "https://www.ilovepdf.com/pdf_to_word");
		
		Thread.sleep(2000);
		WebElement upload = dr.findElement(By.xpath("//input[@type='file']"));
		upload.sendKeys("C:\\Users\\harsh\\Downloads\\HarshPatil.pdf");
		
	}
}

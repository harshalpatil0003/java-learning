package HW12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoQspidersDragDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://demoapps.qspiders.com/");
		
		Actions act= new Actions(dr);
		dr.findElement(By.xpath("(//a[@class='block w-[100%] h-full'])[1]")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//ul[@class='pt-2 pe-1']/li[8]")).click();
		//dr.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		
		
	}
}

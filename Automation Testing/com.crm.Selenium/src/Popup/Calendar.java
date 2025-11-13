package Popup;

import org.openqa.selenium.By;

import UtilityClass.BaseClass;

public class Calendar extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		preCondition("chrome", "https://www.easemytrip.com/");
		dr.findElement(By.id("ddate")).click();
		Thread.sleep(2000);
		dr.findElement(By.id("snd_5_07/11/2025")).click();
		Thread.sleep(2000);
		dr.findElement(By.id("divRtnCal")).click();
		Thread.sleep(2000);
	
		for(;;) {
			try {
				dr.findElement(By.id("fst_3_01/07/2026")).click();
				break;
			}catch (Exception e) {
				dr.findElement(By.id("img2Nex")).click();
			}
			Thread.sleep(2000);	
		}
		
		
	}
}

//open Browser
// Enter into Agoda application
// select current date as departuredate
// select a day after 120 days as return date
// close

//open browser
// enter redbus.in
// filled details all
//date of journey will be 3 days after todays date
// search for bus

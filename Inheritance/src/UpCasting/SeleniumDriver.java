package UpCasting;

public class SeleniumDriver {
public static void main(String[] args) {
	
	// ChromeDriver is upcasted to RemoteDriver.
	RemoteDriver r1=new ChromeDriver();
	// RemoteDriver is upcasted to WebDriver.
	WebDriver w1 =new RemoteDriver();
	// RemoteDriver is downcasted to chromeDriver
	ChromeDriver c1=(ChromeDriver)r1;
	c1.webDriver();
	c1.remoteDriver();
	c1.chromeDriver();
	}
}
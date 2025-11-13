package HW13;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseClass {

	public static WebDriver dr= null;
	public static void preCondition(String browser, String url) throws InterruptedException{
	
		if (browser.equalsIgnoreCase("chrome")) {
			dr= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			dr= new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			dr= new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("safari")) {
			dr= new SafariDriver();
		}
		else if(browser.equalsIgnoreCase("internetexplorer")) {
			dr= new InternetExplorerDriver();
		}
		else {
			dr= new ChromeDriver();
		}
		
		dr.manage().window().maximize();
		Thread.sleep(2000);
		dr.get(url);
	}
	
	public static void login() throws InterruptedException {
		
		dr.findElement(By.className("ico-login")).click();
		dr.findElement(By.id("Email")).sendKeys("harshpatil@gmail.com");
		dr.findElement(By.id("Password")).sendKeys("123456");
		dr.findElement(By.id("RememberMe")).click();
		Thread.sleep(2000);
		dr.findElement(By.cssSelector(".button-1.login-button")).click();
	}
	
	public static void logout() {
		
		dr.findElement(By.className("ico-logout")).click();
	}
	
	public static void postCondition() {
		dr.quit();
	}
	
	
}

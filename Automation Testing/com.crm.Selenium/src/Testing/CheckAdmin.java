package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAdmin {

	public static void main(String[] args) throws Exception {
		
		ChromeDriver dr= new ChromeDriver();
		
		String userid="Admin";
		String pw="admin123";
		String home="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		dr.manage().window().maximize();
		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		 WebElement user = dr.findElement(By.name("username"));
		  user.sendKeys(userid);
		 
		 WebElement pass= dr.findElement(By.name("password"));
		 pass.sendKeys(pw);
		 
		 String currentAdmin=user.getAttribute("value");
		 String currentPass= pass.getAttribute("value");
		 
		 if (currentAdmin.equals(userid)  &&  currentPass.equals(pw)) {
			 
			 dr.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
			 Thread.sleep(3000);
			System.out.println("Admin Verified ");
			
			 if (home.equals(dr.getCurrentUrl())) {
					System.out.println("Landed to home page!");
				}
			 Thread.sleep(2000);
			 
		}
		 else {
			 dr.close();
			 throw new Exception("Admin not verified!");
		 }
		
	}
}

package loginframework;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class xgmaillogin12 {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException{
		
		BasicConfigurator.configure();
		Logger log = Logger.getLogger("xgmaillogin12");
		PropertyConfigurator.configure("log4j.properties");	
		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		log.info("opening browser");
			driver.get("https://accounts.google.com/");
			log.info("gmail");
			driver.findElement(By.id("Email")).sendKeys("sandyellur");
			driver.findElement(By.id("next")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("Passwd")).sendKeys("Nara54");
			driver.findElement(By.id("signIn")).click();
	
	}

}

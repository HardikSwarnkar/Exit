package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class initializeDriver {
	
	   static WebDriver driver;

	    public WebDriver initializeDriver(String browser) {
	        if (browser.equalsIgnoreCase("chrome")) {
	        	WebDriverManager.chromedriver().setup();
	        	
	    		driver = new ChromeDriver();
	    		
	        } else if (browser.equalsIgnoreCase("firefox")) {
	            
	            FirefoxOptions options = new FirefoxOptions();
	            driver = new FirefoxDriver(options);
	        }else if (browser.equalsIgnoreCase("edge")) {
	          
	            driver = new EdgeDriver();
	        }

	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        return driver;
	    }


	


}

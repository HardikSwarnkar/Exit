package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productPage {
  
    
    WebDriver driver=null;
    
	public productPage(WebDriver driver) {
		
		this.driver=driver;
	}
    
    
    public void navigatetoProduct() {
    	WebElement nextbutton=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/ul/li[2]/div/div/img"));
		nextbutton.click();
		WebElement nextbutton1=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/ul/li[3]/div/div/img"));
		nextbutton1.click();
		WebElement nextbutton2=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/ul/li[4]/div/div/img"));
		nextbutton2.click();
		
    	
    }
    
   
}

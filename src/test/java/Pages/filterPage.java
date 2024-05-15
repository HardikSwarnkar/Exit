
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class filterPage{
  
    
    WebDriver driver=null;
    
	public filterPage(WebDriver driver) {
		
		this.driver=driver;
	}
    
    
    public void price() {
    	WebElement price_dropdown = driver.findElement(By.xpath(("//div[@class='tKgS7w']//select[contains(@class, 'Gn+jFg')]")));
    
    	Select priceRange=new Select(price_dropdown);
    	
    	priceRange.selectByValue("40000");

    	
    }
    
}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class pincodePage {
	 
    WebDriver driver=null;
    
	public pincodePage(WebDriver driver) {
		
		this.driver=driver;
	}
    
    
    public void validPincode(String Inputtext) throws InterruptedException {
    	
    	WebElement inputElement = driver.findElement(By.xpath("//input[@class='AFOXgu']"));
        
        // Clear any pre-existing text
        inputElement.clear();
        
        // Send text to the input element
        inputElement.sendKeys(Inputtext);

        inputElement.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    	
    }
}


package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public class signUpPage {
    private WebDriver driver;
 
   
    private By loginButtonLocator = By.xpath("//a[@title='Login'][1]");
    
    private By inputElementLocator = By.xpath("//input[@class=\"r4vIwl BV+Dqf\"]");

    public signUpPage(WebDriver driver) {
        this.driver = driver;
     
    }

    
    public void performSignUp(String phoneNumber) {
      
            
            WebElement loginButton = driver.findElement(loginButtonLocator);
            loginButton.click();
            
            driver.findElement(By.xpath("(//div[@class=\"ZJ3AS1\"])/a[@class=\"azBkHf\"]")).click();
            WebElement inputElement = driver.findElement(inputElementLocator);
            inputElement.clear();
            inputElement.sendKeys(phoneNumber);
            inputElement.sendKeys(Keys.ENTER);
           
       
    }
}
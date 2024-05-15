package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cartPage {
   
    private WebDriver driver;

    public cartPage(WebDriver driver) {
        this.driver = driver;
    }


    public void addToCart() {
       
    	WebElement addToCartButton = driver.findElement(By.xpath(("//button[text()='Add to cart']")));
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addToCartButton);
    	addToCartButton.click();
    }
    
    public void removefromCart() {
        // Find and click on the "Add to Cart" button
    	WebElement removeCartButton = driver.findElement(By.xpath(("//div[text()='Remove']")));
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", removeCartButton);
    	removeCartButton.click();
    	
    	WebElement removeButton = driver.findElement(By.xpath(("//div[@class=\"sBxzFz fF30ZI A0MXnh\"]")));
    	removeButton.click();
    	
    	}
    public void getCartCount() {
        WebElement cartCountElement = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[2]/div/div[6]/div[1]/div/button[2]")); // Updated XPath
        cartCountElement.click();
        cartCountElement.click();
    }

    
    
}


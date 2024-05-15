package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sortPage {
   
    
    WebDriver driver=null;
    
	public sortPage (WebDriver driver) {
		
		this.driver=driver;
	}
    
    // Locators
    private By searchInput = By.name("q");
    private By searchButton = By.cssSelector("button[type='submit']");
    private By searchResultsContainer = By.className("B_NuCI");
    private By product=By.xpath("//div[@class='_4WELSP']");
    
    // Methods to interact with the elements
    public void enterSearchQuery(String query) {
        WebElement searchInputField = driver.findElement(searchInput);
        searchInputField.clear();
        searchInputField.sendKeys(query);
    }
    
    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }
    
    public boolean areSearchResultsDisplayed() {
        return driver.findElement(searchResultsContainer).isDisplayed();
    }
    
    public void sorting()
    {
    	driver.findElement(By.xpath("//div[@class=\"sHCOk2\"]/div[1]")).click();
    	driver.findElement(By.xpath("//div[@class=\"sHCOk2\"]/div[2]")).click();
    	driver.findElement(By.xpath("//div[@class=\"sHCOk2\"]/div[3]")).click();
    	driver.findElement(By.xpath("//div[@class=\"sHCOk2\"]/div[4]")).click();
    }    
}
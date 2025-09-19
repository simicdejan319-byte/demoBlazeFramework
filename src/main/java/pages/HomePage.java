package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class HomePage extends BasePage {

    public By lapTopSearchButtonCategories = By.xpath("//*[text()=\"Laptops\"]");
    public By productStoreLogo = By.id("nava");
    public By monitorsSearchButtonCategories = By.xpath("//*[text()=\"Monitors\"]");




    public HomePage(WebDriver driver, Duration timeout){
        super(driver, timeout);
    }


    public void lapTopBuyFlowHomePage(){
        click(lapTopSearchButtonCategories);
    }
    public boolean checkFinishBuyFlow(){
        return driver.findElement(productStoreLogo).isDisplayed();
    }
    public void monitorBuyFlowButtonCategories(){
        clickWhenScrollByElement(monitorsSearchButtonCategories);
    }












































}

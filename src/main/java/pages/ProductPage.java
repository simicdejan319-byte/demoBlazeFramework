package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class ProductPage extends BasePage{

    public By placeOrderButton = By.xpath("//*[text()=\"Place Order\"]");

    public By deleteButtonOfOrder = By.xpath("//*[text()=\"Delete\"]");

    public By macBookIsDisplay = By.xpath("//*[text()=\"MacBook air\"]");

    public ProductPage(WebDriver driver, Duration timeout){
        super(driver, timeout);
    }

    public void clickButtonPlaceOrder(){
        click(placeOrderButton);
    }

    public void clickButtonDelete(){
        click(deleteButtonOfOrder);
    }

    public boolean isMacBookEnabled(){
        return driver.findElement(macBookIsDisplay).isEnabled();
    }

















































}

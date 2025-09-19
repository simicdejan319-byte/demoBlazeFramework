package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class ProductPage extends BasePage{

    public By placeOrderButton = By.xpath("//*[text()=\"Place Order\"]");

    public ProductPage(WebDriver driver, Duration timeout){
        super(driver, timeout);
    }

    public void clickButtonPlaceOrder(){
        click(placeOrderButton);
    }









































}

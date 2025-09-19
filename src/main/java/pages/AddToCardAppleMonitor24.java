package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class AddToCardAppleMonitor24 extends BasePage {

    public By addToCardOfAplleMonitor24 = By.xpath("//*[text()=\"Add to cart\"]");

    public By cardHedderOfAplleMonitor24 = By.id("cartur");

    public AddToCardAppleMonitor24(WebDriver driver, Duration timeout){
        super(driver, timeout);
    }

    public void monitorBuyFlowAddToCard(){
        click(addToCardOfAplleMonitor24);
        acceptAlertTwo();
        click(cardHedderOfAplleMonitor24);
    }

































}

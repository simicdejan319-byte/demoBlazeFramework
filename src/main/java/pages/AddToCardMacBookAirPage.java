package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class AddToCardMacBookAirPage extends BasePage {

    public By addToCardButtonOfMacBook = By.xpath("//*[text()=\"Add to cart\"]");

    public By cardHedderOfMacBook = By.id("cartur");






    public AddToCardMacBookAirPage(WebDriver driver, Duration timeout){
        super(driver, timeout);
    }

    public void lapTopBuyFlowAddToCard(){
        click(addToCardButtonOfMacBook);
        acceptAlertTwo();
        click(cardHedderOfMacBook);
    }












































}

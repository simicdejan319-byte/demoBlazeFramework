package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class CostumersInformation extends BasePage {

    public By nameInputFIeld = By.id("name");

    public By countryOfCustomerInputField = By.id("country");

    public By cityOfCustomerInputField = By.id("city");

    public By cardOfCustomerInputField = By.id("card");

    public By mounthWhenThisOrderMade = By.id("month");

    public By yearWhenThisOrderMade = By.id("year");

    public By purchaseButton = By.xpath("//*[text()=\"Purchase\"]");


    public CostumersInformation(WebDriver driver, Duration timeout){
        super(driver, timeout);
    }

    public void addCustomersInformation() {
        fillField(nameInputFIeld, faker.name().firstName());
        fillField(countryOfCustomerInputField, faker.country().name());
        fillField(cityOfCustomerInputField, faker.address().city());
        fillField(cardOfCustomerInputField, "1231245");
        fillField(mounthWhenThisOrderMade, "10");
        fillField(yearWhenThisOrderMade, "2025");
        clickWhenScrollByElement(purchaseButton);
    }
















































}

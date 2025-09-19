package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class FinishPage extends BasePage{

    public By okButton = By.xpath("//*[text()=\"OK\"]");
    public By checkFinish = By.xpath("//*[text()=\"Thank you for your purchase!\"]");



    public FinishPage(WebDriver driver, Duration timeout){
        super(driver, timeout);
    }

    public void clickToFinish(){
        click(okButton);
    }



































}

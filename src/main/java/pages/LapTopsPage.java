package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LapTopsPage extends BasePage {

    public By macBookAir = By.xpath("//*[text()=\"MacBook air\"]");


    public LapTopsPage(WebDriver driver, Duration timeout){
        super(driver, timeout);
    }

    public void lapTopBuyFlowLapTopsPage(){
        clickWhenScrollByElement(macBookAir);
    }







































}

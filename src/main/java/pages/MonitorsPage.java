package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class MonitorsPage extends BasePage{

    public By appleMonitor24 = By.xpath("//*[text()=\"Apple monitor 24\"]");

    public MonitorsPage(WebDriver driver, Duration timeout){
        super(driver, timeout);
    }


    public  void monitorBuyFlowMonitorsPage (){
        clickWhenScrollByElement(appleMonitor24);
    }



































}

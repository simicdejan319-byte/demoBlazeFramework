package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.*;

import java.time.Duration;

public class BuyFlowTests extends BaseTests{

    HomePage homePage = new HomePage(driver, Duration.ofSeconds(10));
    LapTopsPage lapTopsPage = new LapTopsPage(driver,Duration.ofSeconds(10));
    AddToCardMacBookAirPage addToCardMacBookAirPage = new AddToCardMacBookAirPage(driver,Duration.ofSeconds(10));
    ProductPage productPage = new ProductPage(driver,Duration.ofSeconds(10));
    CostumersInformation costumersInformation = new CostumersInformation(driver,Duration.ofSeconds(10));
    FinishPage finishPage = new FinishPage(driver,Duration.ofSeconds(10));
    AddToCardAppleMonitor24 addToCardAppleMonitor24 = new AddToCardAppleMonitor24(driver,Duration.ofSeconds(10));
    MonitorsPage monitorsPage = new MonitorsPage(driver,Duration.ofSeconds(10));

    @Test
    public void ajdeDajBoze() throws InterruptedException {
        homePage.lapTopBuyFlowHomePage();
        lapTopsPage.lapTopBuyFlowLapTopsPage();
        addToCardMacBookAirPage.lapTopBuyFlowAddToCard();
        productPage.clickButtonPlaceOrder();
        costumersInformation.addCustomersInformation();
        finishPage.clickToFinish();
        Assert.assertTrue(homePage.checkFinishBuyFlow());

    }

    @Test
    public void ajdeDajBoze2() {
        homePage.monitorBuyFlowButtonCategories();
        monitorsPage.monitorBuyFlowMonitorsPage();
        addToCardAppleMonitor24.monitorBuyFlowAddToCard();
        productPage.clickButtonPlaceOrder();
        costumersInformation.addCustomersInformation();
        finishPage.clickToFinish();
        Assert.assertTrue(homePage.checkFinishBuyFlow());
    }
}

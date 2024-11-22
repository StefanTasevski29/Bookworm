package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class OrderReceivedPage {
        private final By orderReceivedMsg = By.cssSelector("h6.woocommerce-thankyou-order-received");

        public String getOrderReceivedMsg() {
            return SeleniumHelpers.waitAndFindElement(orderReceivedMsg).getText();
        }
}

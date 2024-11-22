package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class YourCartPage {
    private final By proceedToCheckOutBtn = By.linkText("Proceed to checkout");



    public void clickOnProceedToCheckOutBtn() {
        SeleniumHelpers.waitAndFindElement(proceedToCheckOutBtn).click();
    }
}

package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class CheckoutPage {

    private final By firstNameField = By.id("billing_first_name");
    private final By lastNameField = By.id("billing_last_name");
    private final By billingAddressField = By.id("billing_address_1");
    private final By cityField = By.id("billing_city");
    private final By zipCodeField = By.id("billing_postcode");
    private final By phoneField = By.id("billing_phone");
    private final By emailField = By.id("billing_email");
    private final By placeOrderBtn = By.id("place_order");

    public void checkoutInfo(String firstName,String lastName,String billingAddress,String city,String zipCode,String phone,String email) throws InterruptedException {
        SeleniumHelpers.waitAndFindElement(firstNameField).sendKeys(firstName);
        SeleniumHelpers.waitAndFindElement(lastNameField).sendKeys(lastName);
        SeleniumHelpers.waitAndFindElement(billingAddressField).sendKeys(billingAddress);
        SeleniumHelpers.waitAndFindElement(cityField).sendKeys(city);
        SeleniumHelpers.waitAndFindElement(zipCodeField).sendKeys(zipCode);
        SeleniumHelpers.waitAndFindElement(phoneField).sendKeys(phone);
        SeleniumHelpers.waitAndFindElement(emailField).sendKeys(email);
        Thread.sleep(1000); // Bez Thread.sleep ednas mi e passed , tri pati failed , zatoa go dodadov
        SeleniumHelpers.waitAndFindElement(placeOrderBtn).click();
    }
}

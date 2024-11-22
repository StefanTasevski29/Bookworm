package bookwormTest;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyOrderIsSuccessfullyPlacedTest extends BaseTest {

    @Test
    public void verifySuccessOrder() throws InterruptedException {


        String firstName = "Stefan";
        String lastName = "Tasevski";
        String billingAddress = "Hollywood Boulevard";
        String city = "Los Angeles";
        String zipCode = "90001";
        String phone = "+19512390523";
        String email = "brainster1@gmail.com";


        homePage.clickOnCategoriesBtn();
        categoriesPage.clickOnTheBookCover();
        bookInfoPage.clickOnTheAddToCartBtn();
        bookInfoPage.clickOnTheViewCartBtn();
        yourCartPage.clickOnProceedToCheckOutBtn();
        checkoutPage.checkoutInfo(firstName, lastName, billingAddress, city, zipCode, phone, email);


        String expectedMsg = "Thank you. Your order has been received.";
        String actualMsg = orderReceivedPage.getOrderReceivedMsg();
        Assert.assertEquals(actualMsg, expectedMsg);

    }
}


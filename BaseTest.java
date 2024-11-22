package bookwormTest;

import helpers.SeleniumHelpers;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import pages.*;

import java.time.Duration;

public class BaseTest {


        HomePage homePage = new HomePage();
        CategoriesPage categoriesPage = new CategoriesPage();
        WishlistPage wishlistPage = new WishlistPage();
        BookInfoPage bookInfoPage = new BookInfoPage();
        YourCartPage yourCartPage = new YourCartPage();
        CheckoutPage checkoutPage = new CheckoutPage();
        OrderReceivedPage orderReceivedPage = new OrderReceivedPage();




    @BeforeClass
    public static void setUp() {

        SeleniumHelpers.initalizeWebDriver();
        SeleniumHelpers.getDriver().manage().window().maximize();
        SeleniumHelpers.getDriver().navigate().to("https://bookworm.madrasthemes.com/");
        SeleniumHelpers.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }


    @BeforeTest
    public void initPages() {
        homePage = new HomePage();
        categoriesPage = new CategoriesPage();
        wishlistPage = new WishlistPage();
        bookInfoPage = new BookInfoPage();
        yourCartPage = new YourCartPage();
        checkoutPage = new CheckoutPage();
        orderReceivedPage = new OrderReceivedPage();
    }



    @AfterClass
    public void tearDown() {
        SeleniumHelpers.getDriver().quit();
    }
}

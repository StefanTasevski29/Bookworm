package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class BookInfoPage {


    private final By wishlistBtn = By.linkText("Add to wishlist");
    private final By browseWishlistBtn = By.linkText("Browse wishlist");
    private final By addToCartBtn = By.cssSelector("button[type='submit'].single_add_to_cart_button");
    private final By viewCartBtn = By.linkText("View cart");


    public void clickOnTheWishlistBtn() {
        SeleniumHelpers.waitAndFindElement(wishlistBtn).click();
    }

    public void clickOnTheWishlistBtnHeader() {
        SeleniumHelpers.waitAndFindElement(browseWishlistBtn).click();
    }

    public void clickOnTheAddToCartBtn() {
        SeleniumHelpers.waitAndFindElement(addToCartBtn).click();
    }
    public void clickOnTheViewCartBtn() {
        SeleniumHelpers.waitAndFindElement(viewCartBtn).click();
    }
}

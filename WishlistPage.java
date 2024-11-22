package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class WishlistPage {

    private final By editTitleBtn = By.linkText("Edit title");
    private final By wishlistNameField = By.name("wishlist_name");
    private final By saveTitleBtn = By.cssSelector("a.save-title-form");
    private final By updatedTitle = By.cssSelector("div.wishlist-title h2");



    public void clickOnTheEditTitleBtn() {
        SeleniumHelpers.waitAndFindElement(editTitleBtn).click();
    }

    public void clearWishlistNameField() {
        SeleniumHelpers.waitAndFindElement(wishlistNameField).clear();
    }

    public void writeNewWishlistName() {
        SeleniumHelpers.waitAndFindElement(wishlistNameField).sendKeys("IWantThisBook");
    }

    public void clickOnTheSaveTitleBtn() {
        SeleniumHelpers.waitAndFindElement(saveTitleBtn).click();
    }

    public String getUpdatedTitle() {
        return SeleniumHelpers.waitAndFindElement(updatedTitle).getText();
    }




}

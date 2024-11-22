package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class CategoriesPage {

    private final By bookInfo = By.linkText("Blindside (Michael Bennett Book 12)");
//    private final By bookInfo = By.xpath("//*[@id=\"main\"]/div[3]/ul/li[2]/div[1]");
    private final By wishlistPageBtn = By.linkText("https://bookworm.madrasthemes.com/wishlist/");


    public void clickOnTheBookCover() {
        SeleniumHelpers.waitAndFindElement(bookInfo).click();
    }

    public void clickOnTheWishlistPageBtn() {
        SeleniumHelpers.waitAndFindElement(wishlistPageBtn).click();
    }


}


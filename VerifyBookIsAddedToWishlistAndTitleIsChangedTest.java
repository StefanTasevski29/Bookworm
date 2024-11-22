package bookwormTest;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyBookIsAddedToWishlistAndTitleIsChangedTest extends BaseTest {



    @Test
    public void verifyBookInWishlist() {
        homePage.clickOnCategoriesBtn();
        categoriesPage.clickOnTheBookCover();
        bookInfoPage.clickOnTheWishlistBtn();
        bookInfoPage.clickOnTheWishlistBtnHeader();
        wishlistPage.clickOnTheEditTitleBtn();
        wishlistPage.clearWishlistNameField();
        wishlistPage.writeNewWishlistName();
        wishlistPage.clickOnTheSaveTitleBtn();


        boolean pageSavedInWishlist = SeleniumHelpers.waitAndFindElement(By.id("yith-wcwl-row-30")).isDisplayed();
        Assert.assertTrue(pageSavedInWishlist);

        String newTitle = "IWantThisBook";
        Assert.assertEquals(wishlistPage.getUpdatedTitle(), newTitle);
    }



}

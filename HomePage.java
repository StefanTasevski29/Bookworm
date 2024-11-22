package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class HomePage {

    private final By categoriesBtn = By.id("menu-item-170");



    public void clickOnCategoriesBtn() {
        SeleniumHelpers.waitAndFindElement(categoriesBtn).click();
    }

}

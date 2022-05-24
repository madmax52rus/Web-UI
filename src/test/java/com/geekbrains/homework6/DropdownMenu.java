package com.geekbrains.homework6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DropdownMenu extends BasePage{
    public DropdownMenu(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//summary[@aria-label='View profile and more']")
    public WebElement moreButton;

    @FindBy(xpath = "//a[text()='Your profile']")
    public WebElement yourProfileInDropdownMenuButton;

    public void clickYourProfileButtonInDropdownSuggest() {
        moreButton.click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(yourProfileInDropdownMenuButton));
        yourProfileInDropdownMenuButton.click();

    }
}

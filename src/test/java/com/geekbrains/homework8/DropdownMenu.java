package com.geekbrains.homework8;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.eo.Se;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class DropdownMenu {
    private SelenideElement moreButton = $(By.xpath("//summary[@aria-label='View profile and more']"));
    private SelenideElement yourProfileInDropdownMenuButton = $(By.xpath("//a[text()='Your profile']"));

    private SelenideElement editProfileButton = $(By.xpath("//button[text()='Edit profile']"));
   @Step("Открываем выпадающее меню")
    public void myProfileEditButtonIsDisplayed() {
        moreButton.click();
        yourProfileInDropdownMenuButton.click();
        editProfileButton.shouldBe(visible);
    }
}

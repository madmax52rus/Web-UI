package com.geekbrains.homework8;

import com.codeborne.selenide.SelenideElement;
import com.geekbrains.lesson8.MyAccountPage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {
   private SelenideElement loginField = $(By.id("login_field"));
   private SelenideElement passwordField = $(By.id("password"));
   private SelenideElement submitLoginButton = $(By.xpath("//input[@type='submit']"));

    @Step("Вводим пару логин/пароль")
    public MyAccountPage login(String email, String password) {
        loginField.sendKeys(email);
        passwordField.sendKeys(password);
        submitLoginButton.click();
        return page(MyAccountPage.class);
    }
}

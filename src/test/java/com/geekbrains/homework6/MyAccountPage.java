package com.geekbrains.homework6;

import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage {
    public MyAccountPage(WebDriver driver) {
        super(driver);
        dropdownMenu = new DropdownMenu(driver);
    }

    public DropdownMenu dropdownMenu;
}

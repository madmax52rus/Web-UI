package com.geekbrains.homework6;

import com.geekbrains.homework6.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationGitHubTest {
    WebDriver driver;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new ChromeDriver();
    }

    @Test
    void addToCartTest() throws InterruptedException {
        driver.get("https://github.com/login");

        new LoginPage(driver).login("madtux@yandex.ru", "Testpar0l");
        new MyAccountPage(driver).dropdownMenu.clickYourProfileButtonInDropdownSuggest();
        Assertions.assertTrue(driver.getCurrentUrl().contains("madtux52rus"));
        Thread.sleep(2000);


    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}

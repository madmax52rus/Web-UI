package com.geekbrains.homework5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class GitHubTest {
    WebDriver driver;
    WebDriverWait webDriverWait;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://github.com/");
        driver.manage().window().maximize();
    }

    @Test
    void loginFieldTest() {
        driver.findElement(By.xpath("//a[@href='/login']")).click();
        Assertions.assertTrue(driver.findElement(By.id("login_field")).isDisplayed());
    }

    @Test
    void profileTest() {
Actions action = new Actions(driver);
        driver.findElement(By.xpath("//a[@href='/login']")).click();
        driver.findElement(By.id("login_field")).sendKeys("madtux52rus");
        driver.findElement(By.id("password")).sendKeys("Testpar0l");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.xpath("//summary[@aria-label='View profile and more']")).click();
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Your profile']")));
        driver.findElement(By.xpath("//a[text()='Your profile']")).click();
        Assertions.assertTrue(driver.getCurrentUrl().contains("madtux52rus"));

    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}

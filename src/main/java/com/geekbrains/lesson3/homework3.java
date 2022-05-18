package com.geekbrains.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class Homework3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.switchTo().newWindow(WindowType.TAB);
        driver.manage().window().maximize();

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://github.com/");

        driver.findElement(By.xpath("//a[@href='/login']")).click();
        driver.findElement(By.id("login_field")).sendKeys("madtux52rus");
        driver.findElement(By.id("password")).sendKeys("Testpar0l");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        Thread.sleep(5000);
        driver.close();
        driver.switchTo().window(tabs.get(0));
        Thread.sleep(2000);
        driver.get("https://github.com/");
        Cookie cookie = new Cookie("user_session", "07OOIpvvMHTZ4EYv8TTwKl5bwYgf6mFVJkjyWXkMvnW91cke");
        driver.manage().addCookie(cookie);
        driver.navigate().refresh();
        Thread.sleep(5000);

        driver.quit();
    }
}

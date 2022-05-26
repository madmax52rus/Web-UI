package com.geekbrains.homework7;

import com.geekbrains.homework6.AutomationGitHubTest;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;

public class CustomLogger {
    private static Logger logger = LoggerFactory.getLogger(com.geekbrains.lesson7.CustomLogger.class);


    public void beforeQuit(WebDriver driver) {
        Allure.addAttachment("Скриншот страницы профиля",
                new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
    }
}

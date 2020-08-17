package com.dojo.evercraft.cucumber;

import io.cucumber.spring.ScenarioScope;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Component;

@Component
@ScenarioScope
public class Browser {
    WebDriver webDriver;

    public Browser() {
        webDriver = new ChromeDriver();
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void closeBrowser() {
        webDriver.quit();
    }
}

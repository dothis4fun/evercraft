package com.dojo.evercraft.cucumber;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

public class Hooks {

    @Autowired
    private BossServer bossServer;

    @Autowired
    private Browser browser;

    private Hooks() {

    }

    @BeforeStep
    public void beforeEachStep() {

    }

    @AfterStep
    public void afterEachStep() {

    }

    @Before
    public void beforeEachScenario() {
        WebDriver driver = browser.getWebDriver();
//        driver.get("http://localhost:8089/");
//        bossServer.start();
//        bossServer.stubDarthPlagueis();
    }

    @After
    public void afterEachScenario() {
//        bossServer.stop();
        browser.closeBrowser();
    }

}

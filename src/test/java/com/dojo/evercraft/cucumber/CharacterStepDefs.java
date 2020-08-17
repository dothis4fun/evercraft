package com.dojo.evercraft.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class CharacterStepDefs {
    @Autowired
    BossServer bossServer;

    @Autowired
    Browser browser;

    @Given("a new game is started")
    public void aNewGameIsStarted() {
        bossServer.stubDarthSidious();
    }

    @When("I create a character")
    public void iCreateACharacter() {
        WebDriver driver = browser.getWebDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("https://google.com/ncr");
        driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);
        WebElement firstResult = wait.until(presenceOfElementLocated(By.cssSelector("h3>div")));
    }

    @Then("my character shows up in the game")
    public void myCharacterShowsUpInTheGame() {
    }
}

package com.dojo.evercraft.cucumber;

import io.cucumber.java.en.And;
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

import static org.junit.Assert.assertEquals;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class CharacterStepDefs {

    @Autowired
    Browser browser;

    @Given("a new game is started")
    public void aNewGameIsStarted() {
        WebDriver driver = browser.getWebDriver();
        driver.get("http://localhost:8080/welcome");
        final String actual = driver.findElement(By.id("welcomeMessage")).getText();
        assertEquals("Welcome to the World of EverCraft", actual);
    }

    @When("I create a character named {string}")
    public void iCreateACharacter(String name) {
    }

    @And("has alignment {string}")
    public void hasAlignment(String alignment) {
    }

    @And("Armour Class is {int}")
    public void armourClassIs(int arg0) {
    }

    @And("Strength is {int}")
    public void strengthIs(int arg0) {
    }

    @And("Dexterity is {int}")
    public void dexterityIs(int arg0) {
    }

    @And("Constitution is {int}")
    public void constitutionIs(int arg0) {
    }

    @And("Wisdom is {int}")
    public void wisdomIs(int arg0) {
    }

    @And("Intelligence is {int}")
    public void intelligenceIs(int arg0) {
    }

    @And("Charisma is {int}")
    public void charismaIs(int arg0) {
    }

    @Then("my character shows up in the game")
    public void myCharacterShowsUpInTheGame() {
    }
}

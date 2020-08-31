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

    @Given("a new game is started")
    public void aNewGameIsStarted() {

    }

    @When("I create a character")
    public void iCreateACharacter() {
    }

    @Then("my character shows up in the game")
    public void myCharacterShowsUpInTheGame() {
    }
}

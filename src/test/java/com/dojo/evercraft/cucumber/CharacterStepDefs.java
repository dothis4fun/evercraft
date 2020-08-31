package com.dojo.evercraft.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

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

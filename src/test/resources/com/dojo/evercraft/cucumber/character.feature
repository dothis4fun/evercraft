Feature: Character stuff

  Scenario: Create a character
    Given a new game is started
    When I create a character named 'Steve'
    And has alignment 'Evil'
    And Armour Class is 12
    And Strength is 10
    And Dexterity is 10
    And Constitution is 10
    And Wisdom is 10
    And Intelligence is 10
    And Charisma is 10
    Then my character shows up in the game
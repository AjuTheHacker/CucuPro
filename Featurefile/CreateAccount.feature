Feature: To validate the Create Account of Wotif



@somke
  Scenario: validate the valid email and firstName and sureName and password
    Given User should be lunch chrome browser and load url
    When User should enter details
      | Email               | FiratName | LastName | Password   |
      | nonia3516@gamil.com | Anmol     | kumar    | Anmol@1234 |
      | Anmol@gamil.com     | Sanu      | Kumar    | kuamr@1234 |
      | Anmol123@gamil.com  | Sanu      | Kumar    | AjayKumar@1234 |
    And User should click on continue button
    Then User should can successfully create account
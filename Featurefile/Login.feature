Feature: TO validate  login Functionlity of Wotif

  Background: 
    Given User should be  lunch the Chrome browser and User load the url
   # When User should click on login link
@Sanity
  Scenario: To Validate login with Invalid Username and  Invalid Password
    And  User should enter the Username and password
    And User can see sign in button is not visible
    Then User should get text message under the Email address box
@somke
  Scenario Outline: To Validate login with Invalid Username and  Invalid Password
    And User should enter the "<Username>" and "<Password>"
    And User can see sign in button is not visible
    Then User should get text message under the Email address box

    Examples: 
      | Username     | Password  |
      |       152452 | @@@@@$$   |
      | @@@@@@       | 152335789 |
      | Abcgmail.com | Ajaynonia |

  Scenario: To Validate login with Invalid Username and  valid Password
    And User should enter the Username and password
    And User can see sign in button is not visible
    Then User should get text message under the Email address box

  Scenario Outline: To Validate login with Invalid Username and  valid Password
    And User should enter the "<Username>" and "<Password>"
    And User can see sign in button is not visible
    Then User should get text message under the Email address box

    Examples: 
      | Username        | Password     |              
      | ert 123 @ty.yh  | Ajaynonia@96 |              
      | @drft@gmail.com | Ajaynonia@96 |              
      | 123.234@co      | Ajaynonia@96 |              
      | a@you.i         | Ajay         |
      | a@you.i         | Ajay         | 
      | @yahoo.in       | Ajaynonia@96 |            

  Scenario: To Validate login with valid Username and  invalid Password
    And User should enter the Username and password
    And User should click on login button
    Then User should get text error message

  Scenario Outline: To Validate login with valid Username and  Invalid Password
    And User should enter the "<Username>" and "<Password>"
    And User should click on login button
    Then User should get text error message

    Examples: 
      | Username              | Password    |
      | ajaynonia666gamil.com |     1234555 |
      | ajaynonia666gamil.com | abcdef      |
      | ajaynonia666gamil.com | @@@@@@      |
      | ajaynonia666gamil.com | 1123ACND    |
      | ajaynonia666gamil.com | ASDSD@      |
      | ajaynonia666gamil.com | assjdj11299 |
      | ajaynonia666gamil.com | Asd1        |
      | ajaynonia666gamil.com | ASDJDK      |

  Scenario: To Validate login with valid Username and  valid Password
    And User should enter the Username and password
    And User should click on login button
    Then User Should navigate to homepage


  Scenario Outline: To Validate login with valid Username and  valid Password
    And User should enter the "<Username>" and "<Password>"
    And User should click on login button
    Then User Should navigate to homepage

    Examples: 
      | Username              | Password     |
      | ajaynonia666@gmai.com | Ajaynonia@96 |

  Scenario: To Validate login with empty Username and  valid Password
    And User should enter the Username and password
    And User can see sign in button is not visible
    Then User should get text message under the Email address box

  Scenario Outline: To Validate login with empty Username and  valid Password
    And User should enter the "<Username>" and "<Password>"
    And User can see sign in button is not visible
    Then User should get text message under the Email address box

    Examples: 
      | Username | Password     |
      |          | Ajaynonia@96 |

  Scenario: To Validate login with valid Username and  empty Password
    And User should enter the Username and password
    And User should click on login button
    Then User should see sign in button is not visiable

  Scenario Outline: To Validate login with valid Username and  empty Password
    And User should enter the "<Username>" and "<Password>"
    And User can see sign in button is not visible
    Then User should get text message under the Password box

    Examples: 
      | Username               | Password |
      | ajaynonia666@gmail.com |          |

  Scenario: To Validate login with empty Username and  empty Password
    And User should enter the Username and password
    And User should click on login button
    Then User should see sign in button is not visiable

  Scenario Outline: To Validate login with empty Username and  empty Password
    And User should enter the "<Username>" and "<Password>"
    And User can see sign in button is not visible
    Then User should get text message under the Email address box and Password box

    Examples: 
      | Username | Password |
      |          |          |
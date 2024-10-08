Feature: Login Page
  ##for step definition is on src/test/java/step_definitions/LoginPageSteps.java
  ##for method of step definition is on src/main/java/test/page_object/LoginPage.java
  ##for properties of method is on src/test/resources/elements/LoginPage.properties

  @Android @Login @Positive
    Scenario Outline: [Android] User succesfully login
    Given User in apps Alfagift
    When User click masuk in login page
    And User is on login page
    And User input number phone as "<phone_number>" in login page
    And User input password as "<password>" in login page
    And User click next in login page
    Then User see homepage
    Examples:
      | phone_number | password |
      | 087781657095 | Radja.18 |

  @Android @Login @Negative
  Scenario Outline: [Android] User input with not registered number
    Given User in apps Alfagift
    When User click masuk in login page
    And User is on login page
    And User input number phone as "<phone_number>" in login page
    And User input password as "<password>" in login page
    And User click next in login page
    Then User see error not registered number warning
    Examples:
      | phone_number | password |
      | 087781657095 | Radja.18 |

  @Android @Login @Negative
  Scenario Outline: [Android] User input with wrong password
    Given User in apps Alfagift
    When User click masuk in login page
    And User is on login page
    And User input number phone as "<phone_number>" in login page
    And User input password as "<password>" in login page
    And User click next in login page
    Then User see error wrong password warning
    Examples:
      | phone_number | password |
      | 087781657095 | Aaaaaa.1 |

  @Android @Login @Negative
  Scenario Outline: [Android] User input with another device
    Given User in apps Alfagift
    When User click masuk in login page
    And User is on login page
    And User input number phone as "<phone_number>" in login page
    And User input password as "<password>" in login page
    And User click next in login page
    Then User see error login failed another device
    Examples:
      | phone_number | password |
      | 087781657095 | Radja.18 |

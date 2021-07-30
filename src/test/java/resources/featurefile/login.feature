Feature:  Login Functionality with Invalid Credentials

  As a User I should see error message when I try to login on virgin games website with invalid credentials

  @Smoke
  Scenario: User should navigate to login page successfully

    Given I am on homepage
    When  I click on log in link
    Then  I should navigate to login page successfully

#
  @Regression
  Scenario Outline: Verify the error message with invalid credentials
    Given I am on homepage
    When  I click on log in link
    And   I enter email "<email>"
    And  I enter password "<password>"
    And  I click on login button
    Then I should see the error message "<errorMessage>"

    Examples:
      | email          | password | errorMessage                                                                               |
      | abc@test.com   | 123      | Please try again, your username/email or password has not been recognised |
      | xyz@gmail.com  | avc      | Please try again, your username/email or password has not been recognised |
      | test@gmail.com | 12345    | Please try again, your username/email or password has not been recognised |
      | test@gmail.com | 123@$5   | Please try again, your username/email or password has not been recognised |

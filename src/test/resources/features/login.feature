Feature: Login Test

  Scenario: login as standart_user
    Given The user is on the login page
    When The user enters "standard_user" and "secret_sauce" credentials
    Then The user should be able to login and see "PRODUCTS" page
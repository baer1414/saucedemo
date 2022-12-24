Feature: checkout

  Background:
    Given The user is on the login page
    When The user enters "standard_user" and "secret_sauce" credentials
@wip
  Scenario: Sauce Purchase
    When The user should be able to sort the product "Price (high to low)"
    And en pahalı sepete at
    And ec ucuz ürünü sepete at
    And sepete tıkla
    And "YOUR CART" görünüyormu
    And checkout tıkla
    And checout sayfasında first name "Bahar", last name "Eren" and postal code "12345" yaz
    Then alışverisi tamamla
    Then "CHECKOUT: COMPLETE!" doğrula

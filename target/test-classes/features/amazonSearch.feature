Feature: Amazon Search

  Scenario: TC01 kullanici amazonda Nutella aratir

    Given kullanici amazon sayfasinda
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir

    Scenario: TC02 kullanici amazonda Java aratir
      Given kullanici amazon sayfasinda
      Then kullanici Java icin arama yapar
      And sonuclarin Java icerdigini test eder
      And sayfayi kapatir

@tumu
Feature: US1001 Kullanici Amazon Sayfasinda Arama Yapar

  @Nutella @ikisi
  Scenario: TC01 kullanici amazonda Nutella aratir
    Given kullanici amazon sayfasinda
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir


    @java  @ikisi
    Scenario: TC02 kullanici amazonda Java aratir
      Given kullanici amazon sayfasinda
      Then kullanici Java icin arama yapar
      And sonuclarin Java icerdigini test eder
      And sayfayi kapatir

      @laptop
    Scenario: TC03 kullanici amazonda Laptop aratir
      Given kullanici amazon sayfasinda
      Then kullanici Laptop icin arama yapar
      And sonuclarin Laptop icerdigini test eder
      And sayfayi kapatir

Feature: US1003 kullanici parametre kullanarak arama yapabilmeli

  Scenario: TC06 kullanici parametre ile amazonda arama yapabilmeli
    Given kullanici amazon sayfasinda
    And kullanici "Nutella" icin arama yapar
    And sonuclarin "Nutella" icerdigini test eder
    Then sayfayi kapatir

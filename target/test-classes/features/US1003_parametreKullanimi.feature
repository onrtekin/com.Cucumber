Feature: US1003 kullanici parametre kullanarak arama yapabilmeli
  @parametre
  Scenario: TC06 kullanici parametre ile amazonda arama yapabilmeli
    Given kullanici amazon sayfasinda
    And kullanici "Nutella" icin arama yapar
    And sonuclarin "Kutella" icerdigini test eder
    Then sayfayi kapatir

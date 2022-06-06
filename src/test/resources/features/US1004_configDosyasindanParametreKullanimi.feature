Feature: US1004 Kullanici parametre ile cnfiguration file i kullanabilmeli

  Scenario: TC07 configuration properties dosyasindan parametre kullanimi
    Given kullanici "brcUrl" sayfasinda
    Then kullanici 5 sn bekler
    And url'in "blue" icerdigini test eder
    Then sayfayi kapatir

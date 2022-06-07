#amazon sayfasina gidip sirasiyla nutella,java ,elma,armut aratipher#sonuclarin
# arama yaptigimiz kelimeleri icerdigini test edelim
  Feature: US1007 kullanici amazonda istedigi kelimeleri aratir
    Scenario Outline:  TC12 amazonda listedeki elemanlari aratma
      Given kullanici "amazonUrl" sayfasinda
      Then kullanici "<istenenKelime>" icin arama yapar
      And sonuclarin "<istenenKelime>" icerdigini test eder
      And sayfayi kapatir

      Examples:
      |istenenKelime|
      |nutella      |
      |java         |
      |elma         |
      |armut        |

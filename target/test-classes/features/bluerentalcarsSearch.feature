Feature: Bluerentalcars Search

  Scenario: TC01 kullanici dogru email ve password ile login olur

    Given kullanici Bluerentalcars sayfasinda
    Then kullanici ilk login butonuna basar
    And kullanici email adresini girer
    And kullanici sifresini girer
    And kullanici ikinci login butonuna basar
    And login oldugunu test eder
    And kullanici sayfayi kapatir

  Scenario: TC02 kullanici dogru email ve yanlis password ile login olamaz

    Given kullanici Bluerentalcars sayfasinda
    Then kullanici ilk login butonuna basar
    And kullanici email adresini girer
    And kullanici wrong password girer
    And kullanici ikinci login butonuna basar
    And login olamadigini test eder
    And kullanici sayfayi kapatir


  Scenario: TC03 kullanici wrong email ve valid password ile login olamaz

    Given kullanici Bluerentalcars sayfasinda
    Then kullanici ilk login butonuna basar
    And kullanici wrong email adresi girer
    And kullanici sifresini girer
    And kullanici ikinci login butonuna basar
    And login olamadigini test eder
    And kullanici sayfayi kapatir

    Scenario: TC04 kullanici wrong email ve password ile login olamaz

      Given kullanici Bluerentalcars sayfasinda
      Then kullanici ilk login butonuna basar
      And kullanici wrong email adresi girer
      And kullanici wrong password girer
      And kullanici ikinci login butonuna basar
      And login olamadigini test eder
      And kullanici sayfayi kapatir










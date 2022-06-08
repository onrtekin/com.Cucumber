Feature: US1011 web tablosundaki istenen sutunu yazdirma

  Scenario:TC16 kullanici sutun basligi ile liste alabilmeli



    Given kullanici "guruUrl" sayfasinda
    And "Company", sutunundaki tum degerleri yazdirir
    Then sayfayi kapatir

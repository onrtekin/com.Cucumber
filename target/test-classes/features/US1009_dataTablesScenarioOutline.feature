Feature: US1009 datatables sitesine 5 farkli giris yapalim


  Scenario Outline: TC14 4 farkli kayit girisi yapilabilmeli
    When kullanici "datatablesUrl" sayfasinda
    Then new butonuna basar
    And isim bolumune "<firstname>" yazar
    And soyisim bolumune "<lastName>" yazar
    And position bolumune "<position>" yazar
    And ofis bolumune "<office>" yazar
    And extension bolumune "<extension>" yazar
    And startDate bolumune "<startDate>" yazar
    And salary bolumune "<salary>" yazar
    And Create tusuna basar
    When kullanici "<firstname>" ile arama yapar
    Then isim bolumunde "<firstname>" oldugunu test eder
    And sayfayi kapatir
    Examples:
      | firstname | lastName | position | office     | extension | startDate  | salary |
      | Alim      | Alim     | qa       | ankara     | UI        | 2021-09-10 | 10000  |
      | Berk      | Ay       | dev      | istanbul   | selenium  | 2022-04-12  | 12000  |
      | Can       | Gul      | tester   | safranbolu | api       | 2021-05-04   | 9000   |
      | Ayse      | Can      | BA       | bolu       | Pat       | 2019-07-08 | 20000  |

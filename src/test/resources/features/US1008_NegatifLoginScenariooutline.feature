Feature: US1008 kullanici farkli yanlis sifre ve kullanici adlariyla giris yapamaz


  Scenario Outline: TC13 yanlis kullanici adi ve sifrelerle giris yapilamaz


    Given kullanici "HMCUrl" sayfasinda
    Then Log in yazisina tiklar
    And gecersiz username olarak "<username>" girer
    And gecersiz password olarak "<password>" girer
    And Login butonuna basar
    And sayfaya giris yapilamadigini test eder
    And sayfayi kapatir

    Examples:
    |username|password|
    |Manager5|Manager5!|
    |Manager6|Manager6!|
    |Manager7|Manager7!|
    |Manager8|Manager8!|
    |Manager9|Manager9!|


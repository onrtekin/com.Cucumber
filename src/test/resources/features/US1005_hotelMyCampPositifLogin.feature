Feature:US1005 dogru kullanici adi ve sifre ile giris yapilabilmeli

  Scenario: TC08 positive login test

    Given kullanici "HMCUrl" sayfasinda
    Then Log in yazisina tiklar
    And gecerli username girer
    And gecerli password girer
    And Login butonuna basar
    And sayfaya giris yaptigini kontrol eder
    And sayfayi kapatir



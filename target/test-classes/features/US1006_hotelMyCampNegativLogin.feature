# hotel my camp sitesinde 3 adet negatif test senaryosu olusturalim
  #1- dogru username  yanlis password
  #2-yanlis  username  dogru password
  #3-yanlis username  yanlis password
  Feature: US1006 yanlis bilgilerle siteye giris yapilamaz


    Scenario: TC09 yanlis password ile giris yapilamaz
      Given kullanici "HMCUrl" sayfasinda
      Then Log in yazisina tiklar
      And gecerli username girer
      And gecersiz password girer
      And Login butonuna basar
      And sayfaya giris yapilamadigini test eder
      And sayfayi kapatir

      Scenario:  TC10 yanlis kullanici adi ile giris yapilamaz
        Given kullanici "HMCUrl" sayfasinda
        Then Log in yazisina tiklar
        And gecersiz  username girer
        And gecerli password girer
        And Login butonuna basar
        And sayfaya giris yapilamadigini test eder
        And sayfayi kapatir

        Scenario: TC11 yanlis kullanici adi yanlis sifre ile giris yapilamaz

          Given kullanici "HMCUrl" sayfasinda
          Then Log in yazisina tiklar
          And gecersiz  username girer
          And gecersiz password girer
          And Login butonuna basar
          And sayfaya giris yapilamadigini test eder
          And sayfayi kapatir
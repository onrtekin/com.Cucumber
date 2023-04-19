Feature: US1010 herokuapp delete testi


  Scenario: TC15 herokuapp 'da delete butonu calismali
    Given kullanici "herokuappUrl" sayfasinda
    And add element butonuna basar
    Then delete butonu gorunur oluncaya kadar bekler
    And delete butonunun gorunur oldugunu test eder
    Then delete butonuna basar
    And delete butonunun gorunmedigini test eder



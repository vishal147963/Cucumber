
Feature: Test Cogmento CRM App

  Scenario Outline: validate login functionlity
    Given user is on free crm login page
    When user enter valid "<username>" and valid "<password>"
    Then user is on home page
    And user click on contact link and createbutton
    And user enter "<fname>" and "<lname>" and "<mname>"
    And click on save button

    @SITEnv
    Examples: 
      | username                      | password     |
      | chandurkarpushpak03@gmail.com | Pcogmento    |
      | 28atul28@gmail.com            | Ganbawle@123 |
      | shrikantkhemkar@gmail.com     | shrikant11@S |
      | ddnandanwar2312@gmail.com     | Disha@123    |

    @UATEnv
    Scenarios: 
      | username                       | password   | fname | lname | mname |
      | chetaningale12@gmail.com       | Mento@0808 | abc1  | xyz1  | pqr1  |
      | shrikrishnahonrao804@gmail.com | Patil@1234 | abc2  | xyz2  | pqr2  |
      
      

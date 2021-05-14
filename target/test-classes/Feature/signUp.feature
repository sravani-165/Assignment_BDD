
@featuretag
Feature: Signup functioanlity

 
  @tag
  Scenario Outline: Login to Upskill appliaction 
    Given User gives application link 
    Then Click on Registration
    When User enter First name "<Firstname>" User enter Last name "<Lastname>"
    Then User enter email "<email>" user enter the username "<Username>" user enter the password "<pass>" 
    And  User enter Confirm password "<pass>" user enter the Phone "<Phone>" user enter the Code "<Code>" 
    And  User Click Register. 
    Then verify the username"<userregistered>"
    And User Click on home icon 
    Then user enter the required fields "<Username>","<pass>"
    And click on submit button
    Then user verify that Register is completed sucessfull "<registered>"
    And user logout the successfull

    Examples: 
      | name  | Firstname | Lastname| email                |Username |pass   |Confirm |Phone      |Code    |userregistered               |registered         |
      | name1 | Sravani    | Jagar  | srajagar@gmail.com	 |Sravani  |sra@165|sra@1651|9238293389 |05360k  |This login is already in use |Sravani05360k Jagar| 
     

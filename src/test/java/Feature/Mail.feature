@featuretag
Feature: Sending Mail functioanlity

 
  @tag
  Scenario Outline: Login to Upskill appliaction 
    Given User gives application link 
    Then user enter the required fields "<Username>","<pass>"
    And click on submit button
    Then  user click inbox
    And  user click on Compose message 
    Then enter the required field "<Subject>","<Message>"
    And attach the img and click on send button
    And user logout the successfull
    
     
      Examples: 
      |Username |pass   |Subject|Message                        |
      |Sravani  |sra@165|Test   |Please find the assignment work|
                             
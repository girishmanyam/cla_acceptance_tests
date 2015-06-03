@staging
Feature: Domestic violence scope assessment


Scenario Outline: Domestic Violence - Domestic Violence 

          Given I am on the public problem page
          When I select domestic violence
          Then I am redirected to the debt what do you need help with page
          And I click domestic violence
          And I click <boolean> I or my child is in immediate danger
          Then I verify I am on the <page> 
          Examples:
          |boolean                                        |page                                            |
          |yes                                            |contact civil legal advice page                 |
          |no                                             |about me page                                   |            
         
         
@sprint
Scenario: Domestic Violence - Contesting an injunction

          Given I am on the public problem page
          When I select domestic violence
          Then I am redirected to the debt what do you need help with page
          When I click contesting an injunction
          Then I verify I am on the about me page       
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


Scenario Outline: Domestic Violence - Enforcing an injuction

          Given I am on the public problem page
          When I select domestic violence
          Then I am redirected to the debt what do you need help with page
          And I click enforcing an injunction
          And I click <boolean> I or my child is in immediate danger
          Then I verify I am on the <page> 
          Examples:
          |boolean                                        |page                                            |
          |yes                                            |contact civil legal advice page                 |
          |no                                             |about me page                                   |              


Scenario Outline: Domestic Violence - Harassment

          Given I am on the public problem page
          When I select domestic violence
          Then I am redirected to the debt what do you need help with page
          And I click DV harassment
          And I click <boolean> I or my child is in immediate danger
          Then I verify I am on the <page> 
          Examples:
          |boolean                                        |page                                            |
          |yes                                            |contact civil legal advice page                 |
          |no                                             |about me page                                   |              
         

Scenario: Domestic Violence - Contesting an injunction

          Given I am on the public problem page
          When I select domestic violence
          Then I am redirected to the debt what do you need help with page
          When I click contesting an injunction
          Then I verify I am on the about me page  

        
Scenario: Domestic Violence - Forced Marriage

          Given I am on the public problem page
          When I select domestic violence
          Then I am redirected to the debt what do you need help with page
          When I click forced marriage
          Then I verify I am on the about me page 
          
Scenario Outline: Domestic Violence - Female genital mutilation

          Given I am on the public problem page
          When I select domestic violence
          Then I am redirected to the debt what do you need help with page
          And I click female genital mutilation
          And I click <boolean> I or my child is in immediate danger
          Then I verify I am on the <page> 
          Examples:
          |boolean                                        |page                                            |
          |yes                                            |contact civil legal advice page                 |
          |no                                             |about me page                                   | 
          
Scenario: Domestic Violence - Any Other

          Given I am on the public problem page
          When I select domestic violence
          Then I am redirected to the debt what do you need help with page
          When I click DV any other problem
          Then I verify I am on the legal aid is not available for this problem page                                       
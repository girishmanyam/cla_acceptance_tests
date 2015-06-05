@staging
Feature: Education scope assessment


Scenario: education - child in care - contact us

          Given I am on the public problem page
          When I select Education
          Then I am redirected to the debt what do you need help with page
          When I click a child in care or a care leaver
          Then I verify I am on the contact civil legal advice page
                

Scenario: education - special education needs - MEANS TEST

          Given I am on the public problem page
          When I select Education
          Then I am redirected to the debt what do you need help with page
          When I click special education needs
          Then I verify I am on the about me page              

       
Scenario Outline: education - discrimination - age - over 18 

          Given I am on the public problem page
          When I select Education
          Then I am redirected to the debt what do you need help with page
          When I click education discrimination
          And I click by age
          And I click I am 18 or over
          And I click <situation>
          Then I verify I am on the <page> 
          Examples:
          |situation                                      |page                                            |
          |at work                                        |about me page                                   |
          |while using a service                          |about me page                                   |
          |at a private club                              |about me page                                   | 
          |when someone was carrying out a public function|about me page                                   |
          |at university                                  |about me page                                   |
          |other                                          |legal aid is not available for this problem page|
          
            
Scenario: eductation - age - under 18 - at work -  MEANS TEST

          Given I am on the public problem page
          When I select Education
          Then I am redirected to the debt what do you need help with page
          When I click education discrimination
          When I click by age
          And I click I under 18
          Then I verify I am on the contact civil legal advice page  
          
            
Scenario Outline:  education - discrimination - disability

          Given I am on the public problem page
          When I select Education
          Then I am redirected to the debt what do you need help with page
          When I click education discrimination
          When I click disability
          And I click disability discrimination <situation>
          Then I verify I am on the <page> 
          Examples:
          |situation                                      |page                                            |
          |at work                                        |about me page                                   |
          |while using a service                          |about me page                                   |
          |at a private club                              |about me page                                   | 
          |when someone was carrying out a public function|about me page                                   |
          |at school or college                           |about me page                                   |
          |at university                                  |about me page                                   |
          |other                                          |legal aid is not available for this problem page|  
          
             
Scenario Outline:  education - discrimination - gender

          Given I am on the public problem page
          When I select Education
          Then I am redirected to the debt what do you need help with page
          When I click education discrimination
          And I click gender
          And I click gender discrimination <situation>
          Then I verify I am on the <page> 
          Examples:
          |situation                                      |page                                            |
          |at work                                        |about me page                                   |
          |while using a service                          |about me page                                   |
          |at a private club                              |about me page                                   | 
          |when someone was carrying out a public function|about me page                                   |
          |at school or college                           |about me page                                   |
          |at university                                  |about me page                                   |
          |other                                          |legal aid is not available for this problem page|
          
          
            
Scenario Outline: education - discrimination - marriage

          Given I am on the public problem page
          When I select Education
          Then I am redirected to the debt what do you need help with page
          When I click education discrimination
          When I click marriage 
          And I click marriage discrimination <situation>
          Then I verify I am on the <page> 
          Examples:
          |situation                                      |page                                            |
          |at work                                        |about me page                                   |
          |other                                          |legal aid is not available for this problem page|  

             
Scenario Outline:  education - discrimination - race

          Given I am on the public problem page
          When I select Education
          Then I am redirected to the debt what do you need help with page
          When I click education discrimination
          When I click race
          And I click race discrimination <situation>
          Then I verify I am on the <page> 
          Examples:
          |situation                                      |page                                            |
          |at work                                        |about me page                                   |
          |while using a service                          |about me page                                   |
          |at a private club                              |about me page                                   | 
          |when someone was carrying out a public function|about me page                                   |
          |at school or college                           |about me page                                   |
          |at university                                  |about me page                                   |
          |other                                          |legal aid is not available for this problem page|   
          
            
Scenario Outline: education - discrimination - race

          Given I am on the public problem page
          When I select Education
          Then I am redirected to the debt what do you need help with page
          When I click education discrimination
          When I click religion
          And I click religion discrimination <situation>
          Then I verify I am on the <page> 
          Examples:
          |situation                                      |page                                                    |
          |at work                                        |about me page                                           |
          |while using a service                          |about me page                                           |
          |at a private club                              |about me page                                           |  
          |when someone was carrying out a public function|about me page                                           |
          |at school or college                           |about me page                                           |
          |at university                                  |about me page                                           |
          |other                                          |legal aid is not available for this problem page|  
          
          
Scenario: education - none of the above - NO MEANS TEST

          Given I am on the public problem page
          When I select Education
          Then I am redirected to the debt what do you need help with page
          When I click education none of the above
          Then I verify I am on the legal aid is not usually available for this problem page                         
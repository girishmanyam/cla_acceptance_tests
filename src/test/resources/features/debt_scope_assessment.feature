@staging
Feature: Debt Scope Assessment


Scenario: Yes I own my own home - no risk - NO MEANS TEST

          Given I am on the public problem page
          When I select debt
          Then I am redirected to the debt what do you need help with page
          When I click that I own my own home
          Then I am redirected to the debt what do you need help with page
          And I click NO I am not at risk of losing my home
          Then I verify I am on the legal aid is not available for this problem page

Scenario: Yes I own my own home - at risk - MEANS TEST

          Given I am on the public problem page
          When I select debt
          Then I am redirected to the debt what do you need help with page
          When I click that I own my own home
          Then I am redirected to the debt what do you need help with page
          And I click YES I am at risk of losing my home
          Then I verify I am on the about me page
          

Scenario: Becoming homeless - MEANS TEST

          Given I am on the public problem page
          When I select debt
          Then I am redirected to the debt what do you need help with page
          When I click that I am homeless
          Then I verify I am on the about me page
          

Scenario: In rented accommodation - Becoming homeless - MEANS TEST

          Given I am on the public problem page
          When I select debt
          Then I am redirected to the debt what do you need help with page
          When I click that I am in rented accommodation
          And I click I am becoming homeless
          Then I verify I am on the about me page
          
          

Scenario: In rented accommodation - losing accommodation as UKVI refusing to support - MEANS TEST

          Given I am on the public problem page
          When I select debt
          Then I am redirected to the debt what do you need help with page
          When I click that I am in rented accommodation
          And I click I am losing my accommodation because UKVI is refusing support
          Then I verify I am on the about me page
          

Scenario: In rented accommodation - eviction - eviction with notice - MEANS TEST

          Given I am on the public problem page
          When I select debt
          Then I am redirected to the debt what do you need help with page
          When I click that I am in rented accommodation
          And I click I eviction
          And I click eviction with notice
          Then I verify I am on the about me page
          

Scenario: In rented accommodation - eviction - unlawful eviction - MEANS TEST

          Given I am on the public problem page
          When I select debt
          Then I am redirected to the debt what do you need help with page
          When I click that I am in rented accommodation
          And I click I eviction
          And I click unlawful eviction
          Then I verify I am on the about me page   
          



#NEEDS CHECKING
#Scenario: In rented accommodation - eviction - other eviction - NO MEANS TEST
#
#          Given I am on the public problem page
#          When I select debt
#          Then I am redirected to the debt what do you need help with page
#          When I click that I am in rented accommodation
#          And I click I eviction
#          And I click other eviction
#          Then I verify I am on the about me page   

 
Scenario: In rented accommodation - home in disrepair - risk of injury/illness - MEANS TEST

          Given I am on the public problem page
          When I select debt
          Then I am redirected to the debt what do you need help with page
          When I click that I am in rented accommodation
          And I click home in disrepair
          And I click YES this put me in risk of injury or illness
          Then I verify I am on the about me page  

Scenario: In rented accommodation - home in disrepair - no risk of injury/illness - NO MEANS TEST

          Given I am on the public problem page
          When I select debt
          Then I am redirected to the debt what do you need help with page
          When I click that I am in rented accommodation
          And I click home in disrepair
          And I click NO this put me in risk of injury or illness
          Then I verify that legal aid is not available for this problem    

         
Scenario: In rented accommodation - harrasment - a neighbour or landlord - MEANS TEST

          Given I am on the public problem page
          When I select debt
          Then I am redirected to the debt what do you need help with page
          When I click that I am in rented accommodation
          And I click harassment
          And I click by a neighbour or landlord
          Then I verify I am on the about me page    
          
          
Scenario: In rented accommodation - harrasment - a partner or family member - risk of harm - CONTACT CLA

          Given I am on the public problem page
          When I select debt
          Then I am redirected to the debt what do you need help with page
          When I click that I am in rented accommodation
          And I click harassment
          And I click by a partner or family member
          And I click YES I am in immediate risk of harm
          Then I verify I am on the contact civil legal advice page  
          
          
Scenario: In rented accommodation - harrasment - a partner or family member - no risk of harm - MEANS TEST

          Given I am on the public problem page
          When I select debt
          Then I am redirected to the debt what do you need help with page
          When I click that I am in rented accommodation
          And I click harassment
          And I click by a partner or family member
          And I click NO I am in immediate risk of harm
          Then I verify I am on the about me page 
          
         
Scenario: In rented accommodation - harrasment - someone else - NO MEANS TEST

          Given I am on the public problem page
          When I select debt
          Then I am redirected to the debt what do you need help with page
          When I click that I am in rented accommodation
          And I click harassment
          And I click by a someone else
          Then I verify that a legal advisor maybe able to help       
          
         
Scenario Outline: In rented accommodation - discrimination - age - over 18 

          Given I am on the public problem page
          When I select debt
          Then I am redirected to the debt what do you need help with page
          When I click that I am in rented accommodation
          And I click discrimination
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
          
          
Scenario: In rented accommodation - discrimination - age - under 18 - at work -  MEANS TEST

          Given I am on the public problem page
          When I select debt
          Then I am redirected to the debt what do you need help with page
          When I click that I am in rented accommodation
          And I click discrimination
          And I click by age
          And I click I under 18
          Then I verify I am on the contact civil legal advice page  
          
         
Scenario Outline: In rented accommodation - discrimination - disability

          Given I am on the public problem page
          When I select debt
          Then I am redirected to the debt what do you need help with page
          When I click that I am in rented accommodation
          And I click discrimination
          And I click disability
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
          
          
Scenario Outline: In rented accommodation - discrimination - gender

          Given I am on the public problem page
          When I select debt
          Then I am redirected to the debt what do you need help with page
          When I click that I am in rented accommodation
          And I click discrimination
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
          
          
         
Scenario Outline: In rented accommodation - discrimination - marriage

          Given I am on the public problem page
          When I select debt
          Then I am redirected to the debt what do you need help with page
          When I click that I am in rented accommodation
          And I click discrimination
          And I click marriage 
          And I click marriage discrimination <situation>
          Then I verify I am on the <page> 
          Examples:
          |situation                                      |page                                            |
          |at work                                        |about me page                                   |
          |other                                          |legal aid is not available for this problem page|  

          
Scenario Outline: In rented accommodation - discrimination - race

          Given I am on the public problem page
          When I select debt
          Then I am redirected to the debt what do you need help with page
          When I click that I am in rented accommodation
          And I click discrimination
          And I click race
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
          
          
Scenario Outline: In rented accommodation - discrimination - race

          Given I am on the public problem page
          When I select debt
          Then I am redirected to the debt what do you need help with page
          When I click that I am in rented accommodation
          And I click discrimination
          And I click religion
          And I click religion discrimination <situation>
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

         
Scenario: In rented accommodation - discrimination - other - NO MEANS TEST

          Given I am on the public problem page
          When I select debt
          Then I am redirected to the debt what do you need help with page
          When I click that I am in rented accommodation
          And I click discrimination 
          And I click other discrimination
          Then I verify I am on the legal aid is not available for this problem page 

          
Scenario Outline: In rented accommodation - ASBO or ASBI 

          Given I am on the public problem page
          When I select debt
          Then I am redirected to the debt what do you need help with page
          When I click that I am in rented accommodation
          And I click ASBO or ASBI
          And I click <situation>
          Then I verify I am on the <page> 
          Examples:
          |situation                                      |page                                            |
          |social housing landlord                        |about me page                                   |
          |private landlord                               |legal aid is not available for this problem page|   
          
         
Scenario: In rented accommodation - none of the above - NO MEANS TEST

          Given I am on the public problem page
          When I select debt
          Then I am redirected to the debt what do you need help with page
          When I click that I am in rented accommodation
          And I click rented accommodation none of the above
          Then I verify I am on the legal aid is not available for this problem page  

        
Scenario: You're homeless - MEANS TEST

          Given I am on the public problem page
          When I select debt
          Then I am redirected to the debt what do you need help with page
          When I click that I am homeless
          Then I verify I am on the about me page 

           
Scenario: You owe money - NO MEANS TEST

          Given I am on the public problem page
          When I select debt
          Then I am redirected to the debt what do you need help with page
          When I click that I owe money
          Then I verify I am on the legal aid is not available for this problem page                                                                                                                                     
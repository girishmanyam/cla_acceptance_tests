
Feature: Welfare benefits Assessment

@todo
Scenario: welfare benefits - benefits appeal - point of law in an higher tribunal

  Given I am on the public problem page
  When I select welfare benefits
  Then I should be redirected to the welfare what do you need help with page
  When I click benefits appeal
  And I click a point of law in an higher tribunal
  Then I verify I am on the legal aid is available for this problem page
  

Scenario: welfare benefits - benefits appeal - point of law first-tier tribunal


  Given I am on the public problem page
  When I select welfare benefits
  Then I should be redirected to the welfare what do you need help with page
  When I click benefits appeal
  And I click a point of law in first-tier tribunal
  Then I verify I am on the legal aid is not usually available for this problem page
  
  

Scenario: welfare benefits - permission for appeal refused


  Given I am on the public problem page
  When I select welfare benefits
  Then I should be redirected to the welfare what do you need help with page
  When I click permission for appeal refused
  Then I verify I am on the legal aid is available for this problem page
  
  

Scenario Outline: welfare benefits -  discrimination - age - over 18 

          Given I am on the public problem page
          When I select welfare benefits
          Then I should be redirected to the welfare what do you need help with page
          When I click discrimination
          And I click by age
          And I click I am 18 or over
          And I click <situation>
          Then I verify I am on the <page> 
          Examples:
          |situation                                      |page                                                    |
          |at work                                        |legal aid is available for this problem page            |
          |while using a service                          |legal aid is available for this problem page            |
          |at a private club                              |legal aid is available for this problem page            | 
          |when someone was carrying out a public function|legal aid is available for this problem page            |
          |at university                                  |legal aid is available for this problem page            |
          |other                                          |legal aid is not usually available for this problem page|
          
         
Scenario: welfare benefits - discrimination - age - under 18 - at work -  MEANS TEST

          Given I am on the public problem page
          When I select welfare benefits
          Then I should be redirected to the welfare what do you need help with page
          When I click discrimination
          And I click by age
          And I click I am under 18
          Then I verify I am on the contact civil legal advice page  
          
         
Scenario Outline: welfare benefits -  discrimination - disability

          Given I am on the public problem page
          When I select welfare benefits
          Then I should be redirected to the welfare what do you need help with page
          When I click discrimination
          And I click disability
          And I click disability discrimination <situation>
          Then I verify I am on the <page> 
          Examples:
          |situation                                      |page                                                    |
          |at work                                        |legal aid is available for this problem page            |
          |at home                                        |legal aid is available for this problem page            |
          |while using a service                          |legal aid is available for this problem page            |
          |at a private club                              |legal aid is available for this problem page            | 
          |when someone was carrying out a public function|legal aid is available for this problem page            |
          |at school or college                           |legal aid is available for this problem page            |
          |at university                                  |legal aid is available for this problem page            |
          |other                                          |legal aid is not usually available for this problem page|  
          
       
Scenario Outline: welfare benefits -   discrimination - gender

          Given I am on the public problem page
          When I select welfare benefits
          Then I should be redirected to the welfare what do you need help with page
          When I click discrimination
          And I click gender
          And I click gender discrimination <situation>
          Then I verify I am on the <page> 
          Examples:
          |situation                                      |page                                                    |
          |at work                                        |legal aid is available for this problem page            |
          |at home                                        |legal aid is available for this problem page            |                 
          |while using a service                          |legal aid is available for this problem page            |
          |at a private club                              |legal aid is available for this problem page            | 
          |when someone was carrying out a public function|legal aid is available for this problem page            |
          |at school or college                           |legal aid is available for this problem page            |
          |at university                                  |legal aid is available for this problem page            |
          |other                                          |legal aid is not usually available for this problem page|
          
          
         
Scenario Outline:welfare benefits -   discrimination - marriage

          Given I am on the public problem page
          When I select welfare benefits
          Then I should be redirected to the welfare what do you need help with page
          When I click discrimination
          And I click marriage 
          And I click marriage discrimination <situation>
          Then I verify I am on the <page> 
          Examples:
          |situation                                      |page                                                    |
          |at work                                        |legal aid is available for this problem page            |
          |other                                          |legal aid is not usually available for this problem page|  

           
Scenario Outline:welfare benefits -   discrimination - race

          Given I am on the public problem page
          When I select welfare benefits
          Then I should be redirected to the welfare what do you need help with page
          When I click discrimination
          And I click race
          And I click race discrimination <situation>
          Then I verify I am on the <page> 
          Examples:
          |situation                                      |page                                                    |
          |at work                                        |legal aid is available for this problem page            |
          |at home                                        |legal aid is available for this problem page            |          
          |while using a service                          |legal aid is available for this problem page            |
          |at a private club                              |legal aid is available for this problem page            | 
          |when someone was carrying out a public function|legal aid is available for this problem page            |
          |at school or college                           |legal aid is available for this problem page            |
          |at university                                  |legal aid is available for this problem page            |
          |other                                          |legal aid is not usually available for this problem page|   
          
         
Scenario Outline:welfare benefits -  discrimination - religion

          Given I am on the public problem page
          When I select welfare benefits
          Then I should be redirected to the welfare what do you need help with page
          When I click discrimination
          And I click religion
          And I click religion discrimination <situation>
          Then I verify I am on the <page> 
          Examples:
          |situation                                      |page                                                    |
          |at work                                        |legal aid is available for this problem page            |
          |at home                                        |legal aid is available for this problem page            |         
          |while using a service                          |legal aid is available for this problem page            |
          |at a private club                              |legal aid is available for this problem page            | 
          |when someone was carrying out a public function|legal aid is available for this problem page            |
          |at school or college                           |legal aid is available for this problem page            |
          |at university                                  |legal aid is available for this problem page            |
          |other                                          |legal aid is not usually available for this problem page|
          
Scenario: welfare benefits - other


  Given I am on the public problem page
  When I select welfare benefits
  Then I should be redirected to the welfare what do you need help with page
  When I click (welfare benefit) other
  Then I verify I am on the legal aid is available for this problem page          
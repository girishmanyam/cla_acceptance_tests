@staging
Feature: Housing scope assessment


Scenario: housing - own my home - no not at risk of loss - NO MEANS TEST

          Given I am on the public problem page
          When I select housing
          Then I am redirected to the housing what do you need help with page
          When I click that I own my own home
          And I click NO I am not at risk of losing my home
          Then I verify I am on the legal aid is not usually available for this problem page

         
Scenario: housing - own my home - no not at risk of loss - MEANS TEST

          Given I am on the public problem page
          When I select housing
          Then I am redirected to the housing what do you need help with page
          When I click that I own my own home
          And I click YES I am at risk of losing my home
          Then I verify I am on the legal aid is available for this problem page 
           

Scenario: housing - rented accommodation - becoming homeless

          Given I am on the public problem page
          When I select housing
          Then I am redirected to the housing what do you need help with page
          When I click I am in rented accommodation
          And I click that I am becoming homeless
          Then I verify I am on the legal aid is available for this problem page


Scenario: housing - rented accommodation - being evicted

          Given I am on the public problem page
          When I select housing
          Then I am redirected to the housing what do you need help with page
          When I click I am in rented accommodation
          And I click that I am being evicted
          Then I verify I am on the legal aid is available for this problem page
          

Scenario: housing - rented accommodation - losing accommodation

          Given I am on the public problem page
          When I select housing
          Then I am redirected to the housing what do you need help with page
          When I click I am in rented accommodation
          And I click that I am losing my accommodation
          Then I verify I am on the legal aid is available for this problem page
          

Scenario: housing - rented accommodation - home in serious disrepair

          Given I am on the public problem page
          When I select housing
          Then I am redirected to the housing what do you need help with page
          When I click I am in rented accommodation
          And I click that my home is in serious disrepair
          And I click YES I am in risk of serious harm or injury
          Then I verify I am on the legal aid is available for this problem page
          

Scenario: housing - rented accommodation - home in serious disrepair

          Given I am on the public problem page
          When I select housing
          Then I am redirected to the housing what do you need help with page
          When I click I am in rented accommodation
          And I click that my home is in serious disrepair
          And I click NO I am in risk of serious harm or injury
          Then I verify I am on the legal aid is not usually available for this problem page

    
Scenario: housing - You're homeless - MEANS TEST

          Given I am on the public problem page
          When I select housing
          Then I am redirected to the housing what do you need help with page
          When I click that I am homeless
          Then I verify I am on the legal aid is available for this problem page  

     
Scenario: housing - You're a landlord applying for an injuntion - MEANS TEST

          Given I am on the public problem page
          When I select housing
          Then I am redirected to the housing what do you need help with page
          When I click that I am a landlord applying for an injuction
          Then I verify I am on the legal aid is available for this problem page 

        
Scenario: housing - Any other housing problem - NO MEANS TEST

          Given I am on the public problem page
          When I select housing
          Then I am redirected to the housing what do you need help with page
          When I click any other housing problem
          Then I verify I am on the legal aid is not usually available for this problem page

          
Scenario: housing - asylum seeker looking for accommodation - MEANS TEST

          Given I am on the public problem page
          When I select housing
          Then I am redirected to the housing what do you need help with page
          When I click I am an asylum seeker looking for accommodation
          Then I verify I am on the legal aid is available for this problem page                                              
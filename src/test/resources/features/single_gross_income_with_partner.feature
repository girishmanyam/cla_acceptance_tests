@staging 
Feature: Single Person Capital Test

Background: Means test defaults

   Given I am on the means test start page
   When I click check if you qualify
   When I say NO I do not have a partner
   And I say NO I do not receive benefits
   And I say NO I have no children aged 15 or under
   And I say NO I have no children aged 16 or over
   And I say YES I have property
   And I say YES I am employed
   And I say NO I am not self-employed
   And I say NO I or my partner is over 60
   
Scenario: Single gross income - with partner



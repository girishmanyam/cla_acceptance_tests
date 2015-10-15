@staging
Feature: Partner Capital Test

Background: Means test defaults

   Given I am on the means test start page
   When I click check if you qualify
   And I say YES I have a partner
   And I say NO I am not in dispute with my partner
   And I say NO I do not receive benefits
   And I say NO I have no children aged 15 or under
   And I say NO I have no children aged 16 or over
   And I say YES I have property
   And I say NO I am not employed
   And I say NO my partner is not employed
   And I say NO I am not self-employed
   And I say NO my partner is not self-employed
   And I say NO I or my partner is over 60

  
Scenario Outline: Capital test - two incomes - just savings  

    And I say YES I have savings or investments
    And I say NO I don't have valuables worth over 500
    And I click continue
    Then I verify I am on you and your partners property page    
    When I say YES the property is the main residence 
    And I say NO no one else owns a share of the property
    And I say the property is worth "0.00"
    And I say there is "0.00" left to pay on the mortgage
    And I say the last monthly mortgage payment was "0.00"
    And I say NO I do not rent out parts of the property
    And I say NO my share of the property is not in dispute
    And I click continue
    Then I verify you and your partners savings page
    When I say my parnter and I savings are "<savings_total>"
    And I say my partner and I investments are "<investments_total>"
    And I click review my answers
    Then I verify I am on the review page
    When I click confirm answers
    Then I verify I am on the debt your're unlikely to get legal aid page
    Examples:
    |savings_total|investments_total|
    |8000.01      |0.00             |
    |8000.00      |0.01             | 
    
  
Scenario: Capital test - two incomes - equity disregard 

    And I say YES I have savings or investments
    And I say YES I have valuables worth over 500
    And I click continue
    Then I verify I am on you and your partners property page    
    When I say YES the property is the main residence 
    And I say NO no one else owns a share of the property
    And I say the property is worth "100000.01"
    And I say there is "0.00" left to pay on the mortgage
    And I say the last monthly mortgage payment was "0.00"
    And I say NO I do not rent out parts of the property
    And I say NO my share of the property is not in dispute
    And I click continue
    Then I verify you and your partners savings page
    When I say my parnter and I savings are "8000.00"
    And I say my partner and I investments are "0.00"
    And I say my partner and I have valuables worth "0"
    And I click review my answers
    Then I verify I am on the review page
    When I click confirm answers
    Then I verify I am on the debt your're unlikely to get legal aid page  
    
  
Scenario: Capital test - two incomes - equity disregard  

    And I say YES I have savings or investments
    And I say YES I have valuables worth over 500
    And I click continue
    Then I verify I am on you and your partners property page    
    When I say YES the property is the main residence 
    And I say NO no one else owns a share of the property
    And I say the property is worth "100000.01"
    And I say there is "0.01" left to pay on the mortgage
    And I say the last monthly mortgage payment was "0.00"
    And I say NO I do not rent out parts of the property
    And I say NO my share of the property is not in dispute
    And I click continue
    Then I verify you and your partners savings page
    When I say my parnter and I savings are "8000.00"
    And I say my partner and I investments are "0.00"
    And I say my partner and I have valuables worth "0"
   And I click continue
    Then I verify I am on you and your partners income page
    When I say I received "0.00" maintenance "per_week"
    And I say I received "0.00" pension "per_week"
    And I say I received "0.00" other income "per_week"
    When I say my partner received "0.00" maintenance "per_week"
    And I say my partner received "0.00" pension "per_week"
    And I say my partner received "0.00" other income "per_week"
    And I click continue
    Then I verify I am on you and your partners outgoings page
    When our outgoing rent is "0.00" "per_week"
    And our outgoing maintenance is "0.00" "per_week"
    And our outgoing payment for a monthly income contribution order is "0.00"
    And I click review my answers
    Then I verify I am on the review page
    When I click confirm answers
    Then I verify I am on the contact civil legal advice page 


    
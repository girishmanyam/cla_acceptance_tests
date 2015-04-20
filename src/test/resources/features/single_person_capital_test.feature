Feature: Single Person Capital Test

Background: For Debt

   Given I am on the public start page
   When I click the start now button
   And I select debt
   And I click continue
   Then I verify I am on the about me page
   When I say NO I do not have a partner
   And I say NO I do not receive benefits
   And I say NO I have no children aged 15 or under
   And I say NO I have no children aged 16 or over
   And I say YES I have property
   And I say NO I am not employed
   And I say NO I am not self-employed
   And I say NO I or my partner is over 60
   And I say NO I am not employed
   And I say NO I have no savings or investments
   And I say NO I don't have valuables worth over 500   

@todo  
Scenario: 

    When I click continue
    Then I verify I am on your property page    
    When I say NO the property is the main residence
    And I say YES the property is the main residence 
    And I say YES someone else owns a share of the property
    And I say NO no one else owns a share of the property
    And I say the property is worth "108000.01"
    And I say there is "0.00" left to pay on the mortgage
    And I say the last monthly mortgage payment was "0.00"
    And I say YES I do rent out parts of the property
    And I say NO I do not rent out parts of the property
    And I say YES my share of the property is in dispute
    And I say NO my share of the property is not in dispute
    And I click continue
    Then I verify I am on the debt your're likely to get legal aid page
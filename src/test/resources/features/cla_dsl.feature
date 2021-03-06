Feature: DSL Language for CLA

@sprint
Scenario: jhsjdhsj
          
          Given I am on the public start page
          When I click the start now button
          Then I verify I am on the problem page

Scenario: Get to about you

          #Given I am on the contact us page
          Given I am on the public start page
          #Given I am on the public problem page
          When I click the start now button
          Then I verify I am on the problem page
          When I select debt
          #When I select domestic violence
          #When I select discrimination
          #When I select education
          #When I select housing
          #And I click continue
          Then I verify I am on the about me page
          And I say YES I have a partner
          And I say YES I am in dispute with my partner
          And I say NO I am not in dispute with my partner
          When I say NO I do not have a partner
          And I say YES I receive benefits
          And I say NO I do not receive benefits
          And I say YES I have children aged 15 or under
          And I say I have 5 children aged 15 or under
          And I say NO I have no children aged 15 or under
          And I say YES I have children aged 16 or over
          And I say I have 5 children aged 16 or over
          And I say NO I have no children aged 16 or over
          And I say NO I do not have property
          And I say YES I have property
          And I say YES I am employed
          And I say NO I am not employed
          And I say YES I am self-employed
          And I say YES my partner is employed
          And I say NO my partner is not employed
          And I say NO I am not self-employed
          And I say YES my partner is self-employed
          And I say NO my partner is not self-employed
          And I say YES I or my partner is over 60
          And I say NO I or my partner is over 60
          And I say YES I have savings or investments
          And I say NO I have no savings or investments
          And I say YES I have valuables worth over 500
          And I say NO I don't have valuables worth over 500  
          #And I select to get in touch
          And I click continue
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
          Then I verify I am on the income page
          When I say I received "0.00" maintenance
          #per_week, per_4week, per_month, per_year - is period selectable options
          And I say the  period is "per_week" for received maintenance period
          And I say I received "0.00" pension
          And I say the period is "per_week" for received pension
          And I say I received "0.00" other income
          And I say  period is "per_week" for received other income
          And I click continue
          Then I verify I am on the outgoings page
          When I say I pay "0.00" rent
          #per_week, per_4week, per_month, per_year - is period selectable options
          And I say the  period is "per_week" for rent payment
          And I say I pay "0.00" maintenance
          And I say the period is "per_week" for maintenance payment
          And I say I pay "0.00" other income contribution  
          And I click review my answers  
          Then I verify I am on the review page
          When I click confirm answers    
          Then I verify I am on the maybe eligible contact us page
          When I say YES to has anyone helped to fill in the form
          And I enter my full name "Mickey Mouse"
          And I enter my helpers full name "Minnie Mouse"
          # PARENT_GUARDIAN,FAMILY_FRIEND,PROFESSIONAL,LEGAL_ADVISOR,OTHER
          And I select the option "FAMILY_FRIEND" as the  relationship to me 
          And I say NO to has anyone helped to fill in the form
          And I enter my full name "Mickey Mouse"
          And I select I will call the cla
          And I select I wish the cla to call me back
          And I enter a contact number "0124356787365"
          And I say YES that it is safe to save a message
          And I select option 3 for the day to call
          And I select option 4 for the time to call
          And I enter a postcode "sg80lt"
          And I click find address
          And I select option 3 from the address list
          And I enter my street address "3 Cheyney Close, Steeple, Morden"
          And I enter extra notes that may help "further details that may help"
          And I click bslwebcam for special communication need
          And I click minicom for special communication need
          And I click text relay for special communication need
          And I click welsh for special communication need
          And I click other language for special communication need
          And I select "ARABIC" language for special communication need
          And I select other special communication needs
          And I enter details "I need human assistance" for my other special communication needs
          And I click submit details
          
          

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


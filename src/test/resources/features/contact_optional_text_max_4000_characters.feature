Feature: The max number of characters for contact situation text

@todo
Scenario: Get to about you

          Given I am on the public start page
          When I click the start now button
          Then I verify I am on the problem page
          #When I select debt
          #When I select domestic violence
          #When I select discrimination
          #When I select education
          #When I select housing
          When I select family
          And I click continue
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
          And I say YES I have property
          And I say NO I do not have property
          And I say YES I am employed
          And I say NO I am not employed
          And I say YES I am self-employed
          And I say NO I am not self-employed
          And I say YES I or my partner is over 60
          And I say NO I or my partner is over 60
          And I say YES I have savings or investments
          And I say NO I have no savings or investments
          And I say YES I have valuables worth over 500
          And I say NO I don't have valuables worth over 500  
          #And I select to get in touch
          And I click continue
          Then I verify I am on the income page
          When I say I received 0 maintenance
          #per_week, per_4week, per_month, per_year - is period selectable options
          And I say the  period is "per_week" for received maintenance period
          And I say I received 0 pension
          And I say the period is "per_week" for received pension
          And I say I received 0 other income
          And I say  period is "per_week" for received other income
          And I click continue
          Then I verify I am on the outgoings page
          When I say I pay 0 rent
          #per_week, per_4week, per_month, per_year - is period selectable options
          And I say the  period is "per_week" for rent payment
          And I say I pay 0 maintenance
          And I say the period is "per_week" for maintenance payment
          And I say I pay 0 other income contribution  
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
          
          
          
          
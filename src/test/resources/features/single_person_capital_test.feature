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
   And I say NO I am not employed
   And I say NO I am not self-employed
   And I say NO I or my partner is over 60
  #And I capture the page named "about_you"  


Scenario: Capital test - one income - penny over capital+equity dis

    And I say NO I have no savings or investments
    And I say NO I don't have valuables worth over 500
    And I click continue
    Then I verify I am on your property page    
    When I say YES the property is the main residence 
    And I say NO no one else owns a share of the property
    And I say the property is worth "108000.01"
    And I say there is "0.00" left to pay on the mortgage
    And I say the last monthly mortgage payment was "0.00"
    And I say NO I do not rent out parts of the property
    And I say NO my share of the property is not in dispute
    And I click continue
    Then I verify I am on the review page
    When I click confirm answers
    Then I verify I am on the debt your're unlikely to get legal aid page


Scenario: Capital test - one income - capital+equity dis exactly


    And I say NO I have no savings or investments
    And I say NO I don't have valuables worth over 500
    And I click continue
    Then I verify I am on your property page    
    When I say YES the property is the main residence 
    And I say NO no one else owns a share of the property
    And I say the property is worth "108000.00"
    And I say there is "0.00" left to pay on the mortgage
    And I say the last monthly mortgage payment was "0.00"
    And I say NO I do not rent out parts of the property
    And I say NO my share of the property is not in dispute
    And I click continue
    Then I verify I am on the income page
    When I say I received "0.00" maintenance "per_week"
    And I say I received "0.00" pension "per_week"
    And I say I received "0.00" other income "per_week"
    And I click continue
    Then I verify I am on the outgoings page
    When I say I pay "0.00" rent "per_week"
    And I say I pay "0.00" maintenance "per_week" 
    And I say I pay "0.00" other income contribution  
    And I click review my answers  
    Then I verify I am on the review page
    When I click confirm answers
    Then I verify I am on the contact civil legal advice page 
    

Scenario: Capital test - one income - just savings - investments


    And I say YES I have savings or investments
    And I say NO I don't have valuables worth over 500
    And I click continue
    Then I verify I am on your property page    
    And I say YES the property is the main residence 
    And I say NO no one else owns a share of the property
    And I say the property is worth "0.00"
    And I say there is "0.00" left to pay on the mortgage
    And I say the last monthly mortgage payment was "0.00"
    And I say NO I do not rent out parts of the property
    And I say NO my share of the property is not in dispute
    And I click continue
    Then I verify I am on the savings page
    When I say I have "8000.00" as savings
    And I say I have "0.01" as investments
    And I click review my answers 
    Then I verify I am on the review page
    When I click confirm answers    
    Then I verify I am on the debt your're unlikely to get legal aid page
    

Scenario: Capital test - one income - just savings - valuables


    And I say YES I have savings or investments
    And I say YES I have valuables worth over 500
    And I click continue
    Then I verify I am on your property page    
    And I say YES the property is the main residence 
    And I say NO no one else owns a share of the property
    And I say the property is worth "0.00"
    And I say there is "0.00" left to pay on the mortgage
    And I say the last monthly mortgage payment was "0.00"
    And I say NO I do not rent out parts of the property
    And I say NO my share of the property is not in dispute
    And I click continue
    Then I verify I am on the savings page
    When I say I have "7500.00" as savings
    And I say I have "0.00" as investments
    And I say I have "500.01" of valuables
    And I click review my answers  
    Then I verify I am on the review page
    When I click confirm answers    
    Then I verify I am on the debt your're unlikely to get legal aid page

#Scenario: Capital test - one income - just savings - owed


Scenario: Capital at equity disregard, savings at limit

    And I say YES I have savings or investments
    And I say NO I don't have valuables worth over 500
    And I click continue
    Then I verify I am on your property page    
    And I say YES the property is the main residence 
    And I say NO no one else owns a share of the property
    And I say the property is worth "100000.00"
    And I say there is "0.00" left to pay on the mortgage
    And I say the last monthly mortgage payment was "0.00"
    And I say NO I do not rent out parts of the property
    And I say NO my share of the property is not in dispute
    And I click continue
    Then I verify I am on the savings page
    When I say I have "8000.00" as savings
    And I say I have "0.00" as investments
    And I click continue
    Then I verify I am on the income page
    When I say I received "0.00" maintenance "per_week"
    And I say I received "0.00" pension "per_week"
    And I say I received "0.00" other income "per_week"
    And I click continue
    Then I verify I am on the outgoings page
    When I say I pay "0.00" rent "per_week"
    And I say I pay "0.00" maintenance "per_week"
    And I say I pay "0.00" other income contribution  
    And I click review my answers  
    Then I verify I am on the review page
    When I click confirm answers    
    Then I verify I am on the contact civil legal advice page 
    
    
Scenario: Capital at equity disregard, savings at limit

    And I say YES I have savings or investments
    And I say NO I don't have valuables worth over 500
    And I click continue
    Then I verify I am on your property page    
    And I say YES the property is the main residence 
    And I say NO no one else owns a share of the property
    And I say the property is worth "100000.01"
    And I say there is "0.00" left to pay on the mortgage
    And I say the last monthly mortgage payment was "0.00"
    And I say NO I do not rent out parts of the property
    And I say NO my share of the property is not in dispute
    And I click continue
    Then I verify I am on the savings page
    When I say I have "8000.00" as savings
    And I say I have "0.00" as investments
    And I click continue 
    Then I verify I am on the review page
    When I click confirm answers    
    Then I verify I am on the debt your're unlikely to get legal aid page

      
Scenario: Mortgage reducing under limit

    And I say YES I have savings or investments
    And I say NO I don't have valuables worth over 500
    And I click continue
    Then I verify I am on your property page    
    And I say YES the property is the main residence 
    And I say NO no one else owns a share of the property
    And I say the property is worth "100000.01"
    And I say there is "0.01" left to pay on the mortgage
    And I say the last monthly mortgage payment was "0.00"
    And I say NO I do not rent out parts of the property
    And I say NO my share of the property is not in dispute
    And I click continue
    Then I verify I am on the savings page
    When I say I have "8000.00" as savings
    And I say I have "0.00" as investments
    And I click continue 
    Then I verify I am on the income page
    When I say I received "0.00" maintenance "per_week"
    And I say I received "0.00" pension "per_week"
    And I say I received "0.00" other income "per_week"
    And I click continue
    Then I verify I am on the outgoings page
    When I say I pay "0.00" rent "per_week"
    And I say I pay "0.00" maintenance "per_week"
    And I say I pay "0.00" other income contribution  
    And I click review my answers  
    Then I verify I am on the review page
    When I click confirm answers    
    Then I verify I am on the contact civil legal advice page 
    
    
  
Scenario: Mortgage reducing under limit    

    And I say YES I have savings or investments
    And I say NO I don't have valuables worth over 500
    And I click continue
    Then I verify I am on your property page    
    And I say YES the property is the main residence 
    And I say NO no one else owns a share of the property
    And I say the property is worth "100000.02"
    And I say there is "0.01" left to pay on the mortgage
    And I say the last monthly mortgage payment was "0.00"
    And I say NO I do not rent out parts of the property
    And I say NO my share of the property is not in dispute
    And I click continue
    Then I verify I am on the savings page
    When I say I have "8000.00" as savings
    And I say I have "0.00" as investments
    And I click continue 
    Then I verify I am on the review page
    When I click confirm answers        
    Then I verify I am on the debt your're unlikely to get legal aid page

 
Scenario: Mortgage capped at mortgage disregard

   And I say YES I have savings or investments
    And I say NO I don't have valuables worth over 500
    And I click continue
    Then I verify I am on your property page    
    And I say YES the property is the main residence 
    And I say NO no one else owns a share of the property
    And I say the property is worth "200000.00"
    And I say there is "100000.00" left to pay on the mortgage
    And I say the last monthly mortgage payment was "0.00"
    And I say NO I do not rent out parts of the property
    And I say NO my share of the property is not in dispute
    And I click continue
    Then I verify I am on the savings page
    When I say I have "8000.00" as savings
    And I say I have "0.00" as investments
    And I click continue 
    Then I verify I am on the income page
    When I say I received "0.00" maintenance "per_week"
    And I say I received "0.00" pension "per_week"
    And I say I received "0.00" other income "per_week"
    And I click continue
    Then I verify I am on the outgoings page
    When I say I pay "0.00" rent "per_week"
    And I say I pay "0.00" maintenance "per_week"
    And I say I pay "0.00" other income contribution  
    And I click continue 
    Then I verify I am on the review page
    When I click confirm answers    
    Then I verify I am on the contact civil legal advice page

     
Scenario: Mortgage capped at mortgage disregard

   And I say YES I have savings or investments
    And I say NO I don't have valuables worth over 500
    And I click continue
    Then I verify I am on your property page    
    And I say YES the property is the main residence 
    And I say NO no one else owns a share of the property
    And I say the property is worth "200000.00"
    And I say there is "100000.01" left to pay on the mortgage
    And I say the last monthly mortgage payment was "0.00"
    And I say NO I do not rent out parts of the property
    And I say NO my share of the property is not in dispute
    And I click continue
    Then I verify I am on the savings page
    When I say I have "8000.00" as savings
    And I say I have "0.00" as investments
    And I click continue 
    Then I verify I am on the income page
    When I say I received "0.00" maintenance "per_week"
    And I say I received "0.00" pension "per_week"
    And I say I received "0.00" other income "per_week"
    And I click continue
    Then I verify I am on the outgoings page
    When I say I pay "0.00" rent "per_week"
    And I say I pay "0.00" maintenance "per_week"
    And I say I pay "0.00" other income contribution  
    And I click review my answers  
    Then I verify I am on the review page
    When I click confirm answers    
    Then I verify I am on the contact civil legal advice page

 
Scenario: Mortgage capped at mortgage disregard    

    And I say YES I have savings or investments
    And I say NO I don't have valuables worth over 500
    And I click continue
    Then I verify I am on your property page    
    And I say YES the property is the main residence 
    And I say NO no one else owns a share of the property
    And I say the property is worth "200000.01"
    And I say there is "100000.00" left to pay on the mortgage
    And I say the last monthly mortgage payment was "0.00"
    And I say NO I do not rent out parts of the property
    And I say NO my share of the property is not in dispute
    And I click continue
    Then I verify I am on the savings page
    When I say I have "8000.00" as savings
    And I say I have "0.00" as investments
    And I click review my answers  
    Then I verify I am on the review page
    When I click confirm answers 
    Then I verify I am on the debt your're unlikely to get legal aid page

       
Scenario: Mortgage capped at mortgage disregard    

    And I say YES I have savings or investments
    And I say NO I don't have valuables worth over 500
    And I click continue
    Then I verify I am on your property page    
    And I say YES the property is the main residence 
    And I say NO no one else owns a share of the property
    And I say the property is worth "200000.01"
    And I say there is "100000.01" left to pay on the mortgage
    And I say the last monthly mortgage payment was "0.00"
    And I say NO I do not rent out parts of the property
    And I say NO my share of the property is not in dispute
    And I click continue
    Then I verify I am on the savings page
    When I say I have "8000.00" as savings
    And I say I have "0.00" as investments
    And I click review my answers  
    Then I verify I am on the review page
    When I click confirm answers 
    Then I verify I am on the debt your're unlikely to get legal aid page
    
   
Scenario: Mortgage capped at mortgage disregard    

    And I say YES I have savings or investments
    And I say NO I don't have valuables worth over 500
    And I click continue
    Then I verify I am on your property page    
    And I say YES the property is the main residence 
    And I say NO no one else owns a share of the property
    And I say the property is worth "200000.00"
    And I say there is "100000.00" left to pay on the mortgage
    And I say the last monthly mortgage payment was "0.00"
    And I say NO I do not rent out parts of the property
    And I say NO my share of the property is not in dispute
    And I click continue
    Then I verify I am on the savings page
    When I say I have "8000.00" as savings
    And I say I have "0.01" as investments
    And I click review my answers  
    Then I verify I am on the review page
    When I click confirm answers  
    Then I verify I am on the debt your're unlikely to get legal aid page

     
Scenario: Mortgage capped at mortgage disregard    

    And I say YES I have savings or investments
    And I say NO I don't have valuables worth over 500
    And I click continue
    Then I verify I am on your property page    
    And I say YES the property is the main residence 
    And I say NO no one else owns a share of the property
    And I say the property is worth "199999.99"
    And I say there is "99999.99" left to pay on the mortgage
    And I say the last monthly mortgage payment was "0.00"
    And I say NO I do not rent out parts of the property
    And I say NO my share of the property is not in dispute
    And I click continue
    Then I verify I am on the savings page
    When I say I have "8000.00" as savings
    And I say I have "0.01" as investments
    And I click review my answers  
    Then I verify I am on the review page
    When I click confirm answers  
    Then I verify I am on the debt your're unlikely to get legal aid page
    
 
Scenario: Mortgage capped at mortgage disregard    

    And I say YES I have savings or investments
    And I say NO I don't have valuables worth over 500
    And I click continue
    Then I verify I am on your property page    
    And I say YES the property is the main residence 
    And I say NO no one else owns a share of the property
    And I say the property is worth "199999.99"
    And I say there is "99999.99" left to pay on the mortgage
    And I say the last monthly mortgage payment was "0.00"
    And I say NO I do not rent out parts of the property
    And I say NO my share of the property is not in dispute
    And I click continue
    Then I verify I am on the savings page
    When I say I have "8000.00" as savings
    And I say I have "0.00" as investments
    And I click continue 
    Then I verify I am on the income page
    When I say I received "0.00" maintenance "per_week"
    And I say I received "0.00" pension "per_week"
    And I say I received "0.00" other income "per_week"
    And I click continue
    Then I verify I am on the outgoings page
    When I say I pay "0.00" rent "per_week"
    And I say I pay "0.00" maintenance "per_week"
    And I say I pay "0.00" other income contribution  
    And I click review my answers  
    Then I verify I am on the review page
    When I click confirm answers    
    Then I verify I am on the contact civil legal advice page

@staging
Feature: Immigration and asylum scope assessment



Scenario: Immigration and asylum - you want advice on seeking asylum
      
          Given I am on the public problem page
          When I select immigration and asylum
          Then I am redirected to the asylum seeker what do you need help with page
          When I click want advice on seeking asylum
          Then I verify I am on the legal aid maybe able to help page 

  
Scenario: Immigration and asylum - looking for accommodation
      
          Given I am on the public problem page
          When I select immigration and asylum
          Then I am redirected to the asylum seeker what do you need help with page
          When I click you are an asylum seeker looking for accommodation
          Then I verify I am on the legal aid is available for this problem page            
          
       
Scenario: Immigration and asylum - losing your accommodation
      
          Given I am on the public problem page
          When I select immigration and asylum
          Then I am redirected to the asylum seeker what do you need help with page
          When I click you are losing your accomodation as UKVI is refusing support
          Then I verify I am on the legal aid is available for this problem page           

 
Scenario: Immigration and asylum - victim of domestic violence - risk of harm
      
          Given I am on the public problem page
          When I select immigration and asylum
          Then I am redirected to the asylum seeker what do you need help with page
          When I click you are a victim of domestic violence
          And I click YES I am in immediate risk of harm
          Then I verify I am on the contact civil legal advice page 

          
Scenario: Immigration and asylum - victim of domestic violence - no risk of harm
      
          Given I am on the public problem page
          When I select immigration and asylum
          Then I am redirected to the asylum seeker what do you need help with page
          When I click you are a victim of domestic violence
          And I click NO I am not in immediate risk of harm
          Then I verify I am on the legal aid is available for this problem page  

Scenario: Immigration and asylum - other - being detained under immigration powers
      
          Given I am on the public problem page
          When I select immigration and asylum
          Then I am redirected to the asylum seeker what do you need help with page
          When I click (immigration and asylum) any other problem
          And I click you are being detained under immigration powers
          Then I verify I am on the legal aid maybe able to help page      
    
Scenario: Immigration and asylum - other - victim of modern slavery
      
          Given I am on the public problem page
          When I select immigration and asylum
          Then I am redirected to the asylum seeker what do you need help with page
          When I click (immigration and asylum) any other problem
          And I click you are a victim of human trafficking or modern slavery
          Then I verify I am on the legal aid maybe able to help page          
 

Scenario: Immigration and asylum - other - your travel documents have being retained
      
          Given I am on the public problem page
          When I select immigration and asylum
          Then I am redirected to the asylum seeker what do you need help with page
          When I click (immigration and asylum) any other problem
          And I click your travel documents have being retained
          Then I verify I am on the legal aid maybe able to help page  
           
Scenario: Immigration and asylum - other - subject to proceedings before the Special Immigration Appeal Commission
      
          Given I am on the public problem page
          When I select immigration and asylum
          Then I am redirected to the asylum seeker what do you need help with page
          When I click (immigration and asylum) any other problem
          And I click I am subject to proceedings before the Special Immigration Appeal Commission
          Then I verify I am on the legal aid maybe able to help page  
 
 
Scenario: Immigration and asylum - other - subject to proceedings before the Special Immigration Appeal Commission
      
          Given I am on the public problem page
          When I select immigration and asylum
          Then I am redirected to the asylum seeker what do you need help with page
          When I click (immigration and asylum) any other problem
          And I click I am under a Terrorism Prevention and Investigation Notice
          Then I verify I am on the legal aid maybe able to help page      
          
  
Scenario: Immigration and asylum - other - subject to proceedings before the Special Immigration Appeal Commission
      
          Given I am on the public problem page
          When I select immigration and asylum
          Then I am redirected to the asylum seeker what do you need help with page
          When I click (immigration and asylum) any other problem
          And I click any other immigration problem
          Then I verify I am on the legal aid maybe able to help page               
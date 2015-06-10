Feature: Immigration and asylum scope assessment


@sprint
Scenario: Immigration and asylum - you want advice on seeking asylum
      
          Given I am on the public problem page
          When I select immigration and asylum
          And I click want advice on seeking asylum
          Then I verify I am on the about me page
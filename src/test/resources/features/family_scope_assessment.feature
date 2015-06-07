@staging
Feature: Family scope assessment


Scenario Outline: family - local council involved

          Given I am on the public problem page
          When I select family
          Then I am redirected to the debt what do you need help with page
          When I click local council involved
          And I click <boolean> council trying to take children into care
          Then I verify I am on the <page> 
          Examples:
          |boolean                                        |page                                            |
          |yes                                            |contact civil legal advice page                 |
          |no                                             |about me page                                   |    
          

Scenario Outline: family - problem ex-partner

          Given I am on the public problem page
          When I select family
          Then I am redirected to the debt what do you need help with page
          When I click problem with your ex-partner
          And I click divorce separation or dissolution
          And I click <situation>
          Then I verify I am on the <page> 
          Examples:
          |situation                                |page|
          |problem expartner and you are under 18   |contact civil legal advice page                 |
          |problem expartner and any other problem  |legal aid is not available for this problem page|  


Scenario Outline: family - problem ex-partner - divorce separation or dissolution - domestic abuse

          Given I am on the public problem page
          When I select family
          Then I am redirected to the debt what do you need help with page
          When I click problem with your ex-partner
          And I click divorce separation or dissolution
          And I click domestic abuse
          And I click <boolean> risk of harm
          Then I verify I am on the <page> 
          Examples:
          |boolean|page                                            |
          |yes    |contact civil legal advice page                 |
          |no     |about me page                                   |   
          

Scenario Outline: family - problem ex-partner - divorce separation or dissolution - family mediation

          Given I am on the public problem page
          When I select family
          Then I am redirected to the debt what do you need help with page
          When I click problem with your ex-partner
          And I click divorce separation or dissolution
          And I click ex-partner family mediation
          And I click <boolean> family mediation started
          Then I verify I am on the <page> 
          Examples:
          |boolean|page                                                     |
          |yes    |about me page                                            |
          |no     |you maybe able to get legal aid for family mediation page|                      


Scenario Outline: family - problem ex-partner - disputes over children

          Given I am on the public problem page
          When I select family
          Then I am redirected to the debt what do you need help with page
          When I click problem with your ex-partner
          And I click ex-partner disputes over children
          And I click <situation>
          Then I verify I am on the <page> 
          Examples:
          |situation                                |page|
          |problem expartner disputes over children and you are under 18   |contact civil legal advice page                 |
          |problem expartner disputes over children and any other problem  |legal aid is not available for this problem page|  


Scenario Outline: family - problem ex-partner - disputes over children

          Given I am on the public problem page
          When I select family
          Then I am redirected to the debt what do you need help with page
          When I click problem with your ex-partner
          And I click ex-partner disputes over children
          And I click domestic abuse
          And I click <boolean> ex-partner disputes over children risk of harm
          Then I verify I am on the <page> 
          Examples:
          |boolean|page                                            |
          |yes    |contact civil legal advice page                 |
          |no     |about me page                                   |  

@sprint
Scenario Outline: family - problem ex-partner

          Given I am on the public problem page
          When I select family
          Then I am redirected to the debt what do you need help with page
          When I click problem with your ex-partner
          And I click ex-partner disputes over children
          And I click <situation>
          Examples:          
          |financial settlement             |
          |domestic violence or harassment  |
          |family mediation                 |
          |ex-partner any other problem     |

Scenario: family - problem disputes over children

          Given I am on the public problem page
          When I select family
          Then I am redirected to the debt what do you need help with page
          When I click disputes over children                 
                  

Scenario: family - child abduction

          Given I am on the public problem page
          When I select family
          Then I am redirected to the debt what do you need help with page
          When I click child abduction   
          

Scenario: family - any other problem

          Given I am on the public problem page
          When I select family
          Then I am redirected to the debt what do you need help with page
          When I click family any other problem                        
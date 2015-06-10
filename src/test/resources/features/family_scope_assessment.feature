@staging
Feature: Family scope assessment


Scenario Outline: family - local council involved

          Given I am on the public problem page
          When I select family
          Then I am redirected to the family what do you need help with page
          When I click (family) local council involved
          And I click <boolean> (family) council trying to take children into care
          Then I verify I am on the <page> 
          Examples:
          |boolean                                        |page                                            |
          |yes                                            |contact civil legal advice page                 |
          |no                                             |about me page                                   |    
          

Scenario Outline: family - problem ex-partner

          Given I am on the public problem page
          When I select family
          Then I am redirected to the family what do you need help with page
          When I click (family) problem with your ex-partner
          And I click (family) divorce separation or dissolution
          And I click (family) <situation>
          Then I verify I am on the <page> 
          Examples:
          |situation                                         |page                                            |
          |problem expartner and you are under 18   |contact civil legal advice page                 |
          |problem expartner and any other problem  |legal aid is not available for this problem page|  



Scenario Outline: family - problem ex-partner - divorce separation or dissolution - domestic abuse

          Given I am on the public problem page
          When I select family
          Then I am redirected to the family what do you need help with page
          When I click (family) problem with your ex-partner
          And I click (family) divorce separation or dissolution
          And I click (family) domestic abuse
          And I click <boolean> (family) risk of harm
          Then I verify I am on the <page> 
          Examples:
          |boolean|page                                            |
          |yes    |contact civil legal advice page                 |
          |no     |about me page                                   |   
          

Scenario Outline: family - problem ex-partner - divorce separation or dissolution - family mediation

          Given I am on the public problem page
          When I select family
          Then I am redirected to the family what do you need help with page
          When I click (family) problem with your ex-partner
          And I click (family) divorce separation or dissolution
          And I click (family) ex-partner family mediation
          And I click (family) <boolean> family mediation started
          Then I verify I am on the <page> 
          Examples:
          |boolean|page                                                     |
          |yes    |about me page                                            |
          |no     |you maybe able to get legal aid for family mediation page|                      



Scenario Outline: family - problem ex-partner - disputes over children

          Given I am on the public problem page
          When I select family
          Then I am redirected to the family what do you need help with page
          When I click (family) problem with your ex-partner
          And I click (family) ex-partner disputes over children
          And I click (family) <situation>
          Then I verify I am on the <page> 
          Examples:
          |situation                                |page|
          |problem expartner disputes over children and you are under 18   |contact civil legal advice page                 |
          |problem expartner disputes over children and any other problem  |legal aid is not available for this problem page|  


Scenario Outline: family - problem ex-partner - disputes over children - risk of harm

          Given I am on the public problem page
          When I select family
          Then I am redirected to the family what do you need help with page
          When I click (family) problem with your ex-partner
          And I click (family) ex-partner disputes over children
          And I click (family) domestic abuse
          And I click (family) <boolean> ex-partner disputes over children risk of harm
          Then I verify I am on the <page> 
          Examples:
          |boolean|page                                            |
          |yes    |contact civil legal advice page                 |
          |no     |about me page                                   |  

        
Scenario Outline: family - problem ex-partner - disputes over children - 

          Given I am on the public problem page
          When I select family
          Then I am redirected to the family what do you need help with page
          When I click (family) problem with your ex-partner
          And I click (family) ex-partner disputes over children
          And I click (family) ex-partner disputes over children child abduction 
          And I click (family) ex-partner disputes over children child abduction your child has been abducted         
          And I click (family) I am outside Uk <boolean> ex-partner child abducted in the UK 
          Then I verify I am on the <page> 
          Examples:
          |boolean|page                                            |
          |yes    |contact civil legal advice page                 |
          |no     |about me page                                   |  

 
Scenario Outline: family - problem ex-partner - disputes over children - 

          Given I am on the public problem page
          When I select family
          Then I am redirected to the family what do you need help with page
          When I click (family) problem with your ex-partner
          And I click (family) ex-partner disputes over children
          And I click (family) ex-partner disputes over children child abduction 
          And I click (family) ex-partner disputes over children child abduction <situation>
          Then I verify I am on the <page> 
          Examples:     
          |situation                                                  |page                                            | 
          |you have been accused of child abduction                   |about me page                                   | 
          |you are seeking an order to prevent the removal of a child |about me page                                   | 
          |none of the above                                          |legal aid is not available for this problem page|


Scenario Outline: family - problem ex-partner - financial settlement - under 18

          Given I am on the public problem page
          When I select family
          Then I am redirected to the family what do you need help with page
          When I click (family) problem with your ex-partner
          And I click (family) ex-partner financial settlement
          And I click (family) ex-partner financial settlement <situation>
          Then I verify I am on the <page> 
          Examples:
          |situation                       |page                                                    |
          |Under 18                        |contact civil legal advice page                         |
          |International family maintenance|about me page                                           |
          |any other problem               |legal aid is not usually available for this problem page|


Scenario Outline: family - problem ex-partner - financial settlement - under 18

          Given I am on the public problem page
          When I select family
          Then I am redirected to the family what do you need help with page
          When I click (family) problem with your ex-partner
          And I click (family) ex-partner financial settlement 
          And I click (family) ex-partner financial settlement Domestic abuse
          And I click (family) ex-partner financial settlement Domestic abuse Immediate Risk of harm <boolean>
          Then I verify I am on the <page> 
          Examples:
          |boolean|page                                            |
          |yes    |contact civil legal advice page                 |
          |no     |about me page                                   |  

          
Scenario Outline: family - problem ex-partner - financial settlement - family mediation

          Given I am on the public problem page
          When I select family
          Then I am redirected to the family what do you need help with page
          When I click (family) problem with your ex-partner
          And I click (family) ex-partner financial settlement 
          And I click (family) ex-partner financial settlement family mediation
          And I click (family) ex-partner financial settlement family mediation mediation started <boolean>
          Then I verify I am on the <page> 
          Examples:
          |boolean|page                                                     |
          |yes    |about me page                                            |
          |no     |you maybe able to get legal aid for family mediation page| 
          
          
Scenario: family - problem ex-partner - any other problem

          Given I am on the public problem page
          When I select family
          Then I am redirected to the family what do you need help with page
          When I click (family) problem with your ex-partner any other problem 
          Then I verify I am on the legal aid is not usually available for this problem page 
          
                                               
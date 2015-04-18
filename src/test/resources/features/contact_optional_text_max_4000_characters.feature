Feature: The max number of characters for contact situation text

Background:
           
           Giv
           Given I am on the CLA Web Contact Page
           When I enter a contact name
           And I select my preference is to call the CLA
           #And I set a valid contact number
           #And I set that the contact number is safe to save

@sprint
Scenario Outline:  Less than 4000 characters after entering mandatory fields gives no error


           And enter <number_of_characters> characters in the situation description
           And I submit details
           Then I will be redirected to the CLA Web Confirmation Page 

           Examples:
           |number_of_characters|
           #|1                   |
           #|100                 |
           #|500                 |
           |3999                 |
           |4000                 |
           #|0                   |

@sprint
Scenario Outline:  More than 4000 characters after entering mandatory fields gives no error

           And enter <number_of_characters> characters in the situation description
           And I submit details
           Then I will see an error that the maximum of characters has been exceeded

           Examples:
           |number_of_characters|
           |4001                |
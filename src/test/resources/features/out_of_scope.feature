Feature: out of scope by area of law

@todo
Scenario: areas of law excluded from civil legal aid

Given I am on the public problem page
When I select clinical negligence
And I click continue
Then I should be redirected to the clinical negligence legal advisor page

Given I am on the public problem page
When I select community care
And I click continue
Then I should be redirected to the community care legal advisor page

Given I am on the public problem page
When I select employment
And I click continue
Then I should be redirected to the employment legal advisor page

Given I am on the public problem page
When I select immigration and asylum
And I click continue
Then I should be redirected to the immigration and asylum legal advisor page

Given I am on the public problem page
When I select mental health
And I click continue
Then I should be redirected to the mental health legal advisor page

Given I am on the public problem page
When I select personal injury
And I click continue
Then I should be redirected to the personal injury legal advisor page


Given I am on the public problem page
When I select public law
And I click continue
Then I should be redirected to the public law legal advisor page

Given I am on the public problem page
When I select trouble with the police
And I click continue
Then I should be redirected to the trouble with the police legal advisor page
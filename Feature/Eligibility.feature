Feature: Testing ANZ

Scenario: Checking the functionality of the calculator 

Given User enters the URL 
Then  User click on appplication type single 
Then  User add zero dependants 
Then  User choose the property type as home to live in  
Then  User enters his income 
Then  User enters the other income 
Then  User enters the monthly expenses 
Then  User enters the current home loan monthly repayments
Then  User enters other loan monthly repayments
Then  User enters other monthly commitments
Then  User enters the total credit card limit 
And   User clicks on the button  work out how much i could borrow 

Scenario: Checking the functionality of the calculator  for second time 
When  User click on start over button it clears the form 
Then  User select on appplication type single 
Then  User  enters zero dependants 
Then  User select property type as home to live in 
Then  User enters zero annual income 
Then  User enters zero as the other income 
Then  User enters one dollar as a monthly expenses 
Then  User enters zero as current home loan monthly repayments
Then  User enters zero as the other loan monthly repayments
Then  User enters zero as the  other monthly commitments
Then  User enters  zero as the total credit card limit 
And   User select on the button  work out how much i could borrow 
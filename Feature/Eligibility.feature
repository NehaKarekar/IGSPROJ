Feature: Testing ANZ

Scenario Outline: Checking the functionality of the calculator 

Given User enters the URL 
Then  User click on appplication type single 
Then  User add zero dependants 
Then  User choose the property type as home to live in  
Then  User enters his "<income>" 
Then  User enters   "<other_income>"
Then  User enters the "<monthly_expenses>" 
Then  User enters as "<current_home_loan_monthly_repayments>"
Then  User enters as the "<other_loan_monthly_repayments>"
Then  User enters for "<other_monthly_commitments>"
Then  User enters in "<total_credit_card_limit>" 
And   User clicks on the button  work out how much i could borrow 
Examples: 
|income | other_income  | monthly_expenses | current_home_loan_monthly_repayments | other_loan_monthly_repayments | other_monthly_commitments | total_credit_card_limit |
| 80000 |  10000        |     500          |					0                           |      100                      |       0					          |     10000  						  |


Scenario Outline: Checking the functionality of the calculator  for second time 
When  User click on start over button it clears the form 
Then  User select on appplication type single 
Then  User  enters zero dependants 
Then  User select property type as home to live in 
Then  User enters zero annual "<income>" 
Then  User enters zero as the "<other_income>" 
Then  User enters one dollar as a "<monthly_expenses>" 
Then  User enters zero as "<current_home_loan_monthly_repayments>"
Then  User enters zero for the "<other_loan_monthly_repayments>"
Then  User enters zero  the  "<other_monthly_commitments>"
Then  User enters  zero in the "<total_credit_card_limit>" 
Then  User select on the button  work out how much i could borrow 
And   User captures the error message 
Examples: 
|income | other_income  | monthly_expenses | current_home_loan_monthly_repayments |other_loan_monthly_repayments | other_monthly_commitments | total_credit_card_limit |
|0      |  0            |     1            |					0                           |      0                       |       0					         |         0 					     |


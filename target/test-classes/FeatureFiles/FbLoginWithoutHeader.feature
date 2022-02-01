Feature: To validate Login Functionality in the Facebook Application
Background:
Given User have to enter fb login page
Scenario: To validate login by using valid email and invalid password
And User have to maximize the screen
When User have to enter valid email
|baaala@gmail.com|paaarani@gmail.com|dha@gmail.com|thirumalai@gmail.com|
And User have to enter invalid password
|bala|19905|parani|2005|
|dharan|java|1995|2000|
|selenium|jdk06|jar2002|junit48|
And User have to click login 

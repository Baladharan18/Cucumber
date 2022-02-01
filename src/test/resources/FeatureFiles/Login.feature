Feature: To validate Login Functionality in the Facebook Application
Background:
Given User have to enter facebook login page
Scenario: To validate login by using valid email and invalid password
And User have to maximize the window
When User have to enter valid email and invalid password
And User have to click login button
Then User have to be in invalid credentials page

Scenario Outline:
To validate bulk of datas in Username and Password field
And user need to maximise the screen
When user need to pass the username"<UserName>"
And  user need to pass the password"<Password>"
Then user have to enter login button

Examples:
|UserName|Password|
|bala@gmail.com|1990|
|parani@gmail.com|1993|
|dharan@gmail.com|2000|
|malai@gmail.com|bala2003|
|Rajan@gmail.com|rajan07|




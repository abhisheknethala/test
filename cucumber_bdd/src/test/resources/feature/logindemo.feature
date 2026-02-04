Feature:Test login functionality 
Scenario Outline: check login is succesful with

Given open the browser
And user is on website
When user enters <username> and <password>
And user clicks on login
Then user is navigated to home page

Examples:

|username|password|
|standard_user|secret_sauce|
|locked_out_user|secret_sauce|


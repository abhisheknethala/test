Feature:login to HRM application 

Background:
Given user is on login page "https://www.saucedemo.com/"
@ValidCredentials
Scenario:login with valid credentials
When user enters username as "standard_user" and password as "secret_sauce"
Then user should able to login sucessfully and new page is opened

@MissingUsername
Scenario:login with blank username
When user enters username as " " and password as "secret_sauce"
Then user should not be able to see a message "Required" below username

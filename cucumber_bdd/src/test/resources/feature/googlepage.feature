#Feature:
Feature:homepage_search
Scenario:validate google search is working
Given browser is open
And user is on google searchpage
When user enters a text in search
Then user is navigate to result

 

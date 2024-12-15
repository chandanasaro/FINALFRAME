Feature: Login of facebook application

Scenario: if user login to application homepage should be displayed

Given user is in login page
When user enters valid usn, psw
And click on login button
Then home page should be dsiplayed
And if user clicks on logout button login page should be displayed

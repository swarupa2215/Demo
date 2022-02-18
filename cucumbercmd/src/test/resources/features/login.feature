Feature: Login
Scenario: Successful Login with Valid Credentials
	Given user Launch Edge browser
	When User opens URL "http://the-internet.herokuapp.com/login"
	And User enters Username as "tomsmith" and Password as "SuperSecretPassword!"
	And Click on login
	Then Page Title should be "Secure Area"
	When User click on Log out link
	Then Page Title should be "Login Page"
	And close browser
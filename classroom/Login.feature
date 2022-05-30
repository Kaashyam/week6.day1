@login

Feature: Leaftaps login functionlity
Scenario: Login with valid credentials
#Given Open the Chrome browser
#And Load the application URL
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click the Login button
Then Login should be successful and Homepage should be displayed

@login

Feature: Leaftaps login functionlity 

Scenario Outline: Login with valid credentials 
	#Given Open the Chrome browser 
	#And Load the application URL 
	Given Enter the username as <username> 
	And Enter the password as <password> 
	When Click the Login button 
	Then Login should be successful and Homepage should be displayed 
	
	Examples: 
		|username||password|
		|'Demosalesmanager'||'crmsfa'|
		|'DemoCSR'||'crmsfa'|
		
		
Scenario: Login with invalid credentials 
	#Given Open the Chrome browser 
	#And Load the application URL 
	Given Enter the username as 'Demo' 
	And Enter the password as 'crmsfa' 
	When Click the Login button 
	But Error message should be displayed 
	

Feature: Everyone needs safe home during lockdown

Scenario Outline: Fill a form for a safe home during lockdown
Given User opens Campaigns Shelter page "https://campaigns.shelter.org.uk/tell-pm-everyone-needs-safe-home-during-lockdown"
When User fills "<Firstname>" , "<Lastname>" , "<Email>" and "<Postcode>"
And User submits the form
Then Tab "Read the email to the Prime Minister" should open up

Examples:
	|Firstname|Lastname|Email|Postcode|
	|John|Smith|testing@gmail.com|W3 6RS|
	|Jean-Luc|Picard|testingnumber123@gmail.com|HP2 7TG|
	|Mesut|Özil|testingsomethingbigemail@gmail.com|SW1A 2AA|

	
Scenario Outline: Fill negative data in form for a safe home during lockdown
Given User opens Campaigns Shelter page "https://campaigns.shelter.org.uk/tell-pm-everyone-needs-safe-home-during-lockdown"
When User fills "<Firstname>" , "<Lastname>" , "<Email>" and "<Postcode>"
And User submits the form
Then Error message should be displayed

Examples:
	|Firstname|Lastname|Email|Postcode|
	||Smith|testing@gmail.com|W3 6RS|
	|Jean-Luc||testingnumber123@gmail.com|HP2 7TG|
	|Mesut|Özil||SW1A 2AA|
	|Mesut|Özil|||
	|||||
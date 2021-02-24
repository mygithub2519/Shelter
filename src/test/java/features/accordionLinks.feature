Feature: Test Accordion Links

Scenario: Test all the accordion links on the FAQs page
Given User opens Shelter FAQs page "https://england.shelter.org.uk/support_us/events/faqs"
When User checks all the accordion links
Then Accordion Links should be expanded and collapsed
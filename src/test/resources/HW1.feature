

Scenario: Samsung scenario
Given user goes to google page
When  user searches for samsung
Then I should see {string} on the results
And closes the page
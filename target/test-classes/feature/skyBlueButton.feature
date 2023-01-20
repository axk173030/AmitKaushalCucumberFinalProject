@Feature1@Regression
Feature: Background color change validation
@Scenario0
Scenario: user should be able to change the background coclor to sky blue
Given the user is on techfios test page
When user presses the sky blue Background button
Then the background color will change to sky blue

@Scenario1
Scenario: user should be able to change the background coclor to sky blue
Given the user is on techfios test page
When user presses the sky blue Background button
Then the background color will change to sky blue
When user presses the White Background button
Then the background color will change to White




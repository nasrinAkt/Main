Feature: This is a login feature

@tag
Scenario: Verify user cannot loggin another window
Given Open <"URL"> mai
Then click mai paychex login link
Then goto next come back to first window

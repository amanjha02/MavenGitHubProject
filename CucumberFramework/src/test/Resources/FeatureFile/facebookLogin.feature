#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template

Feature: Title of your feature

Keyword summary: This test verify login functionality with valid credential

Scenario: Login in facebook with valid data
Given User Navigate to Facebook.com Page
When User enter the UserName "Usename" and "Password" in passowrd field
And Click th Login button
Then User navigate to home page and login should be Successfully.

Scenario: Login in facebook with Invalid data
Given User Navigate to Facebook.com Page
When User enter the UserName "Usename" and "Password" in passowrd field
And Click th Login button
Then User navigate to home page and login should not be Successfully.
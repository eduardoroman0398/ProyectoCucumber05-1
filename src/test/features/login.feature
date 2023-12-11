Feature: login on Madisson Store

  As a user [...]
  I want [...]
  So that [...]

  @Login
  Scenario Outline: Successfully Login with valid credential
Given user is on login page
When user enters <username> and <password>
And user click on login button
Then the dashboard option should be displayed

Examples:
| username                | password                |
| eduardoroman1@gmail.com | eduardoroman1@gmail.com |
| eduardoroman1@gmail.com | eduardoroman1@gmail.com |
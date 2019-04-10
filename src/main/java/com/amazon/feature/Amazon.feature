#Author: tripathimani4@gmail.com

Feature: Amazon automation
  


  Scenario: User login
    Given user opens browser
    Then user is at homepage
    Then user hovers at login option and clicks on login
    When user is at login page
    Then user enters <username> and <password> 
    Then user clicks on login button
    #
        #Examples: 
      #| username  | password | 
      #| wrongusername |     Nicky@143 | 
      #| tripathimani4@gmail.com | wrongpassword |
      #|tripathimani4@gmail.com| Nicky@143 | 
 
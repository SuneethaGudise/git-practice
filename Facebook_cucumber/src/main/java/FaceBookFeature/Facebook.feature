Feature: FaceBook login feature

#Scenario: FaceBook login test Scenario

#Given Open the Browser
#Then Open the Facebook page
#When User wants to login into Facebook
#Then User enters email and password
#And User has to click the login button

#Scenario: FaceBook search Scenario

#Given Search for the option 
#When Move the mouse on searchbutton

#DEFINE USERNAME AND PASSWORD HERE IN FEATUREFILE
Scenario: FaceBook login test Scenario

Given Open the Browser
Then Open the Facebook page
When User wants to login into Facebook
Then User has to give the "sunitha.gudise@gmail.com" and "kutty136"
And User has to click the login button

# WITH EXAMPLE KEYWORD
#Scenario Outline: FaceBook login test Scenario

#Given Open the Browser
#Then Open the Facebook page
#When User wants to login into Facebook
#Then User enters  the "<email>" and "<password>"
#And User has to click the login button

#Examples:
 #    | email | password |
  #   | sunitha.gudise@gmail.com | kutty136 |
   #  | kathy.dddd@gmail.com | tinku123 |
   

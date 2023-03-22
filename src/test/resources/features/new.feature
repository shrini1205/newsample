Feature:  facebook page validation 

Background: 
Given user is on facebook page

#Scenario Outline: login page  with invalid credential


#When user enter the "<username>" and "<password>"
#And user clicks on login button

#Examples:
#|username||password|
#|hello||12345678|
#|Shrini||2345678|

Scenario: fb page title validation
When user print page title


Scenario: fb page url validation 
When user print the page url
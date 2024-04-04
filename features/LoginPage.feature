Feature: AsianPaint LoginPage
 
Scenario: Logging in with valid credentials
  Given I am on the Asian Paints login page
  When I enter valid Phone number 
  And click on the submit button
  And I enter valid OTP  
  And click on the submit button
  Then I should redirect to the home page

Scenario: Logging in with Invalid credentials
  Given I am on the Asian Paints login page
  When I enter invalid Phone number
  And click on the submit button
  Then I should see an error message indicating Phone number is invalid
  

Scenario: Logging in with Invalid OTP
  Given I am on the Asian Paints login page
  When I enter the invalid OTP
  And click on the submit button
  Then I should see an error message indicating Invalid or expired OTP.please try again!
  

  Scenario: Accessing the Asian Paints Registration
  Given I am on the Asian Paints login page
  When I enter phone number as a new user
  And click on submit button
  Then I should be redirected to the register page
  

 Scenario Outline: New user Registration form
 
 Given I am on the Asian paints login page
 When I enter phone number as a new user
 And click on submit button
 Then I should be redirected to the register page
 Then I enter name as <name>
 Then I enter mail as <email>
 Then I enter otp as <otp>
 Then login should be unsuccessful
 Examples:
  |name|email|otp|
  |"Chinnu"|"chinnu2@gmail.com"|"12345"|
  |"Kusu"|"Kusu3@gmail.com"|"45678"|

  
 
  
  
  
  
  
  
  
  
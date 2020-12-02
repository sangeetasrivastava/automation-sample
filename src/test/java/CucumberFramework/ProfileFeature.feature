Feature: Test profile page

@sample
Scenario Outline: Verify few elements in profile page
 
     Given I open landingpage
     When  I enter userName '<Uname>'
     And   I enter password '<Pwd>'  
     Then  I click on 'login' button 
     And   I need more time - 5 sec 
     And   I verify the values
           | header      | Profile |
     And   I enter searchBox 'Git Pocket Guide'
     Then  I clear values for 'searchBox' 
     Then  I scroll down 
     Then  I click on 'deleteAccount' button
     Then  I click on 'cancel' button
     Then  I select '<rows>' from 'dropdownList' dropdownbox
     Then  I scroll up
     # testing  
       
       
                 Then  I click on 'logout' button
  Examples:
          |Uname        |Pwd       | rows   |
          |test@test.com|Testing12$|10 rows |
       #   |test@test.com|Testing12$|20 rows |
   
     
            
     
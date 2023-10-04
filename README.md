## Instructions 
To run the application:

At the terminal, run the following command: `gradle run`

## Customer

There are 3 types of customers:<br>

1. Customers who wishes to create an account can click on the link at the bottom of our application which says:
*"click here, to create an account

2. Customers who do not wish to create an account in our application can choose to continue as Guest:
They can do so by clicking on the link which says:
*"<Click here, to continue as guest!>*

3. Customers who already has an account and are able to log in straight after starting the application.

Note:
- Once the customer has created an account, their username and password will be stored and saved into our database, they then become
an existing user. 

- Only owner users are able to change/modify their role to become a Seller/Owner/Cashier. 


## Cashier 

Cashiers are existing users who are mainly allowed to modify the quantity of each currencies (cash reserve) available in our Vending Machine. 
At any point in time, there is a cancel button on each page on the top right hand corner which will lead the user back to the log in page. 

1. Log in using an existing Cashier account 
2. Click on any of the 3 operations that the Cashier can operate on.

3A. If cashier has clicked on *Report Available Cash*:

    -> It will produce a CSV report on the Available Cash our Vending Machine has.
    
3B. If cashier has clicked on *Summary Transaction*:

    -> It will produce a CSV report on the summary of transactions. 
    
3C. If cashier has clicked on *Modify Cash*:

    1 .The application will prompt the cashier to a new page that displays the quantity of each of the available currencies our
        Vending Machine has.
        
    2. For each of the currencies, there are up and down arrows/buttons which represent increase or decrease quantity respectively. 
    
    3. After clicking on the arrows/buttons on the currencies (if cashier wants to modify), the cashier can click on the button "Modify" at the bottom right. 
    4. The application will then lead the cashier to a page that displays "Operation Complete" that feedbacks to the cashier that the quantity of the currencies 
        has been successfully modified to the corresponding amount. At this stage, the cashier can choose to go back to the page of Operations (point 2) 
        or log out. 
        
    6. If cashier wishes to log out, they can click on the link "Click Me to log out" and the application will prompt them back to the log in page. 
    
    7. If cashier wishes to go back to the page of operations, they can click on the button on the bottom right "BACK TO OPERATION". The application will lead 
        them back to the page at point 2.
        











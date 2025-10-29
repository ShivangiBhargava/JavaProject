To handle new customer bank account requests.

1. Read a .csv file of names, social security numbers, account type, and initial deposit
2. Use a proper data structure to hold all these accounts
3. Both savings and checking accounts share the following properties:
Deposit()
Withdraw()
Transfer()
showInfo()
11 digit account number (generated with the following process: 1 or 2 depending on savings
and checking, last two digits of SSN, unique 5 digit number, and random 3 digit number)
4. Savings account holders are given a safety deposit box,identified by a 3-digit number
and accessed with a 4-digit code

5. Checking account holders are assigned a debit card with a 12-digit number and 4-digit
pin
6. Both accounts will use an interface that determines the base interest rate
Savings accounts will use .25 points less than the base rate
Checking accounts will use 15% of the base rate
7. showInfo() method should reveal relevant account information as well as information
specific to the checking account or savings account

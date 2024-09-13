# BankATM

**BankATM** is a simple yet functional ATM simulation project built in Java. It allows users to log in, check their balance, deposit money, and withdraw funds. This project serves as a basic implementation of object-oriented programming and banking system operations in Java.

## Features
- User login authentication with username and password(maximum 3 login attempts).
- View account balance.
- Deposit money into the account.
- Withdraw money with daily withdrawal limit checks.
- Easy-to-use command-line interface.

## Project Structure

- `Account.java`: Handles account details such as username, password, and balance.
- `Login.java`: Manages user login operations.
- `atmGeneral.java`: The main ATM logic where users can select actions like balance inquiry, deposit, and withdrawal.
- `Main.java`: Runs the application and initializes the ATM system.

## How to Run

1. Clone repository, Navigate, Compile and Run the project:
   ```bash
     git clone https://github.com/yourusername/BankATM.git
     cd SecureBankATM
     javac Main.java
     java Main
   ```
 ## Example Usage
 ```
Welcome to our Bank
**********************
User Login
**********************
Your Username: Aiden
Password: 123456
Login Successful
***************************
1. View Balance
2. Deposit Money
3. Withdraw Money
4. Press Q to Exit
***************************
Select an Action: 1
Your Balance: 2000.0

# Online-Banking-ATM-Simulator
##Objective
This is a Java-based ATM simulator project that allows users to perform basic banking operations such as creating an account, generating ATM numbers and PINs, depositing and withdrawing money, checking account balance, and performing fast withdrawals. The project uses MySQL as the database to store user account information and transaction data.

##Features
-Create Account: Users can create a new bank account online with a unique ATM number and PIN.
![Image](https://github.com/user-attachments/assets/a6b4103c-ba4d-49b3-a508-21a75816634e)
-Deposit Money: Users can deposit money into their bank account.
-Withdraw Money: Users can withdraw money from their account, with a limit on the withdrawal amount.
-Balance Enquiry: Users can check the current balance in their account.
-Fast Withdrawal: Users can withdraw a predefined amount (e.g., $100) instantly from their account.

##Technologies Used
Java: For the core application and ATM operations.
MySQL: For storing user data, ATM numbers, PINs, and transaction history.
JDBC: For connecting Java with the MySQL database.

##Set up the database
create database bankmanagementsystem;
show databases;
use bankmanagementsystem;
create table signup (formno varchar(20),name varchar(20),father_name varchar(20),dob varchar(20),gender varchar(20),email varchar(30),marrital varchar(20),address varchar(40),city varchar(20),pincode varchar(20),state varchar(20));
drop table signup2;
show tables;
select * from signup2;
USE bankmanagementsystem;
create table signup2 (formno varchar(20),religion varchar(20),Catagory varchar(20),incometextfield varchar(20),Educational varchar(20),Ocupation varchar(30),pan varchar(20),Adhar varchar(40),seniorcitizen varchar(20),Existing varchar(20));
drop table bank;
create table signup3 (formno varchar(20),type varchar(20),cardnumber varchar(40),pinnumber varchar(20),facility varchar(20));
select * from signup3;
drop table bank;
create table login (formno varchar(20),cardnumber varchar(40),pinnumber varchar(20));
select * from login;
DESCRIBE login;
create table bank (pinnumber varchar(10),date varchar(50), type varchar(20),amount varchar(20));
select * from bank;

##Usage
Create a new account:
Enter your personal details to create a new bank account, which will generate an ATM number and PIN.
Log in to the ATM:
Enter your ATM number and PIN to access your account.
Perform transactions:
Deposit money into your account.
Withdraw money (with limits applied).
Check your account balance.
Use the fast withdrawal feature for quick access to cash.

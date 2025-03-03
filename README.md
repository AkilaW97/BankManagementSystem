# Bank Management System

A Java-based Bank Management System that demonstrates Object-Oriented Programming (OOP) principles, multithreading, exception handling, and logging.

---

## Features

- **Account Management**:
    - Create and manage bank accounts (savings and current accounts).
    - Perform deposits and withdrawals.
    - Calculate interest for savings accounts.
- **Bank Management**:
    - Add and manage multiple accounts.
    - Find accounts by account number.
    - Display all accounts.
- **Concurrent Transactions**:
    - Simulate multiple users performing transactions simultaneously using threads.
- **Error Handling**:
    - Handle invalid transactions (e.g., negative amounts, insufficient balance).
    - Prevent duplicate account numbers using custom exceptions.
- **Logging**:
    - Track transactions and errors using Java's built-in logging framework.

---

## Technologies Used

- **Java**: Core programming language.
- **OOP Concepts**: Encapsulation, Inheritance, Polymorphism, Abstraction.
- **Multithreading**: Simulate concurrent transactions.
- **Exception Handling**: Custom exceptions for invalid operations.
- **Logging**: Java's `java.util.logging` framework.

---

## Classes and Interfaces

1. **Account**:
    - Represents a bank account with attributes like account number, holder name, and balance.
    - Supports deposits and withdrawals.

2. **Bank**:
    - Manages multiple accounts using an `ArrayList`.
    - Provides methods to add, find, and display accounts.

3. **SavingsAccount**:
    - Inherits from `Account`.
    - Enforces a minimum balance rule for withdrawals.
    - Calculates and adds interest to the balance.

4. **CurrentAccount**:
    - Inherits from `Account`.
    - Allows withdrawals up to an overdraft limit.

5. **DuplicateAccountException**:
    - Custom exception to handle duplicate account numbers.

6. **InterestBearing**:
    - Interface for accounts that earn interest (e.g., `SavingsAccount`).

7. **TransactionThread**:
    - Simulates concurrent transactions using threads.

8. **Main**:
    - Entry point for the application.
    - Demonstrates the functionality of the system.

---

## How to Run the Project

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/BankManagementSystem.git

2. **Open the Project**:
Open the project in your favorite IDE (e.g., IntelliJ IDEA, Eclipse).

3. **Run the Application**:
Run the Main class to see the Bank Management System in action
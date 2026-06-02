# 🏧 ATM System - Java OOP Project

A simple **ATM System** built using Java that simulates basic banking operations such as depositing money, withdrawing money, and checking account balance.
The project demonstrates core **Object-Oriented Programming (OOP)** principles.

---

## 🚀 Features

* 💰 Deposit money into account
* 💸 Withdraw money with validation
* 📊 Check current balance
* ❌ Handle invalid inputs
* 🚫 Prevent overdraft (Insufficient balance check)
* 🔁 Menu-driven console interface

---

## 🧠 OOP Concepts Used

This project is designed to demonstrate:

* **Encapsulation** → `balance` is private inside `BankAccount`
* **Abstraction** → Using `Account` and `ATMService` interfaces
* **Polymorphism** → Using interface references instead of concrete classes
* **Dependency Injection** → Passing objects through constructors
* **Loose Coupling** → ATM depends on interfaces not implementations

---

## 🏗️ Project Structure

```
src/
│
├── Account.java
├── BankAccount.java
├── ATMService.java
├── ATMServiceImpl.java
├── ATM.java
└── Main.java
```

---

## ▶️ How to Run

1. Clone the repository:

```bash
git clone <repo-link>
```

2. Open the project in **IntelliJ IDEA** or any Java IDE.

3. Run `Main.java`.

---

## 🖥️ Program Flow Example

### 📌 Check Balance

```
===== ATM MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter choice: 3
Current Balance: 1000.0
```

---

### 📌 Deposit Money

```
Enter choice: 1
Enter amount: 4000
Deposit successful.
```

---

### 📌 After Deposit

```
Enter choice: 3
Current Balance: 5000.0
```

---

### 📌 Withdraw Money

```
Enter choice: 2
Enter amount: 5000
Withdrawal successful.
```

---

### 📌 Balance After Withdrawal

```
Enter choice: 3
Current Balance: 0.0
```

---

### 📌 Insufficient Balance Handling

```
Enter choice: 2
Enter amount: 1000
Insufficient balance!
```

---

## 📸 Screenshots

> Add your screenshots here after running the program

```
![ATM Menu](screenshots/menu.png)

![Deposit Example](screenshots/deposit.png)

![Withdraw Example](screenshots/withdraw.png)
```

---

## 📌 Example Output (Full Flow)

```
===== ATM MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter choice: 3
Current Balance: 1000.0

Enter choice: 1
Enter amount: 4000
Deposit successful.

Enter choice: 3
Current Balance: 5000.0

Enter choice: 2
Enter amount: 5000
Withdrawal successful.

Enter choice: 3
Current Balance: 0.0

Enter choice: 2
Enter amount: 1000
Insufficient balance!
```

---

## 👨‍💻 Author

* Name: Hussein Elsayed
* Project: ATM System (Java OOP)
* Purpose: Practice OOP + Design Structure

---

## ⭐ Future Improvements

* Add multiple accounts
* Add login system (PIN)
* Save data to file or database
* GUI version (JavaFX / Swing)

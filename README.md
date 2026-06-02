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

<img width="705" height="218" alt="Screenshot 2026-06-02 223426" src="https://github.com/user-attachments/assets/680281ad-42fb-4eff-bf08-8f4339f1991c" />


---

### 📌 Deposit Money
<img width="670" height="472" alt="Screenshot 2026-06-02 223522" src="https://github.com/user-attachments/assets/0b8db777-084d-406b-96c8-b7285c1b10f7" />

---

### 📌 Withdraw Money

<img width="687" height="461" alt="Screenshot 2026-06-02 223610" src="https://github.com/user-attachments/assets/1c310c33-3993-4dec-8432-667fb03f5a61" />

---

### 📌 Insufficient Balance Handling
<img width="555" height="246" alt="Screenshot 2026-06-02 223629" src="https://github.com/user-attachments/assets/b8981e52-1576-4e38-a533-99f5e0a00fe3" />


---


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

---
## ⭐ Future Improvements

* Add multiple accounts
* Add login system (PIN)
* Save data to file or database
* GUI version (JavaFX / Swing)

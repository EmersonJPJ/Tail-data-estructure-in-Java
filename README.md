# Circular Queue Management System

## 🚀 Project Overview

This project implements a **Circular Queue Management System** using Java. It is designed to handle customer orders in a structured manner, ensuring efficient queue management through a **circular linked list**. The system provides essential operations like adding, removing, searching, and modifying customer orders dynamically.

## 📌 Features

- **Enqueue (Take Order)**: Adds a new customer order to the queue.
- **Dequeue (Attend Customer)**: Processes and removes the customer order from the queue.
- **Display Orders**: Shows all current orders in the queue.
- **Order Management**: Lists orders in an ascending manner.
- **Search Order**: Finds a specific order in the queue.
- **Modify Order**: Updates an existing order.

## 🛠️ Technologies Used

- **Java**: Core programming language.
- **Swing (JOptionPane)**: Used for GUI interactions.
- **Data Structures**: Circular linked list implementation for queue operations.

## 📂 Project Structure

```
📦 CircularQueueManagement
 ┣ 📜 Principal.java       # Main entry point
 ┣ 📜 Nodo.java            # Node structure for the queue
 ┣ 📜 Menu.java            # GUI-based menu for user interactions
 ┣ 📜 Dato.java            # Data model for storing customer orders
 ┗ 📜 Cola.java            # Circular queue logic
```

## ⚙️ How It Works

### 1️⃣ Initialization
The system starts by displaying a menu where the user can choose different queue operations.

### 2️⃣ Adding Orders
Each customer is assigned an order number, stored in the circular queue.

### 3️⃣ Attending Customers
Orders are processed in a **FIFO (First-In, First-Out)** manner, ensuring fair handling.

### 4️⃣ Searching & Modifying Orders
Users can search for specific orders and update them dynamically within the queue.

## 💡 Why This Project is Interesting

- **Demonstrates Circular Linked List Concepts** 🌀
- **Interactive UI with JOptionPane** 🖥️
- **Efficient Order Processing System** ⚡
- **Good for Interview Preparation & Portfolio** 💼

## 📖 Example Usage

```java
Cola queue = new Cola();
queue.tomarOrden(); // Adds a new order
queue.atenderCliente(); // Attends a customer
queue.mostrar(); // Displays all orders
```

## 🏆 Future Improvements
- Implement a **Graphical User Interface (GUI)** for better user experience.
- Add **database integration** to store orders permanently.
- Introduce **priority queue** for VIP customers.

---

## 🤝 Contributing

**Contributions are welcome!** Feel free to fork and improve the project. 🚀

---


## ✨ Contact  

Feel free to reach out for any questions or suggestions!  

- 📧 **Email**: emerson04vade@gmail.com  
- 💻 **GitHub**: EmersonJPJ

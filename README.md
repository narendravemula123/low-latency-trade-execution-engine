# Low-Latency Trade Execution Engine

## 🚀 Overview
A high-performance trade execution engine built using Java to simulate real-time order matching in financial systems. The system efficiently processes buy and sell orders using optimized data structures and executes trades based on strict price-time priority, similar to real-world exchange systems.

## ⭐ Key Features
- Price-time priority based matching using heap-backed priority queues  
- Efficient order book management for buy and sell sides  
- Supports partial order fills and remaining quantity updates  
- Deterministic trade execution ensuring consistent results  
- Handles edge cases such as unmatched orders and invalid inputs  

## ⚙️ Tech Stack
- **Language:** Java  
- **Core Concepts:** Priority Queues (Heap), Object-Oriented Design, Algorithm Optimization  
- **System Focus:** Low-Latency Processing, Efficient Order Matching  

## 🧱 System Design Highlights
- Separate order books for buy and sell orders using priority queues  
- Buy orders sorted in descending price, sell orders in ascending price  
- Matching engine processes incoming orders in real-time  
- Designed to minimize latency and maximize execution efficiency  

## 🧠 Design Approach
- Incoming orders are inserted into respective priority queues  
- Matching logic compares top buy and sell orders  
- Trades are executed when price conditions are satisfied  
- Partial matches update remaining quantities dynamically  
- Ensures consistent and deterministic execution flow  

## 🔄 Example Flow
1. A buy order and sell order are submitted to the system  
2. Orders are added to respective order books  
3. Matching engine evaluates price compatibility  
4. Trade is executed if buy price ≥ sell price  
5. Remaining quantities are updated for partial matches  

## 📚 Key Learnings
- Designing low-latency systems using efficient data structures  
- Implementing price-time priority in matching algorithms  
- Handling edge cases in transactional workflows  
- Building systems inspired by real-world trading engines  

## 🎯 Motivation
This project was built to understand how real-world trading systems operate internally, focusing on order matching, execution efficiency, and system design principles used in financial exchanges.

## 📁 Project Structure


```
src/
- model/Order.java
- orderbook/OrderBook.java
- engine/MatchingEngine.java
- app/Main.java
```


## ▶️ How to Run
1. Clone the repository  
2. Compile the Java files  
3. Run the main class to simulate order execution  

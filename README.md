# Low-Latency Trade Execution Engine

## Overview
A high-performance trade execution engine built using Java to simulate real-time order matching. The system efficiently processes buy and sell orders while enforcing price-time priority and ensuring consistent execution under concurrent workloads.

## Key Features
- Heap-based priority queue for order management with price-time priority
- Thread-safe order matching using concurrent processing techniques
- Supports partial fills, order cancellations, and invalid input handling
- Ensures deterministic and consistent trade execution

## Tech Stack
- Java
- Data Structures (Heap / Priority Queue)
- Concurrency & Multithreading

## System Design Highlights
- Designed for low-latency execution of orders
- Uses synchronized data structures to prevent race conditions
- Efficient handling of multiple concurrent order requests

## Design Approach
- Maintains separate buy and sell order books using priority queues
- Matches orders based on price-time priority rules
- Uses synchronized operations to ensure thread safety during execution
- Processes incoming orders deterministically to maintain consistency

## Example Flow
1. A buy order and sell order are submitted to the system  
2. Orders are inserted into respective priority queues  
3. Matching engine evaluates price compatibility  
4. Orders are executed based on price-time priority  
5. Partial fills and remaining quantities are updated accordingly  

## Key Learnings
- Handling concurrency and avoiding race conditions
- Designing efficient order matching systems using data structures
- Managing real-world edge cases in transactional workflows

## Motivation
This project was built to understand how real-world trading systems handle concurrency, order prioritization, and low-latency execution using efficient data structures and system design principles.

## Project Structure
src/
├── Order.java
├── OrderBook.java
├── MatchingEngine.java
├── Main.java


## How to Run
1. Clone the repository  
2. Compile the Java files  
3. Run the main class to simulate order execution  

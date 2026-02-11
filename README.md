# S1.03 — Java Collections

## 🎯 Objectives
The main goal of this task is to master Java collections and their fundamental operations:
- **Collection Management**: Creating and modifying collections using `ArrayList`, `HashSet`, and `HashMap`.
- **Iteration Patterns**: Implementing efficient data traversal using `ListIterator` and `Iterator`.
- **Data Integrity**: Handling duplicate elements and object comparison logic.
- **Ordering**: Practicing object sorting through `Comparable` and `Comparator` interfaces.
- **File I/O**: Reading from and writing to external files for data persistence.

## 📌 Level 1
- **Exercise 1 — Month List**: Managing an `ArrayList` of months, ensuring correct insertion order, and converting to `HashSet` to verify uniqueness.
- **Exercise 2 — Reverse List**: Using `ListIterator` to reverse the elements of a list into a new one.
- **Exercise 3 — Capital Game**: Implementing a game that reads country-capital pairs from a file, stores them in a `HashMap`, and tracks user scores.

## 🛠️ Technologies
- Java 21
- IntelliJ IDEA
- Git & GitHub
- Maven

## 🚀 Installation and Execution

1. **📂Clone the repository**:
   ```bash
   git clone https://github.com/carlasalmeron/S1.03-Java-Collections.git
   ```
2. **Setup environment**: Ensure you have Java 21 installed.
3. **Execution**:
   The project uses Maven. To run a specific exercise, navigate to the `Level.1` folder and use the following commands:

   ```bash
   # Navigate to the project folder
   cd Level.1

   # Compile the project
   mvn clean compile

   # Run a specific task (e.g., Task 1)
   mvn exec:java -Dexec.mainClass="Task1.Main"
   ```

   *Manual compilation (if Maven is not in PATH):*
   ```cmd
   # From inside the Level.1 folder
   javac -d bin src/main/java/Task1/*.java
   java -cp bin Task1.Main
   ```
4. **Tests**: Manual verification via the interactive menus and file output checks.

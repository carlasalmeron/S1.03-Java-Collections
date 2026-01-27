# S1.03 – Java Collections #
### 🎯 Objectives ###

The main goal of this task is to practice working with Java collections and related concepts:

Creating and modifying collections using ArrayList, HashSet, HashMap and ListIterator

Handling duplicate elements and object comparison

Practicing object sorting (Comparable and Comparator)

Reading from and writing to files

Implementing simple menus and user interaction

## 📌 Level 1 ##
### Exercise 1 – Duplicates ###

Create a class named Month with an attribute name to store the name of the month. Add 11 Month objects to an ArrayList, leaving out August. Then insert this month in its correct position and verify that the order of the months is correct.

Next, convert the ArrayList into a HashSet and confirm that duplicate elements are not allowed. Finally, iterate over the collection using both a for loop and an Iterator.

### Exercise 2 – ListIterator ###

Create and populate a List. Then create a second list and insert the same elements but in reverse order. Use a ListIterator to read the elements from the first list and add them to the second one.

### Exercise 3 – Capital Game ###

Using the countries.txt file (see resources section), which contains country–capital pairs separated by commas, read all the data and store it in a HashMap<String, String>, where the key is the country name and the value is its capital.

Once the data is loaded, the program should ask for the user’s name and start the game.

The game consists of 10 questions. In each round, a different country is selected randomly from the HashMap, and the user must enter its capital. If the answer is correct (case sensitivity may be considered if needed), one point is added to the score. After the 10 questions, the final score is displayed.

At the end of the game, the program saves the user’s name and score in a file called classificacio.txt.

## 🛠️ Technologies ##

IntelliJ IDEA

Java 25

Git & GitHub

# Skill Swap

## Student Skill Management System Using Linked List and Binary Search Tree (BST)

### Project Description

Skill Swap is a Java-based console application that helps students register their skills and search for other students who possess specific skills. The project demonstrates the practical implementation of fundamental data structures including Linked Lists and Binary Search Trees (BST).

The system stores student information using a Linked List and organizes skills in a BST to provide efficient searching and matching of students based on their skills.

---

## Features

* Add new students
* Store multiple skills for each student
* Search students by skill
* Display all registered students
* Fast skill matching using Binary Search Tree (BST)
* Console-based user interface

---

## Data Structures Used

### Linked List

Used to store student records.

Each student contains:

* Student ID
* Student Name
* List of Skills

### Binary Search Tree (BST)

Used for efficient skill searching.

Each BST node contains:

* Skill Name
* List of Students possessing that skill

---

## Project Workflow

1. User enters student information.
2. Student details are stored in a Linked List.
3. Student skills are inserted into a Binary Search Tree.
4. Users can search for a skill.
5. The system displays all students who have that skill.

---

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Linked List
* Binary Search Tree (BST)
* IntelliJ IDEA
* Git & GitHub

---

## Menu Options

```text
===== Student Skill Finder =====

1. Add Student
2. Search Students By Skill
3. Display All Students
4. Exit
```

---

## Example

### Adding a Student

Student ID: 101

Student Name: Ali

Skills:

* Java
* Python
* SQL

### Searching for a Skill

Search: Python

Output:

```text
Students having skill: Python

ID: 101, Name: Ali
ID: 102, Name: Ahmed
```

---

## Time Complexity

| Operation             | Complexity       |
| --------------------- | ---------------- |
| Add Student           | O(n)             |
| Insert Skill into BST | O(log n) Average |
| Search Skill          | O(log n) Average |
| Display Students      | O(n)             |

---

## Future Enhancements

* GUI using Java Swing or JavaFX
* Database Integration (MySQL)
* User Authentication
* Course Recommendation System
* Skill Endorsement Feature
* Balanced BST (AVL Tree)
* File Handling for Persistent Storage

---

## Learning Outcomes

This project demonstrates:

* Linked List Implementation
* Binary Search Tree Operations
* Searching Algorithms
* Java Collections Framework
* Object-Oriented Programming Concepts
* Git and GitHub Version Control

---

## Author

**Sehar Fatima**

Data Structures Project

---

## License

This project is intended for educational and learning purposes.


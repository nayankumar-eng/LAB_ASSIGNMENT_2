Student Management System

Object-Oriented Concepts
Abstract Class (Person)

Contains common fields (name, email) and abstract method displayInfo().

Forces subclasses to implement common behavior.

Inheritance (Student extends Person)

Student class inherits fields and methods from Person.

Implements displayInfo() method (method overriding).

Interface Implementation
RecordActions interface

Declares CRUD operations: addStudent(), deleteStudent(), updateStudent(), searchStudent(), viewAllStudents().

StudentManager implements the interface to manage student records.

Polymorphism
Method Overriding

Student overrides abstract displayInfo() from Person.

StudentManager implements interface methods.

Method Overloading

Student has displayInfo() and displayInfo(boolean includeMarks) demonstrating static polymorphism.

Data Management
Map (HashMap<Integer, Student>)

Stores students with roll number as key for fast lookup.

Prevents duplicate roll numbers.

Final Class & Method
FinalNote class

Declared final so it cannot be inherited.

Contains a final method display() that cannot be overridden.

finalize() method demonstrates cleanup before object is garbage collected.

Modular Design
Classes can be organized into packages (model, service) for better code organization.

Main application (StudentManagementSystem) interacts with StudentManager for operations.

Sample Data & Functionality
Students Added:

Roll No 101: Ankit, B.Tech, 85 marks → Grade B

Roll No 102: Riya, M.Tech, 92 marks → Grade A

Demonstrates display, overloaded display, and final class usage.

Learning Outcomes
Understand inheritance, abstract classes, and interfaces.

Apply method overloading and overriding for polymorphism.

Implement a menu-less modular system with CRUD operations.

Manage data efficiently using collections (HashMap).

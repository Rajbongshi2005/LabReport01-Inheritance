# LabReport01-Inheritance

## 🎯 Objectives
- Understand the concept of **Inheritance** in Java  
- Learn how **method overriding** works  
- Demonstrate **code reusability** using parent and child classes  
------

## 📖 Theory
Inheritance is an Object-Oriented Programming (OOP) mechanism where a child class
acquires the properties and behaviors of a parent class.  
It allows developers to reuse existing code, reduce redundancy, and create a
hierarchical relationship between classes.

### Example
If an `Animal` class contains methods like `eat()` and `sleep()`, a `Dog` class that
inherits from `Animal` will automatically have access to those methods.

### Advantages of Inheritance
- Code reusability  
- Saves time and effort  
- Organized and structured code  
- Extensibility  
- Data hiding and security  
- Improved reliability  

---

## 🧩 Design (UML Overview):


<img width="633" height="569" alt="image" src="https://github.com/user-attachments/assets/0d4100c7-769c-43c7-9a0c-c4be789f8703" />

---------

## 💻 Implementation:

https://github.com/Rajbongshi2005/LabReport01-Inheritance.git



####6.TEST RESULT:
<img width="744" height="284" alt="image" src="https://github.com/user-attachments/assets/bf9fb162-2be7-447b-9188-d84f97f8933a" />


####ANALYSIS AND DISCUSSION:

The main objective of this experiment was to understand Encapsulation in Java
OOP and to apply it practically through a real-life example. For this purpose, a
BankAccount class was designed, where all important data members were declared
as private. As a result, the internal data of the class cannot be directly accessed or
modified from any external class. During the implementation of the program, it was observed that Encapsulation
plays a vital role in ensuring data security and maintaining data integrity. For
example, the balance variable cannot be modified directly from the main method. Instead, the balance must be updated through the setBalance() method, where any
negative input value is automatically rejected. This demonstrates that
Encapsulation ensures data validation and prevents invalid inputs. Furthermore, the program highlights another important aspect of Encapsulation—
maintainability and flexibility. If the internal logic of the BankAccount class is
changed in the future (such as adding transaction history or modifying balance
calculation rules), no changes will be required in the external code as long as the
structure of the public methods remains unchanged.
In conclusion, the use of Encapsulation has provided the program with a well- organized and modular structure. Each BankAccount object functions as a self- contained unit, making the code easier to understand, debug, and extend in the
future. From this analysis, it is clearly evident that Encapsulation is a crucial OOP
principle that is essential for developing secure, reliable, and maintainable software.

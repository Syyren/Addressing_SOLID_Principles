# Addressing **SOLID** Principles

## Introduction

In CPRO2221 Java EE programming, we have covered the application and reasoning for **SOLID** principles to be followed in our code. 
These core concepts allow for stronger, more modular, and cleaner code overall allowing for easy maintainability amongst other things. 
In my project, I have implemented three out of five of these **SOLID** principles.
These three principles are the Single Responsibility Principle (SRP), the Open Closed Principle (OCP), and the Liskov's Substitution Principle (LSP).

## Single Responsibility Principle (SRP)

### Defining the SOLID Principle

In essence, the Single Responsibilty Principle states that a class should have only one reason to change.
By giving a given class more responsibilities, you're giving it more opportunities to break this SRP principle and the less independant a given class will be.

### The Entity

The focus of this principle is handling a Cat entity and checking its values as one might expect to see at a vet or diagnosing problems online.

### Violations

**Violating Code**

In the `violated/SRP` package there is a single `Cat` class.

The `Cat` class contains all of the class attributes and also the class methods:
  - `isHealthyWeight()`
  - `calculateSize()`

**The Problem**

By containing these methods within the Cat class we will run into coupling issues if either of these methods ever need to change or if new 
methods get implemented that interact poorly or even break with the established ones.

### Solution

**Adjustments**

In the `solution/SRP` package the God class has been broken down into three seperate classes.

The `Cat` class now contains only attributes and it functions as a data structure.
The `CatSizer` class contains the `calculateSize()` method.
The `CatWeightEvaluator` class contains the `isHealthyWeight()` method.

**Why**

Changing the code to fit the Single Responsibility Principle ensures that the code stays independant and won't break when a module is adjusted.
This is massively important for code flexibility and maintenance.



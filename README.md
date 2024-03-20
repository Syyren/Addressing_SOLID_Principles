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

## Open Closed Principle (OCP)

### Defining the SOLID Principle

The Open Closed Principle means that a a given artifact within your software needs to be *open* to be expanded upon
and *closed* as far as modifying it is concerned. Basically, this principle denotes the idea that your software should be capable
of extension inherently and without source code modification.

### The Entity

The focus of this principle is handling an inventory that holds weapon entities and armor entities.

### Violations

**Violating Code**

In the `violated/OCP` package there is an `Inventory`, `Armor`, and `Weapon` class.

The `Inventory` class contains a list of Armors and Weapons as class attributes and also the class methods:
  - `addWeapon()`
  - `getWeapon()`
  - `addArmor()`
  - `getArmor()`

The 'Weapon' and 'Armor' classes are similar to one another with both being tied to a `damage (int)` or `protection (int)` attribute respectively both with getters.

**The Problem**

What happens if we want to define specific types of weapons and armors? Suddenly if I want to make spears, swords, shields or plate mail I run into issues with needing to change the `Armor` or `Weapon` class and it all gets very messy.

### Solution

**Adjustments**

In the `solution/OCP` package the `Armor` and `Weapon` classes have been turned into Interfaces and I have introduced four new classes.
The new classes are the `Sword`, `Shield`, `Spear`, and `PlateMail` classes.

The `Inventory` class is unchanged as it can still contain a list of `Weapon`s and `Armor` thanks to these interfaces.

The `Armor` and `Weapon` interfaces contain only the `getProtection()` and `getDamage()` empty methods now respectfully.

The `Sword`, `Shield`, `Spear`, and `PlateMail` classes extend their respective interfaces and contain their individual class attributes.

**Why**

The addition of new weapons and armors are as simple as making new classes that extend the interfaces now. This opens up
a ton of potential for expandability and it means the source code really doesn't have to be modified at all. Having these interfaces
also means that the code is much more robust and less error-prone.

## Liskov's Substitution Principle (LSP)

### Defining the SOLID Principle

Liskov's Substitution Principle states, in plain english, that a child class should never have an inherited method from its parent
that it cannot implement. The reasoning for this is pretty simple, invalid data and extraneous or altered return types on inherited methods are dirty code.

### The Entity

The entities for this principle are a fast food restaurant and sit down restaurant class that both inherit methods from a parent restauraunt wait time class.

### Violations

**Violating Code**

In the `violated/LSP` package the relevant classes are the `FastFoodRestaurant`, `SitDownRestaurant`, and `RestaurantWaitTime`.

The `RestaurantWaitTime` class contains a series of class methods:
  - `getDriveTime()`
  - `getLineTime()`
  - `tableAssignment()`
  - `tableTime()`

The 'FastFoodRestaurant' and 'SitDownRestaurant' both implement this parent class and use different methods from it. `FastFoodRestaurant` uses the `getDriveTime()` and `getLineTime()` methods, while the `SitDownRestaurant` uses the `tableAssignment()`
and `tableTime()` methods.

**The Problem**

This code is messy. Despite `RestaurantWaitTime` being a parent class that does in fact work for these two restaurant types, the code is not clean and there are invalid methods being inherited by both child classes.

### Solution

**Adjustments**

In the `solution/LSP` package the `RestaurantWaitTime` class has been broken down into two new classes: `FastFoodWaitTime` and `SitDownWaitTime`.
On top of this, I have implemented an `IRestaurant` interface for both child classes to implement.

The `FastFoodRestaurant` and `SitDownRestaurant` classes remain mostly unchanged with the exception of the addition of the interface and changing of their parent class.

`FastFoodWaitTime` contains the methods:
  - `getDriveTime()`
  - `getLineTime()`

`SitDownWaitTime` contains the methods:
  - `tableAssignment()`
  - `tableTime()`

**Why**

Clean code is extremely important. It makes debugging, reading and expanding on your code base much, much easier. Messy code and unhandled or overwritten imports can and will lead to errors and maintenance issues.

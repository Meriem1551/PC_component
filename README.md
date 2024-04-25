# Final-PA-oop[PC_ components]
 <h2>Table of content</h2>
 
1. [Introduction](#introduction)
2. [Usage](#usage)
3. [Explaining code](#explaining_code)
     - UC class
     - Type class
     - MN class
     - KB class
     - PRQ class
     - PC class
     - Main class
     - ConsoException
5. [Author](#author)

-------------------------------------------------


# Introduction <a name="introduction"></a>


Welcome to the PC Configuration Repository!

This repository contains an implementation of a PC configuration system in Java. A PC (Personal Computer) consists of various components, including a Central Processing Unit (UC) and a set of peripherals. Each peripheral is characterized by its ID, model, and has a method to calculate its power consumption.

The main types of peripherals in this system are keyboards (Clavier) and monitors (Moniteur). Keyboards have a constant power consumption, while the power consumption of monitors is calculated based on their class of consumption, dimension, and maximum resolution.

In this repository, you'll find:

- Implementation of the PC configuration system based on the provided description.
- A constructor to initialize a PC object with another PC object.
- A method to calculate the power consumption of a PC based on its total power and operating duration.
- Definition of a custom exception class, ConsoException, which is thrown when the power consumption exceeds a predefined threshold.
- A Test class to demonstrate the configuration of a PC and display its power consumption for a specified duration.
Feel free to explore the implementation and test out different PC configurations!

# Usage <a name="usage"></a>
Clone this repo or fork it to your machine and try it yourself

```bash
git clone https://github.com/Meriem1551/PC_component.git
```
# Explaining code <a name="explaining_code"></a>
<h4>UC class</h4>
Properties:

- CPU Frequency: Specifies the frequency of the CPU in megahertz (MHz).
- RAM Capacity: Indicates the capacity of the RAM in gigabytes (GB).
- Power Consumption: Represents the power consumption of the central unit in watts (W). for example 5W

Constructor:

to initialize those properties

getUCpuiss():

It returns the first letter in the puiss attribut after onverting it to a double

Double.parseDouble(): methode of Double class in java that takes a string in format of numbers ("126873") and convert it to double.

puiss.subString(0, 1): taking the subString from position 0 to 1 excluded of puiss which it's 5.

<h5>Example usage</h5>

```java
UC centralUnit = new UC(256, 16, "10W");
```
<h4>Type class</h4>

The Type class serves as a base class for different types of peripherals in the PC configuration system. It encapsulates common properties and behaviors shared among all peripheral types.

Properties:

- ID: An integer value representing the unique identifier of the peripheral.
- Model: A string representing the model name or number of the peripheral.

Constructor:
The Type class provides a constructor to initialize a peripheral with the specified ID and model.

Methods:

CalculerPuissance(): A method to calculate the power consumption of the peripheral. This method is overridden in subclasses to provide specific power calculation logic for each peripheral type.

<h5>Example usage</h5>

```java
Type peripheral = new Type(12345, "Example Model");
double power = peripheral.CalculerPuissance();
```
<h4>MN class</h4>

The MN class represents a monitor peripheral in the PC configuration system. It extends the Type class and adds specific properties and behavior related to monitors.

Properties:

- Class Consumption (class_cons): An integer representing the class of consumption of the monitor.
- Dimension (dim): An integer representing the dimension of the monitor.
 -Maximum Resolution (resol_max): An integer representing the maximum resolution of the monitor.
  
Constructor:
The MN class provides a constructor to initialize a monitor with the specified ID, model, class consumption, dimension, and maximum resolution.

Method Override:

CalculerPuissance(): Overrides the CalculerPuissance() method from the base Type class to provide specific power calculation logic for monitors. It calculates the power consumption based on the class consumption, dimension, and maximum resolution of the monitor.

<h5>Example usage</h5>

```java
MN monitor = new MN(11345, "Dell U2719D", 2, 18, 1700);
double power = monitor.CalculerPuissance();
```

<h4>KB class </h4>

The KB class represents a keyboard peripheral in the PC configuration system. It extends the Type class and adds specific properties and behavior related to keyboards.

Properties:
- Number of Touches (NBTouches): An integer representing the number of keys on the keyboard.
- Keyboard Power (KBpuiss): A string representing the power consumption of the keyboard.
  
Constructor:
The KB class provides a constructor to initialize a keyboard with the specified ID, model, number of touches, and keyboard power.

Method Override:

CalculerPuissance(): Overrides the CalculerPuissance() method from the base Type class to provide specific power calculation logic for keyboards. It calculates the power consumption based on the keyboard power.

<h5>Example Usage</h5>

```java
KB keyboard = new KB(234654, "Logitech K780", 102, "5W");
double power = keyboard.CalculerPuissance();
```

<h4>PRQ class</h4>

The PRQ class represents a collection of peripherals in the PC configuration system. It encapsulates an array of Type objects representing various peripherals connected to the PC.

Properties:

- Peripherals Array (peripheriques): An array of Type objects representing the connected peripherals.
- Maximum Size (max_size): An integer representing the maximum number of peripherals that can be stored in the array.

Constructor:
The PRQ class provides a constructor to initialize a peripheral collection with the specified maximum size.

Methods:

- addPer(Type per): Adds a peripheral to the collection. If the array is not full, the peripheral is added to the next available slot in the array.
- puissance_total_per(): Calculates the total power consumption of all peripherals in the collection by invoking the CalculerPuissance() method for each peripheral and summing the results.
  
<h5>Example Usage</h5>

```java
PRQ peripherals = new PRQ(2);
peripherals.addPer(monitor);
peripherals.addPer(keyboard);
double totalPower = peripherals.puissance_total_per();
```

<h4>PC class</h4>

The PC class represents a personal computer configuration in the PC configuration system. It encapsulates a central unit (UC) and a collection of peripherals (PRQ), and provides methods to calculate power consumption and handle exceptions.

Properties:

- Central Unit (unite_centrale): An object of the UC class representing the central processing unit of the PC.
- Peripheral Collection (p): An object of the PRQ class representing the collection of peripherals connected to the PC.
  
Constructor:
The PC class provides a constructor to initialize a PC configuration with the specified central unit and peripheral collection.

Methods:

calConsoElec(int nbhours): Calculates the total power consumption of the PC based on the power consumption of the central unit and peripherals, and the operating duration in hours. It throws a ConsoException if the power consumption exceeds a predefined threshold

<h5>Example usage</h5>

```java
UC centralUnit = new UC(256, 16, "10W");
PRQ peripherals = new PRQ(2);
peripherals.addPer(monitor);
peripherals.addPer(keyboard);

PC pc0 = new PC(centralUnit, peripherals);
double powerConsumption = pc0.calConsoElec(5);
```

<h4>Main class</h4>
Main is the pricipal class where we test our code.
It creates a pc configuration with central unit, keyboard and monitor, and calculating its power consumption

<h4>ConsoException</h4>

The ConsoException class represents a custom exception type extands from Exception used to handle cases of power consumptiond. It is thrown when the calculated power consumption exceeds 1000 watts.

Properties:
None.
Constructor:

The ConsoException class provides a constructor to create a new exception object with a specified error message.

super(): call the super class's constructor.

<h5>Example usage</h5>

```java
try {
    // Calculate power consumption for 5 hours
    double powerConsumption = pc0.calConsoElec(5);
    System.out.println("Power consumption of PC: " + powerConsumption + " watts");
} catch (ConsoException e) {
    System.out.println("Error: " + e.getMessage());
}
```

getMessage(): is a getter in the super class Exception that return the message passed in the constructor.

# Author<a name = "author"></a>

Meriem Boussaid

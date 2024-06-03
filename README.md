# Calculator Application

This repository contains a simple calculator application built using Java and Object-Oriented Programming (OOP) principles. The application allows users to perform basic arithmetic operations such as addition, subtraction, and multiplication.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Features](#features)

## Installation

To run this application, you need to have Java Development Kit (JDK) installed on your system.

1. Clone the repository:
    ```bash
    git clone https://github.com/adelaidebonfamille/calculatoroop.git
    cd calculatoroop
    ```

2. Compile the Java files:
    ```bash
    javac -d bin src/kalkulator/*.java
    ```

3. Run the application:
    ```bash
    java -cp bin kalkulator.Kalkulator
    ```

## Usage

1. The calculator application will open in a window.
2. Use the buttons to input numbers and select operations (addition, subtraction, multiplication).
3. Press the equals button to see the result of the operation.


### Kalkulator.java

This is the main class that handles the core functionality of the calculator. It includes:

- `Kalkulator`: The constructor initializes the operands and the current operation.
- `reset()`: Resets the calculator state.
- `tambahkan(long op)`: Prepares the addition operation.
- `kurangkan(long op)`: Prepares the subtraction operation.
- `eksekusiOperasi(long op)`: Executes the current operation and returns the result.
- `main(String[] args)`: Sets the look and feel of the UI and initializes the calculator frame.

### KalkulatorFrame.java

This class extends `JFrame` and handles the user interface of the calculator, including buttons, display, and event handling.

## Features

- **Basic Arithmetic Operations**: Perform addition, subtraction, and multiplication.
- **Graphical User Interface**: User-friendly interface built with Swing.
- **Reset Functionality**: Easily reset the calculator to its initial state.

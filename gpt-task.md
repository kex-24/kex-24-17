# Create Your Own Disney Adventure

## Deadline
This assignment should be completed before the next scheduled lab session.

## Instructions
For instructions on how to complete and submit assignments, please refer to the [assignments section of the course instructions](https://example.com/course-instructions#assignments).

## Preparation

- Complete all questions in Module 2: [Looking Inside Classes](https://example.com/sections/module2).
- Access the OLI material:
  - Via Canvas (see [OLI Torus SE](https://example-canvas.com/courses/41415/external_tools/4247) link in the left menu)
  - Or directly at [this webpage](https://example.com/module2/material)

>Note: The OLI material and tasks might slightly differ this year, so it's ok to read ahead if needed.

## Learning Goals

This week's goals are to familiarize yourself with:
* Designing and implementing Java classes
* Defining and using instance fields and methods
* Understanding and applying constructors
* Manipulating object state with getters and setters
* Practicing encapsulation and understanding its significance in OOP
* Applying the `main` method in test classes
* Exploring the concepts of scope and variable shadowing

## Troubleshooting Guide

For questions or problems:
1. Check the [posted issues](https://example.com/help/issues) to see if others have similar queries.
2. If not, create a [New Issue](https://example.com/help/issues/new) with a descriptive title.
3. Ask a TA during the [weekly lab](https://schedule.com/INDA). Refer to your schedule for the next lab timing.

Discussion with peers is encouraged, but do not share your solutions.

## Assignment: Your Disney Adventure

### Task 1: Begin Your Adventure

Create a new Java file named `DisneyCharacter.java` in the `src` folder to house your `DisneyCharacter` class. This class will enable us to create objects representing characters in the Disney universe.

Initially, let's script our first Disney adventure in the `main` method:
- Create a character named "Mickey Mouse"
- Assign attributes like `int` energy, `int` happiness, and `boolean` isVillain
- Print out these attributes to ensure everything is set up correctly.

### Task 2: Crafting More Characters

With a single character created, it's time to explore more of the Disney realm by creating additional characters. However, manual creation quickly becomes tedious and error-prone.

To streamline this process, we shift towards using Java's object-oriented features. First, transition from declaring character attributes in the `main` method to establishing them as class fields. This transition is crucial for managing multiple characters efficiently.

### Task 3: Embracing Encapsulation

Encapsulation is a cornerstone of effective object-oriented programming. Start by setting your character attribute access modifiers to `private`. Introduce *getters* and *setters* for controlled access to these attributes.

With appropriately defined *getters* and *setters*, our next step is constructing Disney characters more elegantly. Implement a constructor for the `DisneyCharacter` class, enabling the quick creation of rich character objects.

### Task 4: Testing your Characters

Expand your assembly of characters by utilizing the constructor method. Develop a method, `printCharacterInfo()`, that neatly prints out the character's details. This leverages encapsulation while making code more readable and maintainable.

### Task 5: Interaction and Adventures

Disney characters often interact in their adventures. Implement an `interact` method allowing characters to influence each other's attributes, such as energy or happiness. Follow the guidelines for method creation, focusing on parameter passing and method return types.

### Task 6: Dive Deeper into Object Oriented Concepts

- Explore the concept of **variable shadowing** by creating problematic code examples similar to the provided ones. Discuss potential fixes and the importance of the `this` keyword in resolving name conflicts within classes.

## Checklist 

- Transition from manual attribute definition to class fields for Disney characters.
- Implement *getters* and *setters* for character fields.
- Utilize a constructor for efficient character instantiation.
- Develop a `printCharacterInfo()` method for cleaner information display.
- Create an `interact` method to depict character interactions.
- Understand and apply the concept of variable shadowing in classes.

## Bugs and Errors

Should you encounter any inconsistencies or errors, please open a [New Issue](https://example.com/help/issues/new) titled "Task Error: [Brief Error Summary]". Contributions towards improving the exercise will be acknowledged in the acknowledgments section.

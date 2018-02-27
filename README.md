# Software Specification and Designed pattern

## Software Process

[See Software Process folder](https://github.com/thitgorn/SSD-midterm-preparation/tree/master/SoftwareProcess)

## Designed Pattern
- Observer
- Singleton
- Flyweight
  - load everything first then user call it later (no new creation)
- Composite

[UML diagram of these designed pattern](https://github.com/thitgorn/SSD-midterm-preparation/tree/master/DesignPattern)

## Use case
- what are the step that user do to use our system.
  - example
    - Player start the game
    - Player roll the dice
    - If dice face more than 3 , player win

## Domain model
- find noun
- use noun try to create the relation between them

example
<img src='./images/Domain-model.jpg' width="100%" height="auto"/>

## UML Class Diagram
- try to fill attribute and method from Domain model

some of notation

<img src='./images/UML-Connectors.gif' width="50%" height="auto"/>

Inheritance
  - extends

Dependency
  - Do some thing in method

Aggregation
  - aggregation (City, Tree, Car) "sub objects" (Tree, Car) will NOT be destroyed when City is destroyed.

Containment
  - composition (Person, Heart, Hand), "sub objects" (Heart, Hand) will be destroyed as soon as Person is destroyed.

Association
  - have attribute of

Directed Association
  - Player have weapon

Realization
  - Implements

## Sequence Diagram
- diagram that show timeline of each code

some of notation

[<b>See at SequenceDiagram.pdf</b>](https://github.com/thitgorn/SSD-midterm-preparation/blob/master/SequenceDiagram.pdf)

## Review OOP
- Different types of classes in Java Objects and there default methods
- Inheritance
  - Extends ( child class get their super methods )
- Interface
  - Implements something
- Common classes in Java such as List, Set, Map
  - List<int> i = new ArrayList<>();
  - Set setA = new HashSet();
  - Map<key,value> map = new HashMap<>();

Observer Pattern
===
>observer - defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

### Some Design principle

---
>Strive for **loosely coupled**[^1] designs between objects that interact.

### Project Description

---
It is a Weather Application where **WeatherData** class notify to its observers (Two Screen) when its data changed. 

[^1]: Loose coupling is an approach to interconnecting the components in a system or network so that those components, also called elements, depend on each other to the least extent practicable. Coupling refers to the degree of direct knowledge that one element has of another.

The goal of a loose coupling architecture is to reduce the risk that a change made within one element will create unanticipated changes within other elements.
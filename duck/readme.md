Strategy Pattern
======
```
The strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
```

```
Strategy lets the algorithm vary independently of clients that use it.
```

### Some Design Principles

----
1.  Identify the aspects of your application that vary and separate them from what stays the same.
2.  Program to an **_interface_** not an implementation.
3.  Favor **compose**[^1] over **inheritance**. 

### Application description

---
We built a SimuDuck application using strategy design pattern.
At first, we encapsulate the behavior of duck class as behavior varies. Then we program 2 superType or interface and implement them on different behavior class.
After that we used composition in our program kto built a **Has-A** relation between class as they can be changeable on runtime.

[^1]: **Composition** in java is a design technique to implement has-a relationship in classes 
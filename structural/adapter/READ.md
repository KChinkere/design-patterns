<h1>Adapter Design Pattern</h1>
The Adapter Design Pattern is a structural design pattern that allows incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces by converting the interface of a class into another interface that the client expects.

It is especially useful when you want to reuse existing classes, but their interfaces are not compatible with the rest of the system. The adapter wraps an existing class and provides a different interface that is expected by the client.

<h2>Key Concepts: </h2>

1. ***Target Interface:***
    : This is the interface expected by the client. The adapter will convert requests from the client to this interface. 

2. ***Adapter:***
    : This is the class that implements the Target Interface and adapts the Adaptee (existing class) to the client.

3. ***Adaptee:***
    : This is the existing class with an incompatible interface. It needs to be adapted for the client to use it.

4. ***Client:***
    : The class that uses the Target Interface to interact with the system.

<h2>Intent:</h2>

1. ***Convert incompatible interfaces:***
    : It makes two otherwise incompatible interfaces compatible by converting one interface into another.

2. ***Reuse existing functionality:***
    : Adapter pattern allows the reuse of existing functionality without modifying the source code of existing classes.

<h2>Why Use the Adapter Pattern:</h2>

- You want to integrate an existing component but its interface is not compatible with the system you're working on.


- You have several classes with different interfaces, and you need to unify their interfaces to work seamlessly in the system.


- You want to reuse a legacy system that doesn't follow modern design, but rewriting it is not an option.

<h2>Real-World Examples:</h2>

- ***Adapters in Electrical Devices:***
    : A plug adapter allows a device from one country (which may have a different plug shape) to fit into a power socket in another country.

- ***Software Libraries:***
    : A wrapper library around third-party software to provide a more convenient API for your system while still using the third-party's functionality.

- ***Media Players:***
    : A media player may play multiple formats (MP3, MP4, etc.), but each format has its own way of being played. An adapter can be used to allow a single interface to play all media formats.
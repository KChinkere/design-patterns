<h1>Command Design Pattern</h1>
The Command Design Pattern is a behavioral design pattern that turns a request into a stand-alone object containing all the information about the request, such as the method to call, the method's arguments, and the object that should perform the action. This pattern decouples the sender of the request from its receiver, making it easy to create reusable, configurable, and extensible commands.


<h2>Key Concepts:</h2>

1. ***Command:***
    : An interface that declares the method to execute the action.

2. ***Concrete Command:***
    : A class that implements the Command interface and contains the details of how the action should be performed.

3. ***Invoker:***
    : The object that triggers the command. It doesn’t need to know what the command does; it just calls the command’s execution method.

4. ***Receiver:***
    : The object that actually performs the action. The command will call methods on this object to perform the request.

5. ***Client:***
    :  The client creates the command object and configures the invoker with it.


<h2>Intent:</h2>

- ***Encapsulate a request as an object:*** 
    : This allows you to parameterize objects with operations, queue requests, and support undoable operations.


- ***Decouple the sender from the receiver:***
    : The sender does not need to know how the action is performed, allowing for more flexibility.

 
- ***Promote extensibility:***
    : New commands can be easily added without modifying existing code.


<h2>Why Use the Command Pattern:</h2>

- You need to parameterize objects with operations (e.g., a button click can execute different commands).


- You need to queue operations or log them for undoable actions.


- You want to decouple the invoker of an action from the action itself, allowing commands to be reused and combined in flexible ways.


<h2>Real-World Examples:</h2>

- ***GUI Buttons:***
    : Each button on a user interface can be wired to different commands (like opening a file, closing a window).


- ***Task Scheduling:***
    : A task scheduler can store a command object and execute it later.


- ***Undo/Redo Operations:***
    : Each command can be stored in a history and later reversed for undo functionality.



<h2>Conclusion</h2>
The Command Design Pattern is ideal for decoupling the sender of a request from the receiver and for creating reusable and flexible commands. It makes code more modular, enabling complex functionality such as undo operations, logging of requests, and combining multiple commands into one.
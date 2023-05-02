Calling Methods
When we add a non-static method to a class, it becomes available to use on an object of that class. In order to have our methods get executed, we must call the method on the object we created.

Let’s add a non-static startEngine() method to our Car class from the previous lesson. Inside the main() method, we’ll call startEngine() on the myFastCar object:

Code generally runs in a top-down order where code execution starts at the top of a program and ends at the bottom of a program; however, methods are ignored by the compiler unless they are being called.

When a method is called, the compiler executes every statement contained within the method. Once all method instructions are executed, the top-down order of execution continues. This is why Starting the car! and Vroom! are outputted before That was one fast car!.
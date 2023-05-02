Now that our constructor has a parameter, we must pass values into the method call. These values are referred to as arguments; once they are passed in,
they will be used to give the instance fields initial value.

We pass the String value "red" to our constructor method call: new Car("red");.

The type of the value given to the invocation must match the type declared by the parameter.

Inside the constructor, the parameter carColor refers to the value passed in during the invocation: "red". This value is assigned to the instance field color.

color has already been declared, so we don’t specify the type during assignment.

The object, ferrari, holds the state of color as an instance field referencing the value "red".
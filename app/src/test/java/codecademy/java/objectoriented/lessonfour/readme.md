ur last exercise ended with printing an instance of Store, which looked something like Store@6bc7c054. The first part, Store, refers to the class, and the second part @6bc7c054 refers to the instance’s location in the computer’s memory.

We don’t care about memory location, but our instances have no other characteristics! When an object is created, the constructor sets the initial state of the object. The state is made up of associated data that represents the characteristics of an object.

We’ll add data to an object by introducing instance variables, or instance fields.

We want Car instances of different colors, so we declare a String color instance field. Often times, instance variables are described as a “has-a” relationship with the object. For example, a Car “has-a” color. Another way to think of this is that instance variables are the nouns and adjectives associated with an object. What qualities other than color might a car have?
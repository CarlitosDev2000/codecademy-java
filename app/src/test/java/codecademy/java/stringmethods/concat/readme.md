he concat() method concatenates one string to the end of another string. Concatenation is the operation of joining two strings together.

Suppose we have a String called str1 and another String called str2, using str1.concat(str2) would return str1 with str2 appended to the end of it.

For example:

String name = new String("Code");

name = name.concat("cademy");

System.out.println(name);
Codecademy would be printed.

Strings are immutable objects which means that String methods, like concat() do not actually change a String object.

Our variable, name holds a reference to the String object, "Code". When we use concat() on name, we changed its value so that it references a new object — "Code", combined with the String literal, "cademy".

Suppose we do something slightly different. We’ll use concat() on name without reassigning its value:

String name = "Code";

name.concat("cademy");

System.out.println(name);
Code would be printed instead. The value of the String can’t change! Instead, we create a new object and need to assign that new object to some variable.
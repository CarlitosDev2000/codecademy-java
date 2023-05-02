The charAt() method returns the character located at a String‘s specified index.

For example:

String str = "qwer";

System.out.println(str.charAt(2));
It would output e because that’s what’s at index 2. (Once again, indices start with 0.)

Suppose we try to return the character located at index 4. It would produce an IndexOutOfBoundsException error because index 4 is out of str‘s range:

java.lang.StringIndexOutOfBoundsException: String index out of range: 4 (osea me va avisar que  no hay el caracter extra y me va a salir error por que no existe pues .)
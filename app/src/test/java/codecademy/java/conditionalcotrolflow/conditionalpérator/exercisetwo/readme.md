On some occasions, the compiler can determine the truth 
value of a logical expression by only evaluating the first boolean operand;
this is known as short-circuited evaluation. Short-circuited evaluation only works
with expressions that use && or ||.

In an expression that uses ||, the resulting value will be
true as long as one of the operands has a true value.
If the first operand of an expression is true, we don’t need 
to see what the value of the other operand is to know 
that the final value will also be true.

For example, we can run the following code without error despite dividing 
a number by 0 in the second operand because the first operand had
a true value:
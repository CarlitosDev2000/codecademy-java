An alternative to chaining if-then-else conditions together is to use the switch statement. This conditional will check a given value against any number of conditions and run
the code block where there is a match.

This example enrolls the student in History class by checking the value contained in the parentheses, course, against each of the case labels. If the value after the case label matches the value within the parentheses, the switch block is run.

In the above example, course references the string "History", which matches case "History":.

When no value matches, the default block runs. Think of this as the else equivalent.

Switch blocks are different than other code blocks because they are not marked by curly braces and we use the break keyword to exit the switch statement.

Without break, code below the matching case label is run, including code under other case labels, which is rarely the desired behavior.
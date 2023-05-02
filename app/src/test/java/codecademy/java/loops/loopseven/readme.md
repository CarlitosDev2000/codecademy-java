If we ever want to exit a loop before it finishes all its iterations or want to skip one of the iterations, we can use the break and continue keywords.

The break keyword is used to exit, or break, a loop. Once break is executed, the loop will stop iterating. For example:

for (int i = 0; i < 10; i++) {
System.out.println(i);
if (i == 4) {
break;
}
}
Even though the loop was set to iterate until the condition i < 10 is false, the above code will output the following because we used break:
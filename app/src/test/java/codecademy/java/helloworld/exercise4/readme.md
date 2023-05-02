Fortunately, we’re not limited to writing syntax that performs a task. We can also write comments, notes to human readers of our code. These comments are not executed, so there’s no need for valid syntax within a comment.

When comments are short we use the single-line syntax: //.

When comments are long we use the multi-line syntax: /* and */.

Another type of commenting option is the Javadoc comment which is represented by /** and */. Javadoc comments are used to create documentation for APIs (Application Programming Interfaces). When writing Javadoc comments, remember that they will eventually be used in the documentation that your users might read, so make sure to be especially thoughtful when writing these comments.

Javadoc comments are typically written before the declaration of fields, methods, and classes (which we’ll cover later in this course):


Comments are different from printing to the screen, when we use System.out.println(). These comments won’t show up in our terminal, they’re only for people who read our code in the text editor.
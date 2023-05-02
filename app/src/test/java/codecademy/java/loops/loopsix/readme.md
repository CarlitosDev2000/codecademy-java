One common pattern we’ll encounter as a programmer is traversing, or looping, through a list of data and doing something with each item. In Java, that list would be an array or ArrayList and the loop could be a for loop. But wait, how does this work?

In order to traverse an array or ArrayList using a loop, we must find a way to access each element via its index. We may recall that for loops are created with a counter variable. We can use that counter to track the index of the current element as we iterate over the list of data.

Because the first index in an array or ArrayList is 0, the counter would begin with a value of 0 and increment until the end of the list. So we can increment through the array or ArrayList using its indices.
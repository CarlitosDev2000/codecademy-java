With arrays, we can use bracket notation to access a value at a particular index:

double[] ratings = {3.2, 2.5, 1.7};

System.out.println(ratings[1]);
This code prints 2.5, the value at index 1 of the array.

For ArrayLists, bracket notation won’t work. Instead, we use the method get() to access an index:

ArrayList<String> shoppingCart = new ArrayList<String>();

shoppingCart.add("Trench Coat");
shoppingCart.add("Tweed Houndstooth Hat");
shoppingCart.add("Magnifying Glass");

System.out.println(shoppingCart.get(2));
This code prints "Magnifying Glass", which is the value at index 2 of the ArrayList.
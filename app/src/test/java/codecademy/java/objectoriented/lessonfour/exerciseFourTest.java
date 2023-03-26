package codecademy.java.objectoriented.lessonfour;

public class exerciseFourTest {
    String productType;

    // constructor method
    public exerciseFourTest() {
        System.out.println("I am inside the constructor method.");
    }

    // main method
    public static void main(String[] args) {
        System.out.println("This code is inside the main method.");

        exerciseFourTest lemonadeStand = new exerciseFourTest();

        System.out.println(lemonadeStand);
    }
}

package codecademy.java.objectoriented.lessonthree;

public class exerciseThreeTest {
    public exerciseThreeTest() {
        System.out.println("I am inside the constructor method.");
    }

    // main method is where we create instances!
    public static void main(String[] args) {
        System.out.println("Start of the main method.");

        // create the instance below
        exerciseThreeTest lemonadeStand = new exerciseThreeTest();
        // print the instance below
        System.out.println(lemonadeStand);
    }
}

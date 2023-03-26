package codecademy.java.objectoriented.lessonsix;

public class exerciseSixTest {
    // instance fields
    String productType;

    // constructor method
    public exerciseSixTest(String product) {
        productType = product;
    }

    // main method
    public static void main(String[] args) {
        exerciseSixTest lemonadeStand = new exerciseSixTest("lemonade");

        System.out.println(lemonadeStand.productType);

    }
}

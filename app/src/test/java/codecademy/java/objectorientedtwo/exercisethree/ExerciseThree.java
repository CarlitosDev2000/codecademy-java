package codecademy.java.objectorientedtwo.exercisethree;

public class ExerciseThree {
    // instance fields
    String productType;

    // constructor method
    public ExerciseThree(String product) {
        productType = product;
    }

    // advertise method
    public void advertise() {
        System.out.println("Selling " + productType + "!");
        System.out.println("Come spend some money!");
    }

    // main method
    public static void main(String[] args) {
        ExerciseThree lemonadeStand = new ExerciseThree("Lemonade");
        lemonadeStand.advertise();
        lemonadeStand.advertise();
        lemonadeStand.advertise();


    }
}

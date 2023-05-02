package codecademy.java.objectorientedtwo.exercisefive;

public class ExerciseFive {
    // instance fields
    String productType;

    // constructor method
    public ExerciseFive(String product) {
        productType = product;
    }

    // advertise method
    public void advertise() {
        String message = "Selling " + productType + "!";
        System.out.println(message);
    }
    public void greetCustomer(String customer){
        System.out.println("Welcome to the store, " + customer + "!");
    }

    // main method
    public static void main(String[] args) {
        ExerciseFive lemonadeStand = new ExerciseFive("Lemonade");
        lemonadeStand.greetCustomer("Laura");
    }
}

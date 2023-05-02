package codecademy.java.objectorientedtwo.exercisesix;

public class ExerciseSix {
    // instance fields
    String productType;
    double price;

    // constructor method
    public ExerciseSix(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    // main method
    public static void main(String[] args) {
        ExerciseSix lemonadeStand = new ExerciseSix("Lemonade", 3.75);
        lemonadeStand.increasePrice(1.5);
        System.out.println(lemonadeStand.price);
    }
}

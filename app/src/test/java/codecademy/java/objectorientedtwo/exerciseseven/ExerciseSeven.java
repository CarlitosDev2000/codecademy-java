package codecademy.java.objectorientedtwo.exerciseseven;

public class ExerciseSeven {
    // instance fields
    String productType;
    double price;

    // constructor method
    public ExerciseSeven(String product, double initialPrice) {
        productType = product; //se concierte en otro stings
        price = initialPrice;//se convierte en otro double
    }

    // increase price method
    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    // get price with tax method
    public double getPriceWithTax(){
        double tax = 0.08;
        double totalPrice = price + price * tax;
        return totalPrice;
    }
    // main method
    public static void main(String[] args) {
        ExerciseSeven lemonadeStand = new ExerciseSeven("Lemonade", 3.75);
        double lemonadePrice = lemonadeStand.getPriceWithTax();
        System.out.println(lemonadePrice);
        System.out.println();
    }
}

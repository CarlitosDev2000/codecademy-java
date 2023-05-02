package codecademy.java.objectorientedtwo.exerciseeight;

public class ExerciseEight {
    // instance fields
    String productType;
    double price;

    // constructor method
    public ExerciseEight(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    // get price with tax method
    public double getPriceWithTax(){
        double tax = 0.08;
        double totalPrice = price + price*tax;
        return totalPrice;
    }
    public String toString(){
        return "This store sells " + productType + " at a price of " + price + ".";
    }
    // main method
    public static void main(String[] args) {
        ExerciseEight lemonadeStand = new ExerciseEight("Lemonade", 3.75);
        ExerciseEight cookieShop = new ExerciseEight("Cookies", 5);
        System.out.println(lemonadeStand);
        System.out.println(cookieShop);
    }
}

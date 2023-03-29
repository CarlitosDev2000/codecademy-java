package codecademy.java.objectorientedtwo.exercisefour;

public class ExerciseFour {
    // instance fields
    String productType;

    // constructor method
    public ExerciseFour(String product) {
        productType = product;
    }

    // advertise method
    public void advertise() {
        String message = "Selling " + productType + "!";
        System.out.println(message);
    }

    // main method
    public static void main(String[] args) {
        String cookie = "Cookies";
        ExerciseFour cookieShop = new ExerciseFour(cookie);

        cookieShop.advertise();

    }
}

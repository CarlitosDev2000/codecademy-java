package codecademy.java.objectoriented.lessonseven;

public class exerciseSevenTest {
    String productType;
    int inventoryCount;
    double inventoryPrice;
    // constructor method
    public exerciseSevenTest(String product, int count, double price) {
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;

    }

    // main method
    public static void main(String[] args) {
        exerciseSevenTest cookieShop = new exerciseSevenTest("cookies", 12, 3.75);

    }
}



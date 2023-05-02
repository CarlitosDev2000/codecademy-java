package codecademy.java.objectoriented.lessoneight;

public class exerciseEightTest {
    String breed;
    boolean hasOwner;
    int age;

    public exerciseEightTest(String dogBreed, boolean dogOwned, int dogYears) {
        System.out.println("Constructor invoked!");
        breed = dogBreed;
        hasOwner = dogOwned;
        age = dogYears;
    }

    public static void main(String[] args) {
        System.out.println("Main method started");
        exerciseEightTest fido = new exerciseEightTest("poodle", false, 4);
        exerciseEightTest nunzio = new exerciseEightTest("shiba inu", true, 12);
        boolean isFidoOlder = fido.age > nunzio.age;
        int totalDogYears = nunzio.age + fido.age;
        System.out.println("Two dogs created: a " + fido.breed + " and a " + nunzio.breed);
        System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
        System.out.println("The total age of the dogs is: " + totalDogYears);
        System.out.println("Main method finished");
    }
}

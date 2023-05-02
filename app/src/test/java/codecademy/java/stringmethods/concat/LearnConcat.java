package codecademy.java.stringmethods.concat;

public class LearnConcat {
    public static void main(String[] args) {

        // Add your first names:
        String firstName = "Carlos";
        String lastName = " Cordova";

        // What's the full name?
        firstName = firstName.concat(" Augusto");
        lastName = lastName.concat(" Perez");
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(firstName.concat(lastName));
    }
}

package codecademy.java.loops.looptwo;
import  java.util.Random;
public class LoopTwo {
    public static void main(String[] args) {

        // Creating a random number generator
        Random randomGenerator = new Random();

        // Generate a number between 1 and 6
        int dieRoll = randomGenerator.nextInt(6) + 1;

        // Repeat while roll isn't 5
        while (dieRoll != 5) {
            System.out.println(dieRoll);
        }
    }
}

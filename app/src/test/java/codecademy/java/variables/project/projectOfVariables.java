package codecademy.java.variables.project;

public class projectOfVariables {
    public static void main(String[] args) {
        int myNumber = 6;
        // la variable de tipo integer llamada my number tiene el numero original de valor de 2
        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;

        System.out.println(stepSix);

    }
}

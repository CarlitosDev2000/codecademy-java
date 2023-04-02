package codecademy.java.objectorientedtwo;

public class ProjectOne {
    public ProjectOne(){

    }
    public int add(int a, int b){
        return a + b;
    }
    public int subtract(int a, int b){
        return a - b;
    }
    public int multiply(int a, int b){
        return a * b;
    }
    public double divide(int a, int b){
        return a / b;
    }
    public double modulo(int a, int b){
        return a % b;
    }
    public static void main (String args[]){
        ProjectOne myCalculator = new ProjectOne();

        System.out.println(myCalculator.subtract(34,11));
        /* invoque la clase substract para que cumpla su funcion con el calculator*/

        System.out.println(myCalculator.modulo(34,11));

        System.out.println(myCalculator.divide(34,11));

        System.out.println(myCalculator.add(34,11));

        System.out.println(myCalculator.multiply(34,11));
    }
}

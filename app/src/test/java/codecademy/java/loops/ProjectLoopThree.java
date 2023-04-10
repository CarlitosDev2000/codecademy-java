package codecademy.java.loops;
import java.util.ArrayList;
public class ProjectLoopThree {

    // Add your methods here:
    public  static boolean ProjectLoopThree(int number){
        //body

        if ( number > 1 ){
            for (int i=2; i < number; i++){
                if (number % i == 0){
                    return false;
                }
            }
            return true;
        }else {
            return false;
        }
    }

    public ArrayList<Integer> onlyPrimes(int[] numbers){
        ArrayList<Integer> primes = new ArrayList<Integer>();

        for(int i : numbers){
            if (ProjectLoopThree(i) == true){
                primes.add(i);
            }
        }
        return primes;
    }


    public static void main(String[] args) {

        ProjectLoopThree pd = new ProjectLoopThree();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

        //pasa a ser :
        // System.out.println(pd.isPrime(7));
        //System.out.println(pd.isPrime(28));
        //System.out.println(pd.isPrime(2));
        //System.out.println(pd.isPrime(0));


        System.out.println(pd.onlyPrimes(numbers));
    }

}

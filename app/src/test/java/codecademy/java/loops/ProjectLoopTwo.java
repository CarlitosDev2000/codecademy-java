package codecademy.java.loops;

public class ProjectLoopTwo {
    public boolean isPrime(int number){
        //body

        if (number > 1){
            for (int i = 2; i < number; i++){
                if (number % i == 0){
                    return false;
                }
            }
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        ProjectLoopTwo pd = new ProjectLoopTwo();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

    }

}

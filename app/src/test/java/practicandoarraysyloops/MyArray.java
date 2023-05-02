package practicandoarraysyloops;
import java.util.Arrays;
public class MyArray {
  public static void main(String[] args) {


    Object[] firstArray = new Object[5];
    firstArray[0] = 10;
    firstArray[1] = true;
    firstArray[2] = 'a';
    firstArray[3] = 12365123;
    firstArray[4] = new Object[]{1, "hola", true};

    System.out.println(((Object[]) firstArray[4])[1]);
    System.out.println(firstArray[3]);
  }
}




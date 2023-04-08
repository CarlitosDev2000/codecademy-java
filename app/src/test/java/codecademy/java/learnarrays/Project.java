package codecademy.java.learnarrays;

public class Project {
    public static void main(String[] args) {

        Object[] letters = {'A','B','C','D','E','F',3};

        System.out.println(letters[letters.length-1]);
        for (Object c:letters){
            System.out.println(c);
        }
    }
}

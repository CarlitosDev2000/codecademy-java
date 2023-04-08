package codecademy.java.learnarrays.arraysthree;
import  java.util.Arrays;
public class ArraysThree {
    public ArraysThree(){

    }

    public String[] getTopics(){
        String[] topics = {"Opinion", "Tech", "Science", "Health"};
        return topics;
    }


    public static void main(String[] args){
        ArraysThree sampleFeed = new ArraysThree();
        String[] topics = sampleFeed.getTopics();
        System.out.println(topics);

    }

}

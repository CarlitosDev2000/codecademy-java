package codecademy.java.learnarrays.arrayssix;

public class ArraysSix {

    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    int[] views = {0, 0, 0, 0};

    public ArraysSix(){

    }

    public String[] getTopics(){
        return topics;
    }

    public int getNumTopics(){
        return topics.length;
    }

    public static void main(String[] args){
        ArraysSix sampleFeed = new ArraysSix();

        System.out.println("The number of topics is "+ sampleFeed.getNumTopics());

    }
}

package codecademy.java.learnarrays.arraystwo;

public class ArraysTwo {
    public ArraysTwo(){

    }

    // Create getTopics() below:
    public String[] getTopics(){
        String[] topics =  {"Opinion", "Tech", "Science", "Health"};
        return topics;
    }

    public static void main(String[] args){
        ArraysTwo sampleFeed = new ArraysTwo();

        String[] topics = sampleFeed.getTopics();
        System.out.println(topics);

    }
}

package codecademy.java.learnarrays.arrayseven;
import java.util.Arrays;
public class ArraySeven {

    String[] topics;

    public ArraySeven(String[] initialTopics) {
        topics = initialTopics;
    }

    public static void main(String[] args) {
        ArraySeven feed;
        if (args[0].equals("Robot")) {

            String[] robotTopics = {"Oil", "Parts", "Algorithms", "Love"};
            feed = new ArraySeven(robotTopics);



        } else if(args[0].equals("Human")) {

            String[] humanTopics = {"Politics", "Science", "Sports", "Love"};
            feed = new ArraySeven(humanTopics);

        } else {
            String[] genericTopics = {"Opinion", "Tech", "Science", "Health"};
            feed = new ArraySeven(genericTopics);
        }

        System.out.println("The topics in this feed are:");
        System.out.println(Arrays.toString(feed.topics));
    }
}

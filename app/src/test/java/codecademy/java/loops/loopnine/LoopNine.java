package codecademy.java.loops.loopnine;
import java.util.ArrayList;
public class LoopNine {
    public static ArrayList<String> LoopNine(ArrayList<String> lunchBox) {
        // Add your code below
        for (int i = 0; i < lunchBox.size(); i++) {
            if (lunchBox.get(i) == "ant"){
                lunchBox.remove(lunchBox.get(i));
                i--;
            }
        }
        return lunchBox;

    }

    public static void main(String[] args) {
        ArrayList<String> lunchContainer = new ArrayList<String>();
        lunchContainer.add("apple");
        lunchContainer.add("ant");
        lunchContainer.add("ant");
        lunchContainer.add("sandwich");
        lunchContainer.add("ant");
        lunchContainer = LoopNine(lunchContainer);
        System.out.println(lunchContainer);

    }
}

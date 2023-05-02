package codecademy.java.arrayslist.exercisenine;
import java.util.ArrayList;
public class Playlist {
    public static void main(String[] args) {

        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

        desertIslandPlaylist.add("Song1");
        desertIslandPlaylist.add("Song2");
        desertIslandPlaylist.add("Song3");
        desertIslandPlaylist.add("Song4");
        desertIslandPlaylist.add("Song5");
        desertIslandPlaylist.add("Song6");

        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());

        desertIslandPlaylist.remove("Song1");
        System.out.println(desertIslandPlaylist);

        int indexA = desertIslandPlaylist.indexOf("Song3");
        int indexB = desertIslandPlaylist.indexOf("Song5");

        String tempA = "Song3";

        desertIslandPlaylist.set(indexA,"Song5");
        System.out.println(desertIslandPlaylist);

        desertIslandPlaylist.set(indexB,tempA);
        System.out.println(desertIslandPlaylist);




    }
}

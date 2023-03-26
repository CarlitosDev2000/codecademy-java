package codecademy.java.variables.madlibs;

public class ExerciseNineTest {
    public static void main(String[] args){
        String name1 = "Carlos";

        String adjective1 = "academic";
        String adjective2 = "big";
        String adjective3 = "small";

        String verb1 = "ball";
        String noun1 = "pc";
        String noun2 = "games";
        String noun3 = "pieces";
        String noun4 = "ball";
        String noun5 = "notebook";
        String noun6 = " movie";

        String name2 = "Carla";

        int number = 3;
        String place1 = "venecia";



        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);
    }
}

package caveofprogramming.java.classesandobjects;


class robot{
    public void speak(String text){
        System.out.println(text);
    }
    public void jump(int height){
        System.out.println("Jumping: " + height);
    }
    public void move(String direction, double distance){
        System.out.println("Moving " + distance + " meters in direction " + direction );

    }
}
public class MethodParameters {
    public static void main(String[] args) {
        robot misael = new robot();

        misael.speak("Hola soy Misael");
        misael.jump(8);
        misael.move("west", 12.2);

        String greeting = "Hello there.";
        System.out.println(greeting);

        int value = 14;
        misael.jump(value);
    }
}

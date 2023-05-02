package codecademy.java.control;

public class TestAnimal {
    public static void main(String[] args) {

        Animal ave = new Animal();
        ave.setCanFly(true);
        ave.setLegs(2);
        ave.setName("loro");

        Animal pez = new Animal();
        pez.setCanFly(false);
        pez.setLegs(0);
        pez.setName("atun");

        Animal perro = new Animal(4,false,"pekines");

        Animal[] animales = {ave, pez, perro};

        for (Animal a: animales){
            System.out.println("El animal es: " + a.getName() + ", puede volar: " + a.isCanFly() + " y tiene patas: " + a.getLegs());
        }






    }
}
// las variables son privadas, los metodos no
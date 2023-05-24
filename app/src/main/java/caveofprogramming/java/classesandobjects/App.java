package caveofprogramming.java.classesandobjects;


class Person{
    String nombre;
    int edad;
    /*las clases pueden contener
    1. data
    2. metodos
     */
    void speak(){
        for (int i=0; i<3; i++){
            System.out.println("Mi nombre es " + nombre + " y tengo " + edad + " años");
        }
        }
    void sayHello(){
        System.out.println("Hola aqui");
    }
}
public class App {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.nombre = "Carlos Cordova";
        person1.edad = 23;
        person1.speak();
        person1.sayHello();

        Person person2 = new Person();
        person2.nombre = "Natalia Perez";
        person2.edad = 50;
        person2.speak();
        person2.sayHello();

        int mama = person2.edad - person1.edad;

        System.out.println(person1.nombre);
        System.out.println(person2.nombre);
        System.out.println("mi mama me tuvo a los " + mama);
    }
}

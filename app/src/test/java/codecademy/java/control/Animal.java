package codecademy.java.control;

public class Animal {
    private int legs;
    private boolean canFly;
    private String name;

    public Animal(int legs, boolean canFly, String name){

        this.legs = legs;
        this.canFly = canFly;
        this.name = name;
    }
    public Animal(){
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

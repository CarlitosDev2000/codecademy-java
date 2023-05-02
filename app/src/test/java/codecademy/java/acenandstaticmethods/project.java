package codecademy.java.acenandstaticmethods;

public class project {
    public static int variableA = 4;
    public int variableB;

    public project(){
        variableA += 1;
        this.variableB = 4;
    }

    public static void main(String[] args){

        project myObject = new project();
        System.out.println(project.variableA);
    }
}

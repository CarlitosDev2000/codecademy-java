package codecademy.java.controldos;

public class Persona {
   private String nombre;
   private String apellido;



   public String getNombre(){
       return  reverse(nombre);
   }
   public String getApellido(){
       return  apellido;
   }



    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public  void setNombre(String nombre) {
       this.nombre = nombre;
    }
    private  String reverse(String nombre) {
        String st = "";
        for (int i = nombre.length()-1; i >= 0; i--){
            st = st + nombre.charAt(i);
        }//jose
        return st;
    }

}

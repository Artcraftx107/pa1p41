import notas.*;
public class PruebaAsignatura {
   private static final String[] als={
           "12455666F;Lopez Perez, Pedro;6.7",
           "33678999D;Merlo Gomez, Isabel;5.8",
           "23555875G;Martinez Herrera, Lucia;9.1"};
    public static void main(String[] args){
        Asignatura PA1 = new Asignatura("PA1", als);
        try {
            System.out.println("Media de calificaciones: "+PA1.getMedia());
        } catch (EstudianteException e) {
            System.err.println(e.getMessage());
        }
        for (int i = 0; i<PA1.getEstudiantes().size(); i++){
            System.out.println(PA1.getEstudiantes().get(i).getDni());
        }
        Estudiante aux1 = new Estudiante("12455666F", "Lopez Lopez, Pedro");
        try {
            System.out.println(PA1.getCalificacion(aux1));
        } catch (EstudianteException e) {
            System.err.println("Error: "+e.getMessage());
        }

    }
}

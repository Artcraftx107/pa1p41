import notas.*;
public class PruebaEstudiante {
    public static void main(String[] args) throws EstudianteException {
        Estudiante e1 = new Estudiante("22456784F", "Gonzalez Perez, Juan", 5.5);
        Estudiante e2 = new Estudiante("33456777S", "Gonzalez Perez, Juan", 3.4);
        System.out.println(e1);
        System.out.println(e2);

    }
}

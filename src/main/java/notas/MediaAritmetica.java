package notas;

import java.util.ArrayList;

public class MediaAritmetica implements CalculoMedia {
    @Override
    public double calcula(ArrayList<Estudiante> estudiantes) throws EstudianteException {
        double media = 0;
        if(estudiantes.isEmpty()){
            throw new EstudianteException("No hay estudiantes");
        }
        for(int i = 0; i<estudiantes.size(); i++){
            media+=estudiantes.get(i).getCalificacion();
        }
        return media/estudiantes.size();
    }
}

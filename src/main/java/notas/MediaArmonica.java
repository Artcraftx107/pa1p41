package notas;

import java.util.ArrayList;

public class MediaArmonica implements CalculoMedia{
    @Override
    public double calcula(ArrayList<Estudiante> estudiantes) throws EstudianteException {
        double media = 0;
        double aux_bruh = 0;
        for(int i = 0; i<estudiantes.size(); i++){
            if(estudiantes.get(i).getCalificacion()>0){
                aux_bruh++;
                media+=1/estudiantes.get(i).getCalificacion();
            }
        }
        if(aux_bruh==0){
            throw new EstudianteException("No hay estudiantes");
        }
        return aux_bruh/media;
    }
}

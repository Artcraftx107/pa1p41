package notas;

import java.util.ArrayList;

public class MediaSinExtremos implements CalculoMedia {
    private double min;
    private double max;
    public MediaSinExtremos(double n, double x){
        if(n>x){
            this.max=n;
            this.min=x;
        }else{
            this.max=x;
            this.min=n;
        }
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public void setMax(double max) {
        this.max = max;
    }

    @Override
    public double calcula(ArrayList<Estudiante> estudiantes) throws EstudianteException {
        double aux = 0;
        double media = 0;
        for(int i = 0; i<estudiantes.size(); i++){
            if(estudiantes.get(i).getCalificacion()<max && estudiantes.get(i).getCalificacion()>min){
                aux++;
                media+=estudiantes.get(i).getCalificacion();
            }
        }
        if(aux==0){
            throw new EstudianteException("No hay estudiantes");
        }
        return media/aux;
    }
}

package notas;

public class AsignaturaMedias extends Asignatura {
    public AsignaturaMedias(String n, String[] monkey){
        super(n, monkey);
    }

    @Override
    public double getMedia() throws EstudianteException {
        return super.getMedia();
    }

    public double getMedia(CalculoMedia calc) throws EstudianteException{
        return calc.calcula(getEstudiantes());
    }
}

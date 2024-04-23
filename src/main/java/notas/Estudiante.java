package notas;

public class Estudiante {
    private String dni;
    private String nombre;
    private double nota;
    public Estudiante(String d, String n){
        this.dni=d;
        this.nombre=n;

    }
    public Estudiante(String d, String n, double not) throws EstudianteException{
        if(not<0){
            throw new EstudianteException("Calificacion negativa");
        }else{
            this.dni=d;
            this.nombre=n;
            this.nota=not;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public double getCalificacion() {
        return nota;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Estudiante estudiante = (Estudiante) obj;
        return dni.equalsIgnoreCase(estudiante.dni) &&
                nombre.equals(estudiante.nombre);
    }


    @Override
    public int hashCode() {
        return dni.toUpperCase().hashCode()+nombre.hashCode();
    }


    @Override
    public String toString() {
        return this.nombre+" ("+this.dni+")";
    }
}

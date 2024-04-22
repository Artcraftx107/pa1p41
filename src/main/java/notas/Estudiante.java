package notas;

public class Estudiante {
    private String dni;
    private String nombre;
    private double nota;
    public Estudiante(String d, String n) throws EstudianteException{
        if(d.isEmpty() || n.isEmpty()){
            throw new EstudianteException("Una de las dos variables de informacion esta vacia");
        }else{
            this.dni=d;
            this.nombre=n;
        }
    }
    public Estudiante(String d, String n, double not) throws EstudianteException{
        if(not<0){
            throw new EstudianteException("La nota no puede ser negativa");
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
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return this.nombre+" "+this.dni;
    }
}

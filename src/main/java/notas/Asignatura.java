package notas;

import java.util.List;
import java.util.ArrayList;
public class Asignatura {
    private String nombre;
    private List<Estudiante> estudiantes;
    private List<String> errores;
    public Asignatura(String nombre, String[] infoEstudiantes){
        this.nombre = nombre;
        estudiantes = new ArrayList<>();
        errores = new ArrayList<>();
        for (String info : infoEstudiantes) {
            String[] datos = info.split(";");
            if (datos.length == 3) {
                try {
                    String dni = datos[0];
                    String bruh = datos[1];
                    double calificacion = Double.parseDouble(datos[2]);
                    if (calificacion < 0) {
                        errores.add("ERROR. Calificación negativa: " + info);
                    } else {
                        estudiantes.add(new Estudiante(dni, bruh, calificacion));
                    }
                } catch (NumberFormatException | EstudianteException e) {
                    errores.add("ERROR. Calificación no numérica: " + info);
                }
            } else {
                errores.add("ERROR. Faltan datos: " + info);
            }
        }
    }

    public double getCalificacion(Estudiante est) throws EstudianteException {
        for (Estudiante e : estudiantes) {
            if (e.toString().equalsIgnoreCase(est.toString())) {
                return e.getCalificacion();
            }
        }
        throw new EstudianteException("Estudiante " + est.toString() + " no se encuentra");
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public List<String> getErrores() {
        return errores;
    }

    public double getMedia() throws EstudianteException {
        if (estudiantes.isEmpty()) {
            throw new EstudianteException("No hay estudiantes");
        }
        double total = 0;
        for (Estudiante est : estudiantes) {
            total += est.getCalificacion();
        }
        return total / estudiantes.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombre).append(": { [");
        for (int i = 0; i< estudiantes.size(); i++) {
            if(i+1!=estudiantes.size()) {
                sb.append(estudiantes.get(i)).append(", ");
            }else{
                sb.append(estudiantes.get(i)).append("],");
            }
        }
        if (!errores.isEmpty()) {
            sb.append("[");
            for (String error : errores) {
                sb.append(error).append(", ");
            }
        }
        if (!estudiantes.isEmpty() || !errores.isEmpty()) {
            sb.setLength(sb.length() - 2); // Elimina la coma y el espacio finales
        }
        sb.append("] }");
        return sb.toString();
    }
}

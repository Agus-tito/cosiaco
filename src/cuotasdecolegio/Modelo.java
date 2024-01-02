package cuotasdecolegio;

import java.io.File;
import java.util.ArrayList;

public class Modelo {

    public static void guardarAlumno(String nombre, Alumno alum) {
        // Obtener la lista actual de alumnos
        ArrayList<Alumno> alumno = obtenerAlumno();

        // Si la lista de alumnos no es nula
        if (alumno != null) {
            // Iterar sobre la lista de alumnos
            for (Alumno al : alumno) {
                // Comparar si el alumno que se va a guardar es igual al alumno actual
                if (al.equals(alum)) {
                    // Eliminar el alumno existente
                    alumno.remove(al);
                    // Agregar el nuevo alumno a la lista
                    alumno.add(alum);
                    // Salir del bucle, ya que no es necesario seguir buscando
                    break;
                }
            }

            // Guardar la lista actualizada en el almacenamiento local
            LocalStorage.setGuardar("ListaDeAlumnosFacherosFacheritos.txt", alumno);
        } else {
            // Crear una nueva lista y agregar el nuevo alumno
            ArrayList<Alumno> alumnt = new ArrayList<Alumno>();
            alumnt.add(alum);

            // Guardar la lista actualizada en el almacenamiento local
            LocalStorage.setGuardar("ListaDeAlumnosFacherosFacheritos.txt", alumnt);
        }
    }

    public static ArrayList<Alumno> obtenerAlumno() {
        ArrayList<Alumno> proAlum = new ArrayList<>();
        File archivo = new File("ListaDeAlumnosFacherosFacheritos.txt");

        if (archivo.exists() && archivo.isFile()) {
            proAlum = (ArrayList<Alumno>) LocalStorage.getObtener("ListaDeAlumnosFacherosFacheritos.txt");
        }

        return proAlum;
    }

}

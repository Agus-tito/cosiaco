package cuotasdecolegio;

import java.util.ArrayList;

public class CuotasDeColegio {

    public static void main(String[] args) {
        int opc = 0;

        do {
            opc = Vista.menu();
            switch (opc) {
                case 1 -> {
                    int opc2 = Vista.menuAlumno();
                    switch (opc2) {
                        case 1 -> {
                            Alumno unAlumno = Vista.registrarAlumno();
                            Modelo.guardarAlumno("listaDeAlumnosFacherosFacheritos.txt", unAlumno);
                    }
                        case 2 -> {
                            ArrayList<Alumno> alumno = Modelo.obtenerAlumno();
                            Vista.mostrarAlumno(alumno);
                    }
                        case 3 -> {
                            ArrayList<Alumno> alumn = Modelo.obtenerAlumno();
                            Alumno mAlumno = Vista.modificarAlumno(alumn);
                            Modelo.guardarAlumno("listaDeAlumnosFacherosFacheritos.txt", mAlumno);
                    }
                        case 4 -> {
                            ArrayList<Alumno> alum = Modelo.obtenerAlumno();
                            Alumno bajaAlumno = Vista.eliminarAlumno(alum);
                            Modelo.guardarAlumno("listaDeAlumnosFacherosFacheritos.txt", bajaAlumno);
                    }
                    }
                }
                case 2 -> {
                    int opc3 = Vista.menuInscripcion();
                    switch (opc3) {
                        case 1 -> {
                            ArrayList<Alumno> lista = Modelo.obtenerAlumno();
                            Alumno nAlumno = Vista.registrarPagoInscripcion(lista);
                            Modelo.guardarAlumno("listaDeAlumnosFacherosFacheritos.txt", nAlumno);
                    }
                        case 2 -> {
                            ArrayList<Alumno> alumno = Modelo.obtenerAlumno();
                            Vista.mostrarPagoInscripcion(alumno);
                    }
                    }
                }
                case 3 -> {
                    int opc4 = Vista.menuCuota();
                    switch (opc4) {
                        case 1 -> {
                            ArrayList<Alumno> lista = Modelo.obtenerAlumno();
                            Alumno nAlumno = Vista.registrarCuota(lista);
                            Modelo.guardarAlumno("listaAlumnosFacherosFacheritos.txt", nAlumno);
                    }
                        case 2 -> {
                            ArrayList<Alumno> list = Modelo.obtenerAlumno();
                            Vista.mostrarPagoCuota(list);
                    }
                            
                    }
                }
            }
        } while (opc != 0);
    }

}

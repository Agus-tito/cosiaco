package cuotasdecolegio;

import java.util.ArrayList;
import java.util.Scanner;

public class Vista {

    public static int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese opción");
        System.out.println("1 - Gestionar Alumnos");
        System.out.println("2 - Gestionar Inscripciones");
        System.out.println("3 - Gestionar Cuotas");
        int op = scanner.nextInt();
        return op;
    }

    public static int menuAlumno() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("GESTION DE ALUMNOS");
        System.out.println("-------------------");
        System.out.println("");
        System.out.println("1 - Cargar Nuevo Alumno");
        System.out.println("2 - Mostrar Todos los Alumnos");
        System.out.println("3 - Modificar Alumno");
        System.out.println("4 - Dar Debaja Alumno");
        int op = scanner.nextInt();
        return op;

    }

    public static int menuCuota() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("GESTION DE CUOTAS");
        System.out.println("-------------------");
        System.out.println("");
        System.out.println("1 - Registrar Nueva Cuota");
        System.out.println("2 - Mostrar Todas las Cuotas");
        int op = scanner.nextInt();
        return op;
    }

    public static int menuInscripcion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("GESTION DE INSCRIPCION");
        System.out.println("-------------------");
        System.out.println("");
        System.out.println("1 - Registrar Nueva Incripcion");
        System.out.println("2 - Mostrar Todas las Inscripciones");
        int op = scanner.nextInt();
        return op;
    }

    public static Alumno registrarAlumno() {
        // TODO Auto-generated method stub
        Scanner leer = new Scanner(System.in);
        Scanner ler = new Scanner(System.in);
        Scanner lr = new Scanner(System.in);
        System.out.println("Inscribir Alumno");
        System.out.println("--------------------------------------");
        System.out.println("");
        System.out.println("Ingrese el Nombre del Alumno");
        String nombre = leer.nextLine();
        System.out.println("");
        System.out.println("Ingrese el D.N.I");
        long dni = ler.nextLong();
        System.out.println("");
        System.out.println("Ingrese la direccion");
        String direccion = leer.nextLine();
        System.out.println("");
        System.out.println("Ingrese el numero de telefono");
        String telefono = leer.nextLine();
        System.out.println("");
        System.out.println("Ingrese el grado del Alumno ");
        int grado = lr.nextInt();

        Alumno nuevoAlumno = new Alumno(nombre, dni, direccion, telefono, grado);

        return nuevoAlumno;
    }

    public static void mostrarAlumno(ArrayList<Alumno> listaAlumnos) {
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getBajaLogica() == false) {
                System.out.println(alumno);
            }
        }

    }

    public static Alumno modificarAlumno(ArrayList<Alumno> listAlumno) {
        Scanner leer = new Scanner(System.in);
        Scanner ler = new Scanner(System.in);
        Scanner lr = new Scanner(System.in);
        System.out.println("MODIFICAR ALUMNO");
        System.out.println("");
        System.out.println("Ingrese el D.N.I del Alumno");
        long dni = leer.nextLong();
        System.out.println("");
        System.out.println("Datos del Alumno");
        System.out.println("");
        for (Alumno a : listAlumno) {
            long dnia = a.getDni();
            if (dnia == dni) {
                if (a.getBajaLogica() == false) {
                    System.out.println("Seleccione Una de las siguentes Obciones");
                    System.out.println("-----------------------------------------");
                    System.out.println("");
                    System.out.println("1 - Modificar Nombre");
                    System.out.println("2 - Modificar Direccion");
                    System.out.println("3 - Modificar Telefono");
                    System.out.println("4 - Modificar Grado");
                    System.out.println("5 - Modificar Todo");
                    int menu = lr.nextInt();
                    switch (menu) {
                        case 1:
                            System.out.println("Ingrese el Nombre del Alumno");
                            String nNombre = ler.nextLine();
                            a.setNombreCompleto(nNombre);
                            break;
                        case 2:
                            System.out.println("Ingrese la Direccion del Alumno");
                            String nDirection = ler.nextLine();
                            a.setDireccion(nDirection);
                            break;
                        case 3:
                            System.out.println("Ingrese el numero de Telefono de Alumno");
                            String nTelefono = ler.nextLine();
                            a.setTelefono(nTelefono);
                            break;
                        case 4:
                            System.out.println("Ingrese el Grado del Alumno");
                            int nGrado = lr.nextInt();
                            a.setGrado(nGrado);
                            break;
                        case 5:
                            System.out.println("Ingrese el Nombre del Alumno");
                            String nwNombre = ler.nextLine();
                            a.setNombreCompleto(nwNombre);
                            System.out.println("");
                            System.out.println("Ingrese la Direccion del Alumno");
                            String nwDirection = ler.nextLine();
                            a.setDireccion(nwDirection);
                            System.out.println("");
                            System.out.println("Ingrese el numero de Telefono de Alumno");
                            String nwTelefono = ler.nextLine();
                            a.setTelefono(nwTelefono);
                            System.out.println("");
                            System.out.println("Ingrese el Grado del Alumno");
                            int nwGrado = lr.nextInt();
                            a.setGrado(nwGrado);
                            break;
                    }
                    return a;
                } else {
                    System.out.println("El alumno no esta registrado");
                }
            } else {
                System.out.println("El alumno esta dado de Baja");
            }
        }
        return null;
    }

    public static Alumno eliminarAlumno(ArrayList<Alumno> lista) {
        Scanner leer = new Scanner(System.in);
        System.out.println("DAR DEBAJA ALUMNOS");
        System.out.println("");
        System.out.println("Ingrese el D.N.I del Alumno");
        long dni = leer.nextLong();
        System.out.println("");
        System.out.println("Datos del Alumno");
        System.out.println("");
        for (Alumno alum : lista) {
            long adni = alum.getGrado();
            if (adni == dni) {
                if (alum.getBajaLogica() == false) {
                    alum.setBajaLogica(true);
                    System.out.println("El alumno fue dado de Baja");
                    return alum;
                } else {
                    System.out.println("El alumno esta dado de Baja");
                }
            } else {
                System.out.println("El alumno no esta registrado");
            }
        }
        return null;
    }

    public static Alumno registrarPagoInscripcion(ArrayList<Alumno> lista) {
        Scanner leer = new Scanner(System.in);
        Scanner ler = new Scanner(System.in);
        Scanner lr = new Scanner(System.in);
        System.out.println("REGISTRAR INSCRIPCION");
        System.out.println("");
        System.out.println("Ingrese el D.N.I del Alumno");
        long dni = leer.nextLong();
        System.out.println("");
        System.out.println("Datos del Alumno");
        System.out.println("");
        for (Alumno alum : lista) {
            long dniAlum = alum.getDni();
            if (dniAlum == dni) {
                    System.out.println(alum);
                if (alum.getBajaLogica() == false) {
                    System.out.println("");
                    System.out.println("Complete los datos de la Inscripcion");
                    System.out.println("");
                    System.out.println("Ingrese el numero de Pago");
                    int numPago = ler.nextInt();
                    System.out.println("");
                    System.out.println("Ingese la fecha (dia-mes)");
                    String fecha = lr.nextLine();
                    System.out.println("");
                    System.out.println("Ingrese el Año");
                    int año = ler.nextInt();
                    System.out.println("");
                    System.out.println("Ingrese el monto de la Inscripcion");
                    int monto = ler.nextInt();
                    System.out.println("");

                    Inscripcion unInscripcion = new Inscripcion(numPago, fecha, año, monto);
                    alum.agregarInscripcion(unInscripcion);
                    System.out.println("Datos de Inscripcion guardados con exito");
                    return alum;
                } else {
                    System.out.println("El alumno esta dado de Baja");
                }

            } else {
                System.out.println("El alumno no esta registrado");
            }
        }
        return null;
    }

    public static void mostrarPagoInscripcion(ArrayList<Alumno> lista) {
        Scanner leer = new Scanner(System.in);
        if (lista != null) {
            System.out.println("Ingrese el dni del Alumno");
            long dni = leer.nextLong();
            System.out.println("");
            for (Alumno alumnoArray : lista) {
                long dniAlumnoArray = alumnoArray.getDni();
                if (dniAlumnoArray == dni) {
                    ArrayList<Inscripcion> listaInscripcion = alumnoArray.getListaInscripcion();
                    System.out.println(alumnoArray);
                    System.out.println("Cuotas Pagadas del Alumno");
                    System.out.println("--------------------------");
                    for (Inscripcion unInscri : listaInscripcion) {
                        System.out.println(unInscri);
                        System.out.println("----------------------------------");
                    }
                }
            }
        } else {
            System.out.println("Lista de inscripcion NULA");
        }
    }

    public static Alumno registrarCuota(ArrayList<Alumno> lista) {
        Scanner leer = new Scanner(System.in);
        Scanner ler = new Scanner(System.in);
        Scanner lr = new Scanner(System.in);
        System.out.println("REGISTRAR CUOTA");
        System.out.println("");
        System.out.println("Ingrese el D.N.I del Alumno");
        long dni = leer.nextLong();
        System.out.println("");
        System.out.println("Datos del Alumno");
        System.out.println("");
        for (Alumno alum : lista) {
            long dniAlum = alum.getDni();
            if (dniAlum == dni) {
                System.out.println(alum);
                System.out.println("");
                System.out.println("Complete los datos de la Cuota");
                System.out.println("");
                System.out.println("Ingrese el numero de Pago");
                int numPago = ler.nextInt();
                System.out.println("");
                System.out.println("Ingese la fecha (Año)");
                String fecha = lr.nextLine();
                System.out.println("");
                System.out.println("Ingrese el Mes de Pago");
                String mes = lr.nextLine();
                String m = mes.toLowerCase();
                System.out.println("");
                System.out.println("Ingrese el monto de la Cuota");
                int monto = ler.nextInt();
                System.out.println("");
                int semestre = 0;
                switch (m) {
                    case "enero":
                        semestre = 1;
                        break;
                    case "febrero":
                        semestre = 2;
                        break;
                    case "marzo":
                        semestre = 3;
                        break;
                    case "abril":
                        semestre = 4;
                        break;
                    case "mayo":
                        semestre = 5;
                        break;
                    case "junio":
                        semestre = 6;
                        break;
                    case "julio":
                        semestre = 7;
                        break;
                    case "agosto":
                        semestre = 8;
                        break;
                    case "septiembre":
                        semestre = 9;
                        break;
                    case "octubre":
                        semestre = 10;
                        break;
                    case "noviembre":
                        semestre = 11;
                        break;
                    case "diciembre":
                        semestre = 12;
                        break;
                }
                Cuota cuota = new Cuota(semestre, monto, numPago, fecha);
                alum.agregarCuota(cuota);
                return alum;
            } else {
                System.out.println("El alumno no esta registrado");
            }

        }
        return null;
    }

    public static void mostrarPagoCuota(ArrayList<Alumno> lista) {
        Scanner leer = new Scanner(System.in);
        if (lista != null) {
            System.out.println("Ingrese el dni del Alumno");
            long dni = leer.nextLong();
            System.out.println("");
            for (Alumno alumnoArray : lista) {
                long dniAlumnoArray = alumnoArray.getDni();
                if (dniAlumnoArray == dni) {
                    ArrayList<Cuota> listaCuota = alumnoArray.getListaCuota();
                    System.out.println(alumnoArray);
                    System.out.println("Cuotas Pagadas del Alumno");
                    System.out.println("--------------------------");
                    for (Cuota unCuota : listaCuota) {
                        System.out.println(unCuota);
                        System.out.println("----------------------------------");
                    }
                }
            }
        } else {
            System.out.println("Lista de inscripcion NULA");
        }
    }

}

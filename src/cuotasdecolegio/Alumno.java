package cuotasdecolegio;

import java.io.Serializable;
import java.util.ArrayList;

public class Alumno implements Serializable {

    String nombreCompleto;
    long dni;
    String direccion;
    String telefono;
    int grado;
    static int nro = 0;
    ArrayList<Cuota> listaCuota;
    ArrayList<Inscripcion> listaInscripcion;
    boolean bajaLogica = false;

    public Alumno(String nombre_Completo, long dni, String direccion, String telefono, int grado) {
        this.nombreCompleto = nombre_Completo;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.grado = grado;
        this.nro = nro++;
        this.listaCuota = new ArrayList<>();
        this.listaInscripcion = new ArrayList<>();
        
    }

    /*public void aumentarContador() {
        nro++;
    }*/
    
    public String toString() {
        //aumentarContador();
        return "{" + "Alumno: " + nro + " \n nombre y Apellido:" + nombreCompleto + "\n dni:" + dni + "\n direccion:" + direccion + "\n telefono:" + telefono + "\n grado:" + grado + '}';

    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombre_Completo) {
        this.nombreCompleto = nombre_Completo;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }
    
    public ArrayList<Cuota> getListaCuota() {
        return listaCuota;
    }

    public void setListaCuota(ArrayList<Cuota> listaCuota) {
        this.listaCuota = listaCuota;
    }
    public void agregarCuota(Cuota cuota) {
        listaCuota.add(cuota);
    }
    public ArrayList<Inscripcion> getListaInscripcion() {
        return listaInscripcion;
    }

    public void setListaInscripcion(ArrayList<Inscripcion> listaInscripcion) {
        this.listaInscripcion = listaInscripcion;
    }
    public void agregarInscripcion(Inscripcion inscripcion) {
        listaInscripcion.add(inscripcion);
    }

    public boolean getBajaLogica() {
        return bajaLogica;
    }

    public void setBajaLogica(boolean bajaLogica) {
        this.bajaLogica = bajaLogica;
    }
    
    
    
}

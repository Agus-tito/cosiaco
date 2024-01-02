
package cuotasdecolegio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class LocalStorage {
     public static void setGuardar(String nombre, Object objeto) {

        try {
            FileOutputStream archivoSalida = new FileOutputStream(nombre);
            ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);
            objetoSalida.writeObject(objeto);
            objetoSalida.close();
            archivoSalida.close();
            System.out.println("Objeto guardado con exito");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     public static ArrayList getObtener(String archivoN) {
        // TODO Auto-generated method stub
        Object objetoDeserealizado = null;
        try {
            FileInputStream archivoEntrada = new FileInputStream(archivoN);
            ObjectInputStream objetoEntrada = new ObjectInputStream(archivoEntrada);
            objetoDeserealizado = objetoEntrada.readObject();
            objetoEntrada.close();
            archivoEntrada.close();
            System.out.println("Archivos recuperados con Exito");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No encontrado :( ");
            e.printStackTrace();
        }

        ArrayList<Alumno> recuperacionN = (ArrayList<Alumno>) objetoDeserealizado;

        return recuperacionN;
    }
}

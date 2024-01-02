package cuotasdecolegio;

import java.io.Serializable;

public class Inscripcion extends Pago implements Serializable {

    int año;
    int montoInscrip;

    public Inscripcion(int numPago, String fechaPago, int año, int monto) {
        super(numPago, fechaPago);
        this.año = año;
        this.montoInscrip = monto;
    }

    @Override
    public String toString() {
        return "{"+"Inscripcion Numero: "+super.numPago+"\n Fecha: "+super.fechaPago+"\n Año: "+ año + "\n Monto: " + montoInscrip + "}";
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
}


package cuotasdecolegio;

import java.io.Serializable;


public class Pago implements Serializable {

    int numPago;
    String fechaPago;

    public Pago(int numPago, String fechaPago) {
        this.numPago = numPago;
        this.fechaPago = fechaPago;
    }

    @Override
    public String toString() {
        return "Pago{" + "numPago=" + numPago + ", fechaPago=" + fechaPago +"}";
    }

    public int getNumPago() {
        return numPago;
    }

    public void setNumPago(int numPago) {
        this.numPago = numPago;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }
}

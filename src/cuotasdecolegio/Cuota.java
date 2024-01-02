package cuotasdecolegio;

import java.io.Serializable;

public class Cuota extends Pago implements Serializable {

    int mes;
    int monto;

    public Cuota(int numPago, int mes, int monto, String fechaPago) {
        super(numPago, fechaPago);
        this.mes = mes;
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "{" + "Cuota Numero: " + super.numPago + "\n Año: " + super.fechaPago + "\n Mes: " + mes + "\n Monto: " + monto + "}"; 
    }
    
    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }


}

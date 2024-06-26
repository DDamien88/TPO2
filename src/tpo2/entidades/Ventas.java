
package tpo2.entidades;


public class Ventas {
    private String  factura;
    private int numeroFactura;

    public Ventas(String factura, int numeroFactura) {
        this.factura = factura;
        this.numeroFactura = numeroFactura;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    @Override
    public String toString() {
        return "Ventas{" + "factura=" + factura + ", numeroFactura=" + numeroFactura + '}';
        
    }
    
    
}

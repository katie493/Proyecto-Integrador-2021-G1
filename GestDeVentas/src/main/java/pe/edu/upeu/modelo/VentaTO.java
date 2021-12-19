package pe.edu.upeu.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class VentaTO {
    
    public String idVenta;
    public String dni;
    public double subtotal;
    public double IGV;
         public double totalImporte;
    
    public VentaTO(String idVenta, String dni, double subtotal, double iGV, double totalImporte) {
        this.idVenta = idVenta;
        this.dni = dni;
        this.subtotal = subtotal;
        IGV = iGV;
        this.totalImporte = totalImporte;
    }

    public String getIdVenta() {
        return idVenta;
    }
    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public double getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    public double getIGV() {
        return IGV;
    }
    public void setIGV(double iGV) {
        IGV = iGV;
    }
    public double getTotalImporte() {
        return totalImporte;
    }
    public void setTotalImporte(double totalImporte) {
        this.totalImporte = totalImporte;
    }

    
    
}

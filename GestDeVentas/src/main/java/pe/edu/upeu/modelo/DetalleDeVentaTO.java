package pe.edu.upeu.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class DetalleDeVentaTO {
    
    public String idDetVent;
    public String idVenta;
    public String idProd;
    public int cantidad;
    public double precio;
    public double totalPago;


    public DetalleDeVentaTO(String idDetVent, String idVenta, String idProd, int cantidad, double precio,
            double totalPago) {
        this.idDetVent = idDetVent;
        this.idVenta = idVenta;
        this.idProd = idProd;
        this.cantidad = cantidad;
        this.precio = precio;
        this.totalPago = totalPago;
    }


    public String getIdDetVent() {
        return idDetVent;
    }
    public void setIdDetVent(String idDetVent) {
        this.idDetVent = idDetVent;
    }
    public String getIdVenta() {
        return idVenta;
    }
    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }
    public String getIdProd() {
        return idProd;
    }
    public void setIdProd(String idProd) {
        this.idProd = idProd;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getTotalPago() {
        return totalPago;
    }
    public void setTotalPago(double totalPago) {
        this.totalPago = totalPago;
    }
    
}

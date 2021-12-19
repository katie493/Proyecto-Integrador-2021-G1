package pe.edu.upeu.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class ProductosTO {

    public String IdProd;
    public String Nombre;
    public String Tipo;
    public int precio;
    public String unidMed;
    public int Stock;

    
    public ProductosTO(String idProd, String nombre, String tipo, int precio, String unidMed, int stock) {
        IdProd = idProd;
        Nombre = nombre;
        Tipo = tipo;
        this.precio = precio;
        this.unidMed = unidMed;
        Stock = stock;
    }

    public String getIdProd() {
        return IdProd;
    }
    public void setIdProd(String idProd) {
        IdProd = idProd;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String tipo) {
        Tipo = tipo;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public String getUnidMed() {
        return unidMed;
    }
    public void setUnidMed(String unidMed) {
        this.unidMed = unidMed;
    }
    public int getStock() {
        return Stock;
    }
    public void setStock(int stock) {
        Stock = stock;
    }
     
    

    
}

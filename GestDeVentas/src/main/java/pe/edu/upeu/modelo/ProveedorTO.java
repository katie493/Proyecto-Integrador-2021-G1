package pe.edu.upeu.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProveedorTO {
 
    public String idprov;
    public String nombre;
    public int celular;
    public String direccion;
    
    public ProveedorTO(String idprov, String nombre, int celular, String direccion) {
        this.idprov = idprov;
        this.nombre = nombre;
        this.celular = celular;
        this.direccion = direccion;
    }

    public String getIdprov() {
        return idprov;
    }
    public void setIdprov(String idprov) {
        this.idprov = idprov;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCelular() {
        return celular;
    }
    public void setCelular(int celular) {
        this.celular = celular;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
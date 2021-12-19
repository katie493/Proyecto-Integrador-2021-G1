package pe.edu.upeu.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class ClienteTO {

    public String dni;
    public String nombre;


    public ClienteTO(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }


    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}

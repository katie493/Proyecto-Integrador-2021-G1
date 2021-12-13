package pe.edu.upeu.modelo;

public class ClienteTO {
    public String dni;
    public String nombre;
    public String celular;

    public ClienteTO() {
    }

    public ClienteTO(String dni, String nombre, String celular) {
        this.dni = dni;
        this.nombre = nombre;
        this.celular = celular;
    }

    public String getDni() {return dni; }
    public void setDni(String dni) {this.dni = dni;}

    public String getNombre() {return nombre;}
    public void setNombre(String no


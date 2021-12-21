package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.ProductosTO;
import pe.edu.upeu.utils.LeerArchivo;
import pe.edu.upeu.utils.LeerTeclado;
import pe.edu.upeu.utils.UtilsX;

public class ProductoDao extends AppCrud{
    
    LeerTeclado leerTeclado=new LeerTeclado();
    UtilsX util=new UtilsX();
    final String TABLA_PRODUCTO="Producto.txt";

    LeerArchivo leerArch;
    ProductosTO prodTO;


    String tipoProd="televisores\nconcinas\nlavadoras\ncelulares";
    

    public Object crearProducto() {
        leerArch=new LeerArchivo(TABLA_PRODUCTO);
        prodTO=new ProductosTO();
        prodTO.setIdProd(generarId(leerArch, 0, "p", 1));
        prodTO.setNombre(leerTeclado.leer("", "Ingrese nombre del producto"));
        prodTO.setPrecio(leerTeclado.leer(0.0, "Ingrese precio base del producto"));
        prodTO.setUnidMed(leerTeclado.leer("", "Ingrese unidad de medida"));
        prodTO.setTipo(leerTeclado.leer("val", "Ingrese el tipo ("+tipoProd+")"));
        prodTO.setStock(leerTeclado.leer(0.0, "Ingrese el Stock"));
        leerArch=new LeerArchivo(TABLA_PRODUCTO);

        return agregarContenido(leerArch, prodTO);

    }

}

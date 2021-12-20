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

    public Object[][] crearProducto() {
        leerArch=new LeerArchivo("TABLA_PRODUCTO");


        return null;

    }

}

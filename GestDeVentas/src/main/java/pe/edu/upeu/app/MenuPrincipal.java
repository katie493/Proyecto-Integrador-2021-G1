package pe.edu.upeu.app;

import pe.edu.upeu.dao.ProductoDao;
import pe.edu.upeu.utils.LeerTeclado;

public class MenuPrincipal {
LeerTeclado lt=new LeerTeclado();
ProductoDao prodDao;

    public void menuOpiciones() {
        int opcionesA=0;
        System.out.println("----------------Bienvenido al Sistema---------------");
        String msg="\nEliga una opcion"+ 
        "\n1=Crear Producto"+
        "\n2=Listar Producto"
        ;
     
        opcionesA=lt.leer(0, msg);  
        while(opcionesA!=0){
            switch(opcionesA) {
              
              case 1:{ 
                    prodDao=new ProductoDao();
                    prodDao.crearProducto();
                    } break;

              case 2: break;
              default: System.out.println("La opcion no existe!");
            }   
          System.out.println("------------------------------"); //15.511.210.043.330.985.984.000.000        
          opcionesA=lt.leer(0,msg);        
        }

    }

}

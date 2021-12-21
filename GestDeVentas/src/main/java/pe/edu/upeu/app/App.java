package pe.edu.upeu.app;

import pe.edu.upeu.modelo.ClienteTO;

/**
 * Hello world!
 *
 */
public class App {

    public static ClienteTO[] cliente;

    public static void ejemploClienteVector(){
    System.out.println( "Hello World!" );

    cliente=new ClienteTO[5];

    cliente[0]=new ClienteTO(" 21345667 ", " Daniela Garcia ");
    cliente[1]=new ClienteTO(" 72356724 ", " Ignacio Apaza ");
    cliente[2]=new ClienteTO(" 46372383 ", " Julio Benique ");
    cliente[3]=new ClienteTO(" 56734526 ", " Xiomara Salas ");
    cliente[4]=new ClienteTO(" 89645632 ", " Josue Mamani ");;
    System.out.println("DNI\tNombre");
    for (ClienteTO cliente: cliente) {
        System.out.println(cliente.getDni()+"\t"+cliente.getNombre());
    }

}

    public static void main( String[] args ){
 
        MenuPrincipal mp=new MenuPrincipal();
        mp.menuOpiciones();

    }
}

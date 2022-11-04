package westbank;
import java.util.Scanner;
import clases.Cliente;
import clases.Cuenta;

public class WestBank {

    public static void main(String[] args) {
        System.out.println("Bienvenidos, por favor seleccione una opcion para continuar...");
        System.out.println("1- Registrar Cliente\n2- Ver Datos de Cliente \n3- Depositar \n4- Girar \n5- Consultar Saldo \n6- Salir");
        String opcion = new String();
        while(opcion.isEmpty()){
            System.out.println("Ingrese codigo del producto: ");
            Scanner op = new Scanner(System.in);
            opcion = op.nextLine();
            
            
            if(opcion.isEmpty()){
                System.out.println("Favor seleccionar una opcion");
            }
        }
    }
    
    public static String registrarCliente(){
        return "";
    }
    
    
     public static String verDatos(){
        return "";
    }
     
     public static String salida(){
        return "";
    }
}

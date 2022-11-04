package westbank;
import java.util.Scanner;
import clases.Cliente;
import clases.Cuenta;

public class WestBank {

    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        System.out.println("Bienvenidos, por favor seleccione una opcion para continuar...");
        System.out.println("1- Registrar Cliente\n2- Ver Datos de Cliente \n3- Depositar \n4- Girar \n5- Consultar Saldo \n6- Salir");
        String opcion = new String();
        while(opcion.isEmpty()){
            System.out.println("opcion: ");
            Scanner op = new Scanner(System.in);
            opcion = (op.nextLine()).trim();
            
            if(opcion.isEmpty()){
                System.out.println("Favor seleccionar una opcion");
            }
            else if(opcion.equals("1")){
                registrarCliente();
            }
            else if(opcion.equals("2")){
                verDatos();
            }
            else if(opcion.equals("3")){
                deposito();
            }
            else if(opcion.equals("4")){
                giros();
            }
            else if(opcion.equals("5")){
                consultaSaldo();
            }
            else if(opcion.equals("6")){
                salida();
            }
        }
    }
    
    public static String registrarCliente(){
        System.out.println("opcion 1");
        menu();
        return "1";
    }    
    
    public static String verDatos(){
        System.out.println("opcion 2");
        menu();
        return "2";
    }
    
    public static String deposito(){
        System.out.println("opcion 3");
        menu();
        return "3";
    }
    
    public static String giros(){
        System.out.println("opcion 4");
        menu();
        return "4";
    }
    
    public static String consultaSaldo(){
        System.out.println("opcion 5");
        menu();
        return "5";
    }
     
    public static String salida(){
        System.out.println("opcion 6");
        return "6";
    }
}

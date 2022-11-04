package westbank;
import java.util.*;
import java.util.Scanner;
import clases.Cliente;
import clases.Cuenta;

public class WestBank {
    
    
    public static void main(String[] args) {
        List<Cliente> clienteBanco = new LinkedList<>(); 
        menu(clienteBanco);
    }
    
    public static void menu(List<Cliente> clienteBanco){
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
                registrarCliente(clienteBanco);
            }
            else if(opcion.equals("2")){
                verDatos(clienteBanco);
            }
            else if(opcion.equals("3")){
                deposito(clienteBanco);
            }
            else if(opcion.equals("4")){
                giros(clienteBanco);
            }
            else if(opcion.equals("5")){
                consultaSaldo(clienteBanco);
            }
            else if(opcion.equals("6")){
                salida();
            }
        }
    }
    
    public static String registrarCliente(List<Cliente> clienteBanco){
        Cliente cliente = new Cliente();
        Cuenta cuenta = new Cuenta();
        
        String rut = new String();
        String nombre = new String();
        String apellidoPaterno = new String();
        String apellidoMaterno = new String();
        String domicilio = new String();
        String comuna = new String();
        String telefono = new String();
        String numeroCuenta = new String();
        int saldo =0;
        
        while(rut.isEmpty() || nombre.isEmpty() || apellidoPaterno.isEmpty() || apellidoMaterno.isEmpty() || domicilio.isEmpty() || comuna.isEmpty() || telefono.isEmpty()){
            System.out.println("RUT: ");
            Scanner rutIn = new Scanner(System.in);
            rut = rutIn.nextLine();
            
            System.out.println("NOMBRE: ");
            Scanner nombreIn = new Scanner(System.in);
            nombre = nombreIn.nextLine();
            
            System.out.println("APELLIDO PATERNO: ");
            Scanner apellidoPatIn = new Scanner(System.in);
            apellidoPaterno = apellidoPatIn.nextLine();
            
            System.out.println("APELLIDO MATERNO: ");
            Scanner apellidoMatIn = new Scanner(System.in);
            apellidoMaterno = apellidoMatIn.nextLine();
            
            System.out.println("DOMICILIO: ");
            Scanner domicilioIn = new Scanner(System.in);
            domicilio = domicilioIn.nextLine();
            
            System.out.println("COMUNA: ");
            Scanner comunaIn = new Scanner(System.in);
            comuna = comunaIn.nextLine();
            
            System.out.println("TELEFONO: ");
            Scanner telefonoIn = new Scanner(System.in);
            telefono = telefonoIn.nextLine();
            
            if(rut.isEmpty() || nombre.isEmpty() || apellidoPaterno.isEmpty() || apellidoMaterno.isEmpty() || domicilio.isEmpty() || comuna.isEmpty() || telefono.isEmpty()){
                System.out.println("Favor Ingresar todos los datos\n");
            }
            else{ 
                numeroCuenta = rut;
                
                cliente.setRut(rut);
                cliente.setNombre(nombre);
                cliente.setApellidoPaterno(apellidoPaterno);
                cliente.setApellidoMaterno(apellidoMaterno);
                cliente.setDomicilio(domicilio);
                cliente.setComuna(comuna);
                cliente.setTelefono(Integer.parseInt(telefono));
                cliente.setCuenta(cuenta);
                cuenta.setNumeroCuenta(Integer.parseInt(numeroCuenta));
                cuenta.setSaldo(saldo);
                
                clienteBanco.add(cliente);
                System.out.println(clienteBanco);
            }
        }
        
        System.out.println("opcion 1");
        menu(clienteBanco);
        return "1";
    }    
    
    public static String verDatos(List<Cliente> clienteBanco){
        System.out.println("opcion 2");
        menu(clienteBanco);
        return "2";
    }
    
    public static String deposito(List<Cliente> clienteBanco){
        System.out.println("opcion 3");
        menu(clienteBanco);
        return "3";
    }
    
    public static String giros(List<Cliente> clienteBanco){
        System.out.println("opcion 4");
        menu(clienteBanco);
        return "4";
    }
    
    public static String consultaSaldo(List<Cliente> clienteBanco){
        System.out.println("opcion 5");
        menu(clienteBanco);
        return "5";
    }
     
    public static String salida(){
        System.out.println("opcion 6");
        return "6";
    }
}

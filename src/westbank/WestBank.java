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
        System.out.println("BIENVENIDO, PARA CONTINUAR SELECCIONE UNA DE LAS SIGUIENTES OPCIONES...\n");
        System.out.println("1- REGISTRAR CLIENTE \n2- VER DATOS DE CLIENTES \n3- DEPOSITAR \n4- GIRAR \n5- CONSULTAR SALDO \n6- SALIR");
        String opcion = new String();
        while(opcion.isEmpty()){
            System.out.println("OPCION: ");
            Scanner op = new Scanner(System.in);
            opcion = (op.nextLine()).trim();
            
            if(opcion.isEmpty()){
                System.out.println("FAVOR SELECCIONAR UNA OPCION");
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
            
            if(rut.isEmpty()){
                System.out.println("FAVOR INGRESAR RUT....\n");
            }
            else{
                for(int i = 0;i<=clienteBanco.size();i++){
                    if(clienteBanco.size()>0){
                        if(clienteBanco.get(i).getRut().equals(rut)){
                            System.out.println("CLIENTE YA SE REGISTRA EN SISTEMA....\n");                            
                            break;
                        }
                        else{                                        
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
                            
                            System.out.println("INGRESE NUMERO DE CUENTA: ");
                            Scanner numeroCuentaIn = new Scanner(System.in);
                            numeroCuenta = numeroCuentaIn.nextLine(); 
                            
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
                            System.out.println("CLIENTE REGISTRADO EXITOSAMENTE!\n");
                            break;
                         }                     
                    }
                    else{                                    
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
            
                        System.out.println("INGRESE NUMERO DE CUENTA: ");
                        Scanner numeroCuentaIn = new Scanner(System.in);
                        numeroCuenta = numeroCuentaIn.nextLine(); 
                        
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
                        System.out.println("CLIENTE REGISTRADO EXITOSAMENTE!\n");
                        break;
                    }
                }                     
            }
        }
        menu(clienteBanco);
        return "1";
    }    
    
    public static String verDatos(List<Cliente> clienteBanco){
        String rut = new String();        
        while(rut.isEmpty()){
            System.out.println("RUT: ");
            Scanner rutIn = new Scanner(System.in);
            rut = rutIn.nextLine();
            
            if(rut.isEmpty()){
                System.out.println("FAVOR INGRESAR RUT PARA MOSTRAR DATOS...\n");
            }
            else{
                for(int i = 0;i<=clienteBanco.size();i++){
                    if(clienteBanco.size()>0){
                        if(clienteBanco.get(i).getRut().equals(rut)){
                                    System.out.println("DATOS CLIENTES:");
                                    System.out.println("*********************************************************************");
                                    System.out.println( "RUT: " + clienteBanco.get(i).getRut()+
                                                        "\nNOMBRE: " + clienteBanco.get(i).getNombre()+
                                                        "\nAPELLIDO PATERNO: " + clienteBanco.get(i).getApellidoPaterno()+
                                                        "\nAPELLIDO MATERNO: " + clienteBanco.get(i).getApellidoMaterno()+
                                                        "\nDOMICILIO: " + clienteBanco.get(i).getDomicilio()+
                                                        "\nCOMUNA: " + clienteBanco.get(i).getComuna()+
                                                        "\nNUMERO DE CUENTA: " + clienteBanco.get(i).getCuenta().getNumeroCuenta()+
                                                        "\nSALDO: " + clienteBanco.get(i).getCuenta().getSaldo());
                                    System.out.println("*********************************************************************\n");
                            break;
                        }
                        else{
                            System.out.println("CLIENTE NO SE REGISTRA EN SISTEMA...");
                            break;
                        }
                    }
                }
            }
        }
        menu(clienteBanco);
        return "2";
    }
    
    public static String deposito(List<Cliente> clienteBanco){
        String rut = new String();
        while(rut.isEmpty()){
            System.out.println("RUT: ");
            Scanner rutIn = new Scanner(System.in);
            rut = rutIn.nextLine();
            
            if(rut.isEmpty()){
                System.out.println("Debe ingresar un RUT");
            }
        }
        
                for(int i = 0;i<=clienteBanco.size();i++){
                    if(!clienteBanco.get(i).getRut().equals(rut)){
                        System.out.println("Cliente no se registra en sistema");
                        break;
                }
                else{
                        String monto = new String();
                        System.out.println("MONTO: ");
                        Scanner saldoIn = new Scanner(System.in);
                        monto = saldoIn.nextLine();
                        int montoInt = Integer.parseInt(monto);
                        
                        if(montoInt==0 || monto.isEmpty()){
                            System.out.println("Debe ingresar un valor mayor a cero ");
                            break;
                        }
                        else{
                            Cuenta nCuenta = new Cuenta();
                            int nsaldo = clienteBanco.get(i).getCuenta().getSaldo() + Integer.parseInt(monto);
                            nCuenta.setSaldo(nsaldo);
                            clienteBanco.get(i).setCuenta(nCuenta);
                            System.out.println("NUEVO SALDO: " + nsaldo);
                            break;
                        }
                }
            }    
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
        System.out.println("HASTA PRONTO...");
        return "6";
    }
    
    public static boolean isNumeric(String cadena){
	try {
            Integer.parseInt(cadena);
            return true;
	} 
        catch (NumberFormatException e){
            System.out.println("Ingrese valor numerico porfavor...");
            return false;
	}
    }
}

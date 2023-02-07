package traductor;

import java.util.Scanner;

/**
 *
 * @author Ramon Caminero Arroyo <ramoncamineroarroyo@gmail.com>
 */
public class Traductor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean salir = true;
        int menu;
        Scanner sc = new Scanner(System.in);
        boolean admin;
        //bienvenida, incluir metodo 
        
        do {
            
            menu = sc.nextInt();
            
            switch (menu) {//seleccion de rol
                case 1://administrador
                    admin = true;
                    do {
                        
                        menu = sc.nextInt();
                        
                        switch (menu) {
                            case 1://a�adir palabras
                                
                                break;
                            
                            case 2: //salir
                                
                                salir = false;
                            
                            default:
                                System.out.println("Introduce una opcion v�lida!!");
                        }
                    } while (salir);
                    salir = true;
                    break;
                
                case 2://invitado
                    admin = false;
                    
                    do {
                        
                        
                        
                        switch (menu) {
                            case 1://mostrar listado de palabras
                                do {
                                    
                                    menu=sc.nextInt();
                                    
                                    switch (menu) {
                                        case 1://mostrar tabla completa
                                            
                                            break;
                                        case 2://mostrar lista espa�ol
                                            
                                            break;
                                        case 3://mostrar lista gallego

                                            break;
                                        case 4://mostrar lista catal�n
                                            break;
                                        case 5: //salir
                                        default:
                                            System.out.println("Introduce una opcion v�lida!!");
                                    }
                                } while (salir);
                                salir=true;
                                break;
                            case 2://traducir palabras
                                
                            case 3://salir
                                
                                break;
                            default:
                                System.out.println("Introduce una opcion v�lida!!");
                        }
                    } while (salir);
                    
                    break;
                case 3: //cerrar programa
                    salir = false;
                    break;
                default:
                    System.out.println("Introduce una opcion v�lida!!");
            }
            
        } while (salir);
    }
    
}

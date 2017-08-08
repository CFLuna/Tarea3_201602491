package tarea3;

import java.util.Scanner;

/**
 *
 * @author Carlos Luna
 */
public class Menu {
    
    private boolean flag = true;
    private int opcion;
    
    public Menu(){
                
        System.out.println("TAREA 3");
        System.out.println("201602491");
        System.out.println("1. Usuarios");
        System.out.println("2. Palabras Palíndromas");
        System.out.println("3. Salir");
        
        while(flag){
                    
            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();
                  
            switch(opcion){
            
                case 1:                        
                    System.out.println("MENU DE USUARIOS");
                    System.out.println("1. Ingresar Usuarios");
                    System.out.println("2. Mostrar Todos Los Usuarios");
                    System.out.println("3. Mostrar Un Usuraio Personalizado");
                    System.out.println("4. Menu Principal");
                    System.out.println("5. Salir");                                                        
                break;
                
                case 2:
                    System.out.println("PALABRAS PALINDROMAS");
                    System.out.println("Ingresar Palabra");
                break;
                
                case 3:
                    flag = false;
                break;
            
            }
                       
        }
                
    }
    
}

package tarea3;

import java.util.Scanner;

/**
 *
 * @author Carlos Luna
 */
public class Menu {
    
    private boolean flag = true;
    
    private int opcion;
    private int opcionu;
    
    String vector[] = new String[5];
    boolean buscarp=false;
    String buscarn;
    
    private String palabra;
       
    private boolean flag2 = true;
       
   
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
                
                //USUARIOS
                
                case 1:
                    flag2=true;
                    System.out.println("MENU DE USUARIOS");
                    System.out.println("1. Ingresar Usuarios");
                    System.out.println("2. Mostrar Todos Los Usuarios");
                    System.out.println("3. Mostrar Un Usuraio Personalizado");
                    System.out.println("4. Menu Principal");
                    
                    while(flag2){
                        
                        Scanner scu = new Scanner(System.in);
                        opcionu = scu.nextInt();
                    
                        switch(opcionu){

                            case 1:
                                for(int i=0; i<vector.length; i++){
                                   System.out.println("Ingresar Usuario");
                                   Scanner sciu = new Scanner(System.in);
                                   vector[i] = sciu.nextLine();
                                }
                                System.out.println("MENU DE USUARIOS");
                                System.out.println("1. Ingresar Usuarios");
                                System.out.println("2. Mostrar Todos Los Usuarios");
                                System.out.println("3. Mostrar Un Usuraio Personalizado");
                                System.out.println("4. Menu Principal");
                            break;

                            case 2:
                                System.out.println("Todos los Usuarios");
                                for(int i=0; i<vector.length; i++){
                                    System.out.println(vector[i]);
                                }
                                System.out.println("MENU DE USUARIOS");
                                System.out.println("1. Ingresar Usuarios");
                                System.out.println("2. Mostrar Todos Los Usuarios");
                                System.out.println("3. Mostrar Un Usuraio Personalizado");
                                System.out.println("4. Menu Principal");
                            break;

                            case 3:
                                System.out.println("Mostrar Usuario Personalizado");
                                System.out.println("Ingresar Usuario");

                                Scanner scb = new Scanner(System.in);
                                buscarn = scb.nextLine();
                                boolean existe= false;
                                for(int i=0; i<vector.length; i++){
                                    if(buscarn.equalsIgnoreCase(vector[i])){
                                        existe=true;
                                        break;
                                    }
                                }
                                if(existe){
                                    System.out.println("Si existe este usuario");
                                }else{
                                     System.out.println("No existe este usuario");
                                }
                                
                                
                                System.out.println("MENU DE USUARIOS");
                                System.out.println("1. Ingresar Usuarios");
                                System.out.println("2. Mostrar Todos Los Usuarios");
                                System.out.println("3. Mostrar Un Usuraio Personalizado");
                                System.out.println("4. Menu Principal");
                            break;

                            case 4:
                                System.out.println("TAREA 3");
                                System.out.println("201602491");
                                System.out.println("1. Usuarios");
                                System.out.println("2. Palabras Palíndromas");
                                System.out.println("3. Salir");
                                flag2=false;
                            break;
                            
                        }
                    }
                break;
                
                //PALINDROMAS
                
                case 2:
                    
                    System.out.println("PALABRAS PALINDROMAS");
                    System.out.println("Ingresar Palabra");
                    
                    Scanner scp = new Scanner(System.in);
                    palabra = scp.nextLine();
                    String palabraInv = "";
                    for (int x=palabra.length()-1;x>=0;x--){
                        palabraInv = palabraInv + palabra.charAt(x);
                    }
                    
                    /*for(int i=0; i<palabra.length(); i++){
                        if(palabra.charAt(i) == palabra.charAt(palabra.length()-1-i)){
                            System.out.println("Es palindroma");
                        } 
                        else{
                            System.out.println("No es palindroma");
                        }
                    }*/
                    if(palabra.equals(palabraInv)){
                        System.out.println("Es palindroma");
                    } 
                    else{
                        System.out.println("No es palindroma");
                    }
                    System.out.println("TAREA 3");
                    System.out.println("201602491");
                    System.out.println("1. Usuarios");
                    System.out.println("2. Palabras Palíndromas");
                    System.out.println("3. Salir");
                    
                break;
                
                case 3:
                    flag = false;
                break;
            
            }

            
                
               
                    
           
        }
                
    }
}
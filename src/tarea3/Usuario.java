/**
 *
 * @author Carlos Luna
 */
package tarea3;

import java.util.Scanner;

public class Usuario {
    
    String vector[] = new String[4];
    boolean buscarp=false;
    String buscarn;
    
    public void Usuario(){
                    
        for(int i=0; i<vector.length; i++){
            System.out.println("Ingresar Usuario");
            Scanner scu = new Scanner(System.in);
            vector[i] = scu.nextLine();
        }   
    }
    
    public void Mostrar(){
        
        for(String e:vector){
            System.out.println("Todos los Usuarios");
            System.out.println(vector);
        }
    }
    
    public void Buscar(){
        
            System.out.println("Mostrar Usuario Personalizado");
            System.out.println("Ingresar Usuario");
            
            Scanner scb = new Scanner(System.in);
            buscarn = scb.nextLine();
            
            for(int i=0; i<vector.length; i++){
                if(buscarn.equalsIgnoreCase(vector[i])){
                    buscarp=true;
                }else{
                    System.out.println("No existe este usuario");
                }
            }
            
           // System.out.println(buscarp==true?buscarn:"No existe ese usuario.");
               
    }
}

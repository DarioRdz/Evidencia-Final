/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendacitas.cita;


import java.util.Scanner; 

/**
 *
 * @author DARIO
 */
public class paciente {
    
    String nombre, apellido;
    int edad; 
    Scanner leer= new Scanner (System.in); 
    
    public void crearPa(){
    
         System.out.println("\nNombre:");
         nombre= leer.next();
         System.out.println("\nApelleido");
         apellido= leer.next(); 
         System.out.println("\nEdad:");
         edad= leer.nextInt(); 
    
    }
    
    

}


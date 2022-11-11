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
public class doctor {
    
    String nombre, apellido, especialidad;  
   
    Scanner leer= new Scanner (System.in); 
    
    public void crearDoc(){
    
        System.out.println("\nNombre:");
         nombre= leer.next();
         System.out.println("\nApelleido");
         apellido= leer.next(); 
         System.out.println("\nEspecialidad:");
         especialidad= leer.next(); 
    
    }
    
}

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
public class agendarCita {
    
    String fecha, hora;
   
    Scanner leer= new Scanner(System.in); 
   
    public void agendarCita(){
       
        System.out.println("Ingrese fecha: dd/mm/yy");
        fecha= leer.next();
        System.out.println("Hora de la cita: 00:00 pm/am");
        hora= leer.next();
        
    
    }
}

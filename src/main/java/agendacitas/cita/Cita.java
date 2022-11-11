/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package agendacitas.cita;

import java.util.Iterator;
import java.util.HashMap; 
import java.util.Scanner; 
import java.io.*;


/**
 *
 * @author DARIO
 */
public class Cita {

    public static void main(String[] args) {
        int opciones, ban= 0; 
        Scanner leer= new Scanner (System.in); 
        String motivo;
        HashMap<String, String> lista_Pacientes= new HashMap<String, String>();
        System.out.println("----------------------Agendar cita----------------------\n");
        
        
        
        do {
        
           try{
               System.out.println("-------------Elija una opción-------------");
               System.out.println("Crear paciente----------presione-------[1]");
               System.out.println("Crear doctor------------presione-------[2]");
               System.out.println("Agendar cita------------presione-------[3]");
               System.out.println("Cargar datos------------presione-------[4]");
               System.out.println("Guardar datos-----------presione-------[5]");
               System.out.println("Ver lista de pacientes--presione-------[6]");
               System.out.println("Salir-------------------presione-------[7]");
              
               opciones= leer.nextInt(); 
               
               switch(opciones){
               
                   case 1:
                       paciente crearPa= new paciente(); 
                       crearPa.crearPa();
                       System.out.println("Paciente creado\n");
                       System.out.println("------------------\n");
                       break;
                   case 2:    
                       doctor crearDoc= new doctor(); 
                       crearDoc.crearDoc();
                       System.out.println("Doctor creado\n");
                       System.out.println("------------------\n");
                       break; 
                   case 3:     
                       agendarCita agendarCita= new agendarCita();
                       agendarCita.agendarCita();
                       System.out.println("Motivo de la cita");
                       motivo= leer.next();
                       System.out.println("\nSu cita ha sido registrada.\n");
                       break;
                   case 4:    
                       cargar(lista_Pacientes);
                       break;
                   case 5:    
                       guardar(lista_Pacientes);
                       break;
                   case 6:    
                       listaPacientes(lista_Pacientes);
                       break;
                   case 7:     
                       System.out.println("Saliendo...");
                       ban= 1; 
                       break;               
                   default:    
                       System.out.println("Elija una opción valida.");
                       break; 
               }   
           }
          catch(Exception e){
              System.out.println("Ha habido un error. Intentelo de nuevo.");   
          }
        }    
        while (ban == 0);
        }
       public static void listaPacientes(HashMap<String, String>lista_Pacientes){
              Iterator<String> iterator= lista_Pacientes.keySet(). iterator();
              System.out.println("Lista de pacientes:\n");
              System.out.println("  Nombre\t|\tApellido\t|\tEdad   ");
              System.out.println("------------------------");       
              while(iterator.hasNext()){ 
                 String key= iterator.next();
                 System.out.println("  "+key+"\t|\t"+lista_Pacientes.get(key)); 
              }    
       } 
       public static void guardar(HashMap<String, String>m){
       
             Iterator<String> iterator= m.keySet().iterator();
             String inputFilename = "C:\\Users\\daril\\OneDrive\\Documentos\\NetBeansProjects\\cita\\src\\main\\java\\agendacitas\\cita\\ListaPacientes.csv";  
             BufferedWriter bufferedWriter = null;       
             try{ 
                bufferedWriter= new BufferedWriter(new FileWriter(inputFilename));
                while(iterator.hasNext()){
                    String key= iterator.next();
                    bufferedWriter.write(key+","+m.get(key)+"\n");
                }     
             }  
             catch(IOException e){
                 System.out.println("IOException catched while writing: " + e.getMessage());      
             }  
             finally { 
                 try{
                     if(bufferedWriter != null){
                        bufferedWriter.close();
                        System.out.println("\nCambios guardados");
                     }
                 }
                 catch(IOException e) {
                 System.out.println("IOException catched while closing: " + e.getMessage());  
                 } 
             }
       }
       
       public static void cargar(HashMap<String, String>m){  
           String inputFilename= "C:\\Users\\daril\\OneDrive\\Documentos\\NetBeansProjects\\cita\\src\\main\\java\\agendacitas\\cita\\ListaPacientes.csv";
           String a[];
           BufferedReader bufferedReader= null;  
           try{
            bufferedReader = new BufferedReader(new FileReader(inputFilename));
            String line;
            while((line = bufferedReader.readLine()) != null){ 
                a=line.split(",");
                m.put(a[0],a[1]); 
            }  
           }
           catch (IOException e){
                 System.out.println("IOException catched while reading: " + e.getMessage());         
           }
           finally{
               try{
                   if (bufferedReader != null){
                    bufferedReader.close();
                    System.out.println("\nPacientes guardados"); 
                   }
               }
               catch(IOException e){
                   System.out.println("IOException catched while closing: " + e.getMessage());
               }
           }  
       }  
  }
    
    

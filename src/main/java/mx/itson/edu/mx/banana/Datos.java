/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mx.itson.edu.mx.banana;

import java.util.Scanner;

/**
 *
 * @author José Alvarez
 */
public class Datos {

    public static void main(String[] args) {
     
         
        /* En está parte del codigo lo que se hizo es importar la clase scanner para poder ingresarle los datos por consola
        gracias al método nextLine.*/
   
        System.out.println("Escribe los datos: ");
        Scanner scanner = new Scanner(System.in);{
        String datos = scanner.nextLine();
        
        
       
        /* En está parte del codigo lo que se hizo es implementar el array string donde se le asigna lo que retornará el método determinar
        de la clase RegistroDatos, lo cual permite mostrar los datos de la forma que queramos.*/
        
        String[]registro = new RegistroDatos().separar(datos);
        for(String r: registro){
        String[] datosSeparados = new RegistroDatos().deternminar(r);
            System.out.println("ID: "+datosSeparados[0]+" Nombre: "+datosSeparados[3]+" Apellido: "+datosSeparados[1]);
            
        }
        
        
    }
}
}
        
        
        
    


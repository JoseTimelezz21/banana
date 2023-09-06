/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.edu.mx.banana;

/**
 *
 * @author José Alvarez
 */
public class RegistroDatos {
       /* Lo que se hizo aquí fue un array string para poder ingresar los datos que se nos piden y utilizando el método split 
    para separar los datos con la coma.
    */
    
    public String[] separar(String datos){
 String[] registro = datos.split(",");
 return registro;
        
 
    
    }
    
    /* En está parte del codigo se realizo otro array string pero está vez para separar los datos por espacio.*/
    
    public String[]deternminar(String datos){
    String[]conjuntoDatos = datos.split(" ");
    return conjuntoDatos;
    }
}


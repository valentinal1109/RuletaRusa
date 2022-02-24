/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruletarusa;

import java.io.*;
/**
 *
 * @author Personal
 */
public class ingreso {

    public String leerInfo(String url){

        String texto = "";

          try{
                BufferedReader br = new BufferedReader(new FileReader(url));
                String temp = ""; //la variable temp sirve como punto de guardado del texto del archivo 
                String brRead;

              while((brRead = br.readLine()) != null){ //procesar todos los datos del txt

               temp = temp + brRead;

}
              texto = temp;

              }catch(Exception e){ System.err.println("Error al encontrar archivo");
}
             return texto;

}
}

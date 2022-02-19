/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruletarusa;

/**
 *
 * @author valentina
 */
public class jugador {
    public String nombre;
    
    Revolver arma= new Revolver();
    
    //------------- metodos ----
   
    public String getNombre()
    {
      return nombre;
    }
    
     public void setNombre(String nom)
    {
      nombre = nom;
    }
}


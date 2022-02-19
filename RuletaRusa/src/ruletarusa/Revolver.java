/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruletarusa;

/**
 *
 * @author valentina
 */
public class Revolver {
    
    int[] tambor = new int[6];
    
    //---------------------------------------------------
    
    public void cargar (int[] tambor){
    
    for(int i=0;i<6;i++)
    {
        tambor[i]= 0;
    }
    int min = 0;
    int max = 5; 
   
    int posicion_bala = (int)Math.floor(Math.random()*(max-min+1)+min);
      
    tambor[posicion_bala]=1;
    
    }
    
    //----------------------------------------------
    
   public boolean disparar(int[] tambor){
       
       if (tambor[0]==1)
       {
         return true;
       }
       else{
           return false;
       }
     
   }
      
     }
    
        
    
      
      

        
        
   
            


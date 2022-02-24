/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruletarusa;

/**
 *
 * @author valentina
 */


    
 
   public class node{
        node prev;
        String nombre;
        boolean vivo;
        node next;
        node(String nombre,boolean vivo){
        this.nombre=nombre;
        this.vivo=vivo;
       }
      
        node head, tail = null;
     
      public void addnode(String nombre, boolean vivo ) {  

      node node2 = new node(nombre, vivo);  
      node node3 = new node(nombre, vivo);
      node node4 = new node(nombre, vivo);
      node node5 = new node(nombre, vivo);
    
     
     //---- enlace nodos-----------
      
      if(head == null) {
      head = tail = node2;     
      head.prev = null;  
      tail.next = null;  
              
     }
    
      else { 
      tail.next = node2; 
      node2.prev = tail;
      tail = node2;
      tail.next = null; 
     }
      
      if(tail == null) {
      tail = tail = node3;     
      node3.prev = node2;  
      tail.next = null;  
              
     }
    
      else { 
      tail.next = node3; 
      node3.prev = node2;
      tail = node3;
      tail.next = null; 
     }  
      
      if(tail == null) {
      tail = tail = node4;     
      node4.prev = node3;  
      tail.next = null;  
              
     }
    
      else { 
      tail.next = node4; 
      node4.prev = node3;
      tail = node4;
      tail.next = null; 
     }     
      
      if(tail == null) {
      tail = tail = node5;     
      node5.prev = node4;  
      tail.next = null;  
              
     }
    
      else { 
      tail.next = node5; 
      node5.prev = node4;
      tail = node5;
      tail.next = null; 
     }      
      
      if(tail == null) {
      tail = tail = tail;     
      tail.prev = node5;  
      tail.next = null;  
              
     }
    
      else { 
      tail.next = tail; 
      tail.prev = node5;
      tail = tail;
      tail.next = null; 
     }     
      
      
         
     } 
        
   
        
     }
      

       
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


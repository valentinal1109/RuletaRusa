/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruletarusa;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Valentina Leon - Rafael Martinez
 */
public class main {


    public static void main(String[] args) {

       ingreso j = new ingreso();
       String listaJugadores = j.leerInfo("C:\\Users\\Personal\\Documents\\GitHub\\RuletaRusa\\src\\ruletarusa\\jugadores\\jugadores.txt");
                                         //url representa la posicion del archivo dentro del ordenador

       System.out.println(listaJugadores);



   }
}

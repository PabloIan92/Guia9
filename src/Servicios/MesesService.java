/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Meses;
import java.util.Scanner;

/**
 *
 * @author Lemmon
 */
public class MesesService {
    Scanner leer = new Scanner(System.in);
    public void adivinarMes(Meses mes){
     
        String mesSecreto = mes.getMesSecreto();
        String respuesta;
        do{
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");   
     respuesta = leer.next();
       if (respuesta.equals(mesSecreto)) {
                System.out.println("¡Ha acertado!");
                break;
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
            }
        } while (!respuesta.equals(mesSecreto));
   
}
}

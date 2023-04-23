/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej1ext;

import Entidades.Meses;
import Servicios.MesesService;

/**
 *
 * @author Lemmon
 */
public class Guia9Ej1Ext {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Meses mes = new Meses();
    MesesService servicios = new MesesService();
    servicios.adivinarMes(mes);
    }
    
}

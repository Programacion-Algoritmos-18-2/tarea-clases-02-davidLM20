/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.Scanner;

/**
 *
 * @author David Lopez
 */
public class Precio {

    /**
     * @param args the command line arguments
     */
    double euros;

    public double obtener() {
        return euros;
    }
    Scanner entrada = new Scanner(System.in);

    public void agregar(double x) {
        System.out.println("Ingrese el valor de euros:");
        euros = entrada.nextDouble();

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author David Lopez
 */
public class Ejecutor {

    public static void main(String[] args) {
        // TODO code application logic here
        Precio p;
        p = new Precio();
        double x = 0;
        p.agregar(x);
        System.out.println(p.obtener());
        p.euros = 10.1;
        System.out.println(p.euros);
        
    }
    
}

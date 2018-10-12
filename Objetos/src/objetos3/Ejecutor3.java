/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos3;

/**
 *
 * @author David Lopez
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        // se crea variable de tipo precio
        Precio3 p;
        //se estancia los objetos
        p = new Precio3();
        Precio3 m =new Precio3(2);
        Precio3 n =new Precio3(255);
        //se presenta las cantidades llamando los metodos 
        System.out.println(p.obtener());
        System.out.println(m.obtener());
        System.out.println(n.obtener());
    }

}

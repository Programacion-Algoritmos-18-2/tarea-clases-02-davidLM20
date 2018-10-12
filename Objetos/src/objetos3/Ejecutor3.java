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
        // TODO code application logic here
        Precio3 p;
        p = new Precio3();
        Precio3 m =new Precio3(2);
        Precio3 n =new Precio3(255);
        System.out.println(p.obtener());
        System.out.println(m.obtener());
        System.out.println(n.obtener());
    }

}

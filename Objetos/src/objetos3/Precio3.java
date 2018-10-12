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
public class Precio3 {

    private double euros;

    public double obtener() {
        return euros;
    }

    public void agregar(double x) {
        euros = x;

    }

    public Precio3() {
        agregar(30.2);

    }
    public Precio3(double y){
        agregar(y);
    }
}

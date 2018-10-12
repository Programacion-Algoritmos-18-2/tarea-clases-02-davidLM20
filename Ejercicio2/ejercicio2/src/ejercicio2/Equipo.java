/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author David Lopez
 */
public class Equipo {

    //se crea variables privadas de las clases
    private String nombre;
    private String num_jugadores;
    private String ciudad;
    //metodos 
    //metodos de obtencion de datos de cadaobjeto

    public String obtener_nombre() {
        return nombre;
    }

    public String obtener_ciudad() {
        return ciudad;
    }

    public String obtener_num_jugadores() {
        return num_jugadores;
    }

    //se gernera un costructor 
    public Equipo() {
        agregar_nombre("Liga de quito");
        agregar_num_jugadores("14");
        agregar_ciudad("Quito");
    }

    //metodos agragar valores
    public void agregar_nombre(String x) {
        nombre = x;
    }

    
    public void agregar_num_jugadores(String y) {
        num_jugadores = y;
    }

    public void agregar_ciudad(String z) {
        ciudad = z;
    }
    // metodo primero: sin parámetros, que agregue valores por defecto
    public Equipo(String x) {
        agregar_nombre(x);
    }
    // segundo: que reciba un parámetro para asignar valor a nombre
    public Equipo(String x, String y) {
        agregar_nombre(x);
        agregar_num_jugadores(y);
    }
    //tercero: que reciba dos parámetros para asignar valores a nombre y num_jugadores
    public Equipo(String x, String y, String z) {
        agregar_nombre(x);
        agregar_num_jugadores(y);
        agregar_ciudad(z);
    }

}

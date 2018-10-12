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
public class Ejecutor {

    public static void main(String[] args) {
        //se estancia los objetos
        Equipo e = new Equipo();
        // se presenta los valores de los parametros pre definidos
        System.out.printf("Nombre: %s - Jugadores: %s - Ciudad: %s\n", e.obtener_nombre(), e.obtener_num_jugadores(), e.obtener_ciudad());
        //se estancia el segundo objeto
        Equipo e2 = new Equipo("Liga de Loja");
        // el llamado del metodo agregar
        e2.agregar_num_jugadores("20");
        e2.agregar_ciudad("Loja");
        //se presenta valores
        System.out.printf("Nombre %s - Jugadores %s - Ciudad %s\n", e2.obtener_nombre(), e2.obtener_num_jugadores(), e2.obtener_ciudad());
        //se estancia el tercer objeteo
        Equipo e3 = new Equipo("Ballenita", "23");
        // el llamado del metodo agregar
        e3.agregar_ciudad("Enchufe");
        //se presentaresultados
        System.out.printf("Nombre: %s - Jugadores: %s - Ciudad: %s\n", e3.obtener_nombre(), e3.obtener_num_jugadores(), e3.obtener_ciudad());

        //se estancia el cuarto objeto
        Equipo e4 = new Equipo("Delfin", "15", "Manta");
        //se presenta resultados 
        System.out.printf("Nombre: %s - Jugadores: %s - Ciudad: %s\n", e4.obtener_nombre(), e4.obtener_num_jugadores(), e4.obtener_ciudad());

    }

}

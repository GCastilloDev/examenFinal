/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal;

import java.util.Scanner;

/**
 *
 * @author tavoGeek
 */
public class ExamenFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String origen = "";
        String destino = "";

        System.out.println("Bienvenido al sistema");
        System.out.println("Ingresa el origen");
        origen = leer.next();
        System.out.println("Ingresa el destino");
        destino = leer.next();

        FacadeServicios servicios = FacadeServicios.getInstance();
        servicios.cotizacionViaje(origen, destino);
    }

}

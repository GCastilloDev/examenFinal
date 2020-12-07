package examenfinal;


import examenfinal.Hotel;
import examenfinal.Transporte;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tavoGeek
 */
public class FacadeServicios {

    private static FacadeServicios facadeServiciosInstance = null;

    private FacadeServicios() {

    }

    public static FacadeServicios getInstance() {
        if (facadeServiciosInstance == null) {
            facadeServiciosInstance = new FacadeServicios();
        }

        return facadeServiciosInstance;
    }
    
    public void cotizacionViaje(String origen, String destino) {
        Hotel hotel = new Hotel(destino);
        Transporte transporte = new Transporte(origen, destino);
        
        float costoHotel = hotel.getCosto();
        float costoTransporte = transporte.getCosto();
        float total = costoHotel + costoTransporte;
        
        System.out.println("-------- COTIZACION --------");
        System.out.println("Origen: " + transporte.getOrigen());
        System.out.println("Destino: " + transporte.getDestino());
        System.out.println("");
        System.out.println("Costo hotel: $" + costoHotel);
        System.out.println("Costo transporte: $" + costoTransporte);
        System.out.println("Total: $" + total);
    }

}


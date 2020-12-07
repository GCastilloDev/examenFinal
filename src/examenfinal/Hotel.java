/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal;

/**
 *
 * @author tavoGeek
 */
public class Hotel implements IServicios {

    private String destino;

    public Hotel(String destino) {
        this.destino = destino;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public float getCosto() {
        return (float) (Math.random() * (1500 - 600)) + 600;
    }

}

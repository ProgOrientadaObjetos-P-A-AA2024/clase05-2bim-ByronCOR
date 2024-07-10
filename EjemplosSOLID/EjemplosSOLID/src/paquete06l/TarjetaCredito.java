/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06l;

/**
 *
 * @author reroes
 */
public class TarjetaCredito {

    private String nombre;
    private String tarjeta;

    public TarjetaCredito(String nombre, String tar) {
        tarjeta = tar;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerTarjeta(String n) {
        tarjeta = n;
    }

    public String obtenerTarjeta() {
        return tarjeta;
    }

    public String obtenerNombre() {
        return nombre;
    }

}

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
    private Banco banco;

    public TarjetaCredito(Banco ban,String nombre, String tar) {
        tarjeta = tar;
        banco= ban;
    }

    public void establecerNombreBanco(Banco n) {
        banco = n;
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

    public Banco obtenerNombreBanco() {
        return banco;
    }

    public String obtenerNombre() {
        return nombre;
    }

}

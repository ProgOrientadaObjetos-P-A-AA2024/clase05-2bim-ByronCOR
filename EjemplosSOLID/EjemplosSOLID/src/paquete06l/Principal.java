/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06l;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        Banco b1= new Banco();
        b1.establecerNombreBanco("PICHINCHA");
        TarjetaCredito t1 = new TarjetaCredito(b1,"Visa","110001212121");

        MayorEdad representante = new MayorEdad("José",t1);
        
        MenorEdad menor = new MenorEdad("Felipe", representante);
        
        
        System.out.printf("Nombre:%s - Tarjeta:%s\n",
                menor.obtenerNombre(), 
                menor.obtenerRepresentante().obtenerTarjeta().obtenerNombreBanco());
        
    }
}

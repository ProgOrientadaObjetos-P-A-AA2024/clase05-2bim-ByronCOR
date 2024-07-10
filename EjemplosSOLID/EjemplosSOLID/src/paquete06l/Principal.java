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
        b1.establecerNombreBanco("BANCO PICHINCHA");
    
        
        TarjetaCredito t1 = new TarjetaCredito(b1,"Visa","110001212121");

        MayorEdad representante = new MayorEdad("José",t1);
        
        MenorEdad menor = new MenorEdad("Felipe", representante);
        
        
        System.out.printf("Nombre:%s - Tarjeta:%s %s\n",
                menor.obtenerNombre(), 
                menor.obtenerRepresentante().obtenerTarjeta().obtenerTarjeta(),
                menor.obtenerRepresentante().obtenerTarjeta().obtenerNombreBanco().obtenerNombre());
        
    }
}

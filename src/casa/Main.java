/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casa;

/**
 *
 * @author richa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persiana persiana = new Persiana("Gris");
        Ventana ventana = new Ventana("Blanco", persiana);
        Puerta puerta = new Puerta(true,1234);
        Calefactor calefactor = new Calefactor();
        
        Casa casa1 = new Casa(80.15, puerta, ventana, calefactor);
        
        casa1.sell();
        casa1.getPuerta().openCodig();
        casa1.getVentana().openWindow();
        casa1.getVentana().getPersiana().up();
        casa1.getCalefactor().fijarTemperatura(25.5);
        casa1.getCalefactor().turnOff();
    }
    
}

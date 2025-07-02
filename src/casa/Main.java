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
        
        CasaDeCampo miFinca = new CasaDeCampo(80.15, puerta, ventana, calefactor, 10);
        
        miFinca.sell();
        miFinca.getPuerta().openCodig();
        miFinca.getVentana().openWindow();
        miFinca.getVentana().getPersiana().up();
        miFinca.getCalefactor().fijarTemperatura(25.5);
        miFinca.getCalefactor().turnOff();
        miFinca.cultivar();
    }
    
}

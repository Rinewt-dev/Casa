/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa;

/**
 *
 * @author richa
 */
public class Casa {

    private double areaCuadrada;
    private Puerta puerta;
    private Ventana ventana;
    private Calefactor calefactor;
    
    public Casa(double areaCuadrada, Puerta puerta, Ventana ventana, Calefactor calefactor){
        this.areaCuadrada = areaCuadrada;
        this.puerta = puerta;
        this.ventana = ventana;
        this.calefactor = calefactor;
    }
    
    public void sell(){
        System.out.println("Casa vendida ");
    }
    
    public Puerta getPuerta(){
        
        return puerta;
    }
    
    public Ventana getVentana(){
        return ventana;
    }
    
    public Calefactor getCalefactor() {
        return calefactor;
    }

}

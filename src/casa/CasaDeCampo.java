/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa;

/**
 *
 * @author richa
 */
public class CasaDeCampo extends Casa {
    
    private int hectareasDeTerreno;

    public CasaDeCampo(double areaCuadrada, Puerta puerta, Ventana ventana, Calefactor calefactor, int hectareas) {
        super(areaCuadrada, puerta, ventana, calefactor);
        
        this.hectareasDeTerreno = hectareas;
    }
    
    @Override
    public void mostrarDetalles(){
        System.out.println("Casa de Campo con " + this.hectareasDeTerreno + " hectareas.");
    }
    
    public void cultivar(){
        System.out.println("Cultivando en la tierra nuestra " + this.hectareasDeTerreno + " hectareas.");
    }    
    
    
    
}

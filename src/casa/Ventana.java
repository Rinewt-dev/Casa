/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa;

/**
 *
 * @author richa
 */
public class Ventana {
    
    private String colorMarco;
    private Persiana persiana;
    
    public Ventana(String color, Persiana persiana){
        this.colorMarco = colorMarco;
        this.persiana = persiana;
    }
    
    public void openWindow(){
        System.out.println("Abriendo ventana... ");
    }
    
    public void closeWindow(){
        System.out.println("Cerrando ventana... ");
    }
    
    public Persiana getPersiana(){
        return persiana;
        
    }
    
}

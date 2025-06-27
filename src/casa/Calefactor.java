/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa;

/**
 *
 * @author richa
 */
public class Calefactor {    
    
    private double temp;
    
    public void fijarTemperatura(double temper){
        this.temp = temper;
        System.out.println("Su temperatura ah sido fijada a "+ temp + "° ");
    }
    
    public void turnOn(){
        System.out.println("Calefactor encendido ");
        
    }
    
    public void turnOff(){
        System.out.println("Calefactor apagado ");
        
    }
}

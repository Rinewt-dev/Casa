/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa;

/**
 *
 * @author richa
 */
public class Persiana {
    private String color;
    
    public Persiana(String col){
       this.color = col;
    }
    
    public void up(){
        System.out.println("Subiendo persiana... ");
        
    }
    
    public void down(){
        System.out.println("Bajando Persiana... ");
    }
}

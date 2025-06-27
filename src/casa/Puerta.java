/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa;
import java.util.*;
/**
 *
 * @author richa
 */
public class Puerta {
    static Scanner scanner = new Scanner(System.in);
    private int codigoAcceso;
    private boolean iswood;
    
    public Puerta(boolean iswood, int codigoAcesso){
        this.iswood = iswood;
        this.codigoAcceso = codigoAcesso;
    }
    
    public void openCodig(int codigo){
        System.out.println("Introduzca el codigo para abrir la puerta: ");
        int codigoIngresado = scanner.nextInt();
        if(codigoIngresado == codigoAcceso){
            System.out.println("Puerta abierta ");
        }else{
            System.out.println("Codigo invalido. Acesso Denegado");
        }
        
    }
    
    public void close(){
        System.out.println("puerta Cerrada ");
    }
    
}

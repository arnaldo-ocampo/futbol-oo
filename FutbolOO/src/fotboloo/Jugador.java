/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fotboloo;

/**
 *
 * @author Arnaldo
 */
public abstract class Jugador {
    
    private String queja = "Ayyyy que dolor";
    
    public abstract void festejar();
    
    public void actuar(){
        System.out.println(queja); 
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcv;

/**
 *
 * @author Oscar
 */
public class Producto {
private String nombre; 


//constructor de la clase producto

public Producto(String s) { 
nombre = s; 

                                 } 

    Producto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//método de la clase object
public String toString(){
return ("Producto: "+nombre); 
}
}

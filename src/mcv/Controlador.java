/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import mcv.Vista.*;

/**
 *
 * @author Oscar
 */
public class Controlador {
    public void Escribir() throws IOException 
{ 

Producto produ = new Producto();

// Definir un ArrayList llamado lista
ArrayList lista = new ArrayList(); 

// Agregamos estas instancias al ArrayList con el método add 
lista.add(produ); 
 
// Mostramos el número de objetos de la colección mediante el método size.
try
 {
 FileWriter Archivo = new FileWriter("C:/prueba.txt"); 
 PrintWriter pw = new PrintWriter(Archivo);
 pw.println(" Lista del mercado para comprar " + lista.size() + " productos"); 
 pw.close();
 } catch (Exception e)
 {
 e.printStackTrace();
 }
System.out.println(" Lista del mercado para comprar " + lista.size() + 
" productos"); 

 
Iterator it = lista.iterator();

while ( it.hasNext() ) { 
Object objeto = it.next(); 
Producto producto = (Producto)objeto; 
FileWriter Archivo = new FileWriter("C:/prueba.txt"); 
 PrintWriter pw = new PrintWriter(Archivo);
 pw.println(producto); 
}
while ( it.hasNext() ) { 
Object objeto = it.next(); 
Producto producto = (Producto)objeto; 
System.out.println(producto); 
}}
    public static void leer(){
            File archivo = null;
 FileReader fr = null;
try {
 archivo = new File ("C:/prueba.txt");
String linea;
fr = new FileReader (archivo);
BufferedReader br = new BufferedReader(fr);while((linea=br.readLine())!=null)
System.out.println(linea);
}
catch(IOException e){
 System.out.println(e);
 }finally{
 try{ 
 if( fr != null){ 
 fr.close(); 
 } 
 }catch (IOException e){ 
 System.out.println(e);
 }
}
}

   
}

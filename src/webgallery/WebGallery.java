/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webgallery;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class WebGallery {


    public static void main(String[] args) {
        
        
        try {
            Scanner lectura = new Scanner(new File("obras.txt"));
            valortotalobras()
        } catch (FileNotFoundException ex) {
            
        // TODO code application logic here
    }
    
}

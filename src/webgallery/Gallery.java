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
public class Gallery {
    private Obra[] coleecionobra;
    private Artista[] Artistas;

    public Gallery(Obra coleecionobra, Artista Artistas) {
        this.coleecionobra = new Obra[10];
        this.Artistas =new Artista[10];
    }
    public String[] obrasregistradasporartista(String artista){
    for(int i=1; i<10; i++){
      if (this.Artistas[i].getNombre().equals(artista)){
          return (this.Artistas[i].obrasregistradas);
      }   
    }     
} 

    public double valortotalobras(Scanner precios){
    precios.useDelimiter(",");
    double total=0;
    
    while (precios.hasNextInt())
        if(precios.nextInt()>10){
            total+= precios.nextDouble();
        }
    return total;
}          
} 


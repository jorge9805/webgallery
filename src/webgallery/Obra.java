/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webgallery;

/**
 *
 * @author ESTUDIANTE
 */
public class Obra {
    private String nombre;
    private String tecnica;
    private double precio;

    public Obra(String nombre, String tecnica, int precio) {
        this.nombre = nombre;
        this.tecnica = tecnica;
        this.precio = precio;
    }
    public double cacularvalorfinal(){
        double preciofinal;
        preciofinal = this.precio*0.2;
        return preciofinal;
    }
}

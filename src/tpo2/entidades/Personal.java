/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpo2.entidades;

/**
 *
 * @author Rebeca
 */
public class Personal {
    public String nombre;
    public int id;
    public char local;

    public Personal(String nombre, int id, char local) {
        this.nombre = nombre;
        this.id = id;
        this.local = local;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public char getLocal() {
        return local;
    }
    
}

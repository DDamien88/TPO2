/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpo2.entidades;

/**
 *
 * @author emanu
 */
public class empleados {
    private int cantidad;
    private String sueldos;
    private int [] datos;

    public empleados(int cantidad, String sueldos, int[] datos) {
        this.cantidad = cantidad;
        this.sueldos = sueldos;
        this.datos = datos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getSueldos() {
        return sueldos;
    }

    public void setSueldos(String sueldos) {
        this.sueldos = sueldos;
    }

    public int[] getDatos() {
        return datos;
    }

    public void setDatos(int[] datos) {
        this.datos = datos;
    }
    
    
}

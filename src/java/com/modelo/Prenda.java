package com.modelo;

public class Prenda {

    private String nombre;
    private String talla;
    private String color;
    private int precio;
    private int cantidad;

    public Prenda() {
    }

    public Prenda(int cantidad) {
        this.cantidad = cantidad;
    }

    public Prenda(String nombre, String talla, String color, int precio, int cantidad) {
        this.nombre = nombre;
        this.talla = talla;
        this.color = color;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}

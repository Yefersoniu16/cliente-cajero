/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iudigital.aplicacion.compra.cliente.producto;

import java.util.List;


public class ClienteProducto {
    
    private final String nombre;
    private final List<Producto> producto;

    public ClienteProducto(String nombre, List<Producto> producto) {
        this.nombre = nombre;
        this.producto = producto;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Producto> getProducto() {
        return producto;
    }

    
    
}

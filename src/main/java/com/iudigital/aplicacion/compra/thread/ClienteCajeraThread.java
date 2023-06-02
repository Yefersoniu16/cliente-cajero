package com.iudigital.aplicacion.compra.thread;

import com.iudigital.aplicacion.compra.CajeraProducto;
import com.iudigital.aplicacion.compra.cliente.producto.ClienteProducto;
import com.iudigital.aplicacion.compra.cliente.producto.Producto;
import java.util.ArrayList;
import java.util.List;

public class ClienteCajeraThread {

    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        setProductos(productos);

        ClienteProducto cliente1 = new ClienteProducto("Marlon", productos);
        ClienteProducto cliente2 = new ClienteProducto("Juan", productos);

        long tiempoInicial = System.currentTimeMillis();
        CajeraThreadProducto cajera1 = new CajeraThreadProducto("Maria", cliente1, tiempoInicial);
        CajeraThreadProducto cajera2 = new CajeraThreadProducto("Natalia", cliente2, tiempoInicial);

        cajera1.start();
        cajera2.start();

    }

    public static void setProductos(List<Producto> productos) {

        Producto p1 = new Producto("Frijoles", 10000, 5);
        Producto p2 = new Producto("Lentejas", 6000, 7);
        Producto p3 = new Producto("Garvanzo", 8000, 4);

        productos.add(p1);
        productos.add(p2);
        productos.add(p3);

    }
}

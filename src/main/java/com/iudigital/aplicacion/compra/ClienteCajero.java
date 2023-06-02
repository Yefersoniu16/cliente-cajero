package com.iudigital.aplicacion.compra;

import com.iudigital.aplicacion.compra.cliente.producto.ClienteProducto;
import com.iudigital.aplicacion.compra.cliente.producto.Producto;
import java.util.ArrayList;
import java.util.List;

public class ClienteCajero {

    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();
        setProductos(productos);

        ClienteProducto cliente1 = new ClienteProducto("Marlon", productos);
        ClienteProducto cliente2 = new ClienteProducto("Juan", productos);

        long tiempoInicial = System.currentTimeMillis();
        CajeraProducto cajera1 = new CajeraProducto("Maria");
        CajeraProducto cajera2 = new CajeraProducto("Natalia");

        cajera1.procesarCompra(cliente1, tiempoInicial);
        cajera2.procesarCompra(cliente2, tiempoInicial);
    }

    private static void setProductos(List<Producto> productos) {
        Producto producto1 = new Producto("Platano", 1200, 5);
        Producto producto2 = new Producto("Coco", 2000, 2);
        Producto producto3 = new Producto("panela", 2000, 5);

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
    



    }
}

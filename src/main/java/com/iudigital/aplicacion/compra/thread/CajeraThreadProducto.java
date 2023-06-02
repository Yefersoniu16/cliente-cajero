
package com.iudigital.aplicacion.compra.thread;

import com.iudigital.aplicacion.compra.cliente.producto.ClienteProducto;
import com.iudigital.aplicacion.compra.cliente.producto.Producto;


public class CajeraThreadProducto extends Thread{
    
    private String nombre;
    private ClienteProducto cliente;
    private long tiempoInicial;

    public CajeraThreadProducto(String nombre, ClienteProducto cliente, long tiempoInicial) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.tiempoInicial = tiempoInicial;
    }
    
    @Override
    public void run(){
        System.out.println("La cajera " + this.nombre 
                + " Comienza a procesar la compra del cliente " 
                + this.cliente.getNombre() + " en el tiempo: "
                + (System.currentTimeMillis() - this.tiempoInicial) / 1000 + "seg");
        
        
          int contCliente = 1;  
        for (Producto producto : cliente.getProducto()) {
            this.esperarXsegundo();
            System.out.println(" Procesado el producto " + contCliente 
                    + " nombre producto " + producto.getNombre()
                    + " precio producto " + producto.getPrecio()
                    + " cantidad de productos " + producto.getCantidad()
                    + " costo total del producto " + producto.getPrecio()
                    + " costo total del producto " + producto.getCantidad() * producto.getPrecio()
                    + " ->Tiempo: " + (System.currentTimeMillis() - this.tiempoInicial) / 1000 + " seg " );
            contCliente++;
        }
        
         System.out.println(" la cajera " + this.nombre + " ha terminado de procesar " 
                + this.cliente.getNombre() + " en el tiempo " 
                + (System.currentTimeMillis() - this.tiempoInicial) / 1000 + " seg ");
           
            
    }
    private void esperarXsegundo() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
          
        }
    }
}

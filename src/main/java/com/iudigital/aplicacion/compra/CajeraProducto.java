
package com.iudigital.aplicacion.compra;

import com.iudigital.aplicacion.compra.cliente.producto.ClienteProducto;
import com.iudigital.aplicacion.compra.cliente.producto.Producto;


public class CajeraProducto {
    
    private String nombre;

    public CajeraProducto(String nombre) {
        this.nombre = nombre;
    }
    
    public void procesarCompra (ClienteProducto cliente, long timeStamp){
        
        System.out.println("La cajera " + this.nombre 
                + " Comienza a procesar la compra del cliente " 
                + cliente.getNombre() + " en el tiempo: "
                + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");
        
        int contCliente = 1;
        for (Producto producto : cliente.getProducto()) {
            this.esperarXsegundo();
            System.out.println(" Procesado el producto " + contCliente++ 
                    + " nombre producto " + producto.getNombre()
                    + " precio producto " + producto.getPrecio()
                    + " cantidad de productos " + producto.getCantidad()
                    + " costo total del producto " + producto.getPrecio()
                    + " costo total del producto " + producto.getCantidad() * producto.getPrecio()
                     + " ->Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + " seg "
            );
           
                
        
        }
        System.out.println(" la cajera " + this.nombre + " ha terminado de procesar " 
                + cliente.getNombre() + " en el tiempo " 
                + (System.currentTimeMillis() - timeStamp) / 1000 + " seg "
        
        );
            
    }
    
    private void esperarXsegundo() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
          
        }
    }
    
}

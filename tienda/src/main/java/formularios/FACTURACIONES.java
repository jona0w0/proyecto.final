package formularios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class FACTURACIONES {
    
    private String producto;
    private Double precio;
    private Double cantidad;

    

    public FACTURACIONES() {}
       
    

    
    
    

    public FACTURACIONES( String producto, Double precio, Double cantidad) {
        
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

 

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

 
    public String getProducto() {
        return producto;
    }

    public Double getPrecio() {
        return precio;
    }

    public Double getCantidad() {
        return cantidad;
    }
    
    
}

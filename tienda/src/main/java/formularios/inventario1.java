/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

/**
 *
 * @author Usuario
 */
public class inventario1 extends productos1  {

    private String disponible;
public inventario1(){}
    public inventario1(String disponible, String nombre, String codigo, String precio, String cantidad) {
        super(nombre, codigo, precio, cantidad);
        this.disponible = disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }

    public String getDisponible() {
        return disponible;
    }
    
    
    

    
       
  
    
    
}


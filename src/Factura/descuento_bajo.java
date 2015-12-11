/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factura;

/**
 *
 * @author USUARIO1
 */
public class descuento_bajo extends Descuento {
    

    public descuento_bajo(double subtotal) {
        super(subtotal);
    }

    @Override
    public double calcularDescuento() {
        return 0; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

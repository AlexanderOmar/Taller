/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factura;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author USUARIO1
 */
public class Descuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    private double subtotal;

    public Descuento() {
    }

    public Descuento(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    public double calcularDescuento(){
        double desc = (2.5/100);
                //0.0025;
        LocalDate fechaActual =LocalDate.now();
        if(fechaActual.getMonth()== Month.FEBRUARY){
            desc += (3.5/100);
        }
        return desc;
    }
    
  
    
    public double calcularTotal(){
        double valoriva=subtotal*(12.0/100);
        double valordesc = calcularDescuento()*subtotal;
                double total = subtotal - valordesc + valoriva;
                return total;
    }
}
    



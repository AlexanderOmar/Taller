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
public class DescuentoAlto extends Descuento{

    public DescuentoAlto(double subtotal) {
        super(subtotal);
    }

    @Override
    public double calcularDescuento() {
        double desc = super.calcularDescuento();
        LocalDate fecha = LocalDate.now();
                if(fecha.getMonth()== Month.NOVEMBER
                        || fecha.getMonth()==Month.OCTOBER){
                    desc += (5/100);
                }
               
        return desc; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factura;

/**
 *
 * @author LSD_PCO5
 */
public class Resultados {
    
    /*caso 1 con descuento de 1000 fecha abril
    caso2 desc 1000
    fecha enero para A B,C */
     public static void main(String[] args) {
      /* DescuentoAlto e=new DescuentoAlto(1000);
       DescuentoMedio s=new DescuentoMedio(1000);
       descuento_bajo n=new descuento_bajo(1000);*/
       DescuentoAlto a=new DescuentoAlto(10000);
       DescuentoMedio b=new DescuentoMedio(10000);
       descuento_bajo c=new descuento_bajo(10000);
        /* System.out.print("total " +e.calcularTotal()+" \n");
          System.out.print("total " +s.calcularTotal()+" \n");
          System.out.print("total " +n.calcularTotal()+" \n");
       System.out.print("________________________________________ \n");*/
         
          System.out.print("total " +a.calcularTotal()+" \n");
          System.out.print("total " +b.calcularTotal()+" \n");
          System.out.print("total " +c.calcularTotal()+" \n");
        
         
         
    }
}
